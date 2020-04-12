package AppImmo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import AppImmo.enums.RoleEnum;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	private final String adminRole = RoleEnum.ADMIN.name();
	
	@Autowired
	private final UserDetailsService userDetailsService;
	
	public WebSecurityConfig(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@Bean(name = "passwordEncoder")
	public PasswordEncoder passwordEncoder() { //spécifie le type d'encodage du mot de passe
		return new BCryptPasswordEncoder();
	}
	
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception { //spécifie à Spring Security  le service UserDetailService et le type d'encodage du mot de passe à employer
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception { //précise les règles d'accès
		http.authorizeRequests()
				.antMatchers("/auth**").authenticated() //url accessible que si connecté
				.antMatchers("/auth/admin**").hasAuthority(adminRole) //url accessible uniquement par les admins
				.anyRequest().permitAll() //les autres pages sont accessibles à tous
			.and()
				.formLogin().loginPage("/login").defaultSuccessUrl("/auth").failureUrl("/login") //page de login et comportement
				.usernameParameter("login").passwordParameter("password")
			.and()
				.logout().invalidateHttpSession(true) // paramètres de déconnexion
				.logoutUrl("/logout") //url de déconnexion, accessible uniquement en POST si la protection CSRF est activée
				.logoutSuccessUrl("/login")
			.and()
				.csrf() // sécurité attaque CSRF activée
			.and()
				.sessionManagement().maximumSessions(1).expiredUrl("/login"); //délai d'expiration précisé dans application.properties
		
		
	}

}
