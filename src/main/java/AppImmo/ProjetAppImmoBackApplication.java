package AppImmo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import AppImmo.entities.Client;
import AppImmo.repositories.IBienImmoRepository;
import AppImmo.repositories.IClientRepository;
import AppImmo.repositories.IProprietaireRepository;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 
public class ProjetAppImmoBackApplication implements CommandLineRunner {
		
	@Autowired
	@Qualifier("birepo")
	private IBienImmoRepository birepo;
	
	@Autowired
	@Qualifier("proprietairerepo")
	private IProprietaireRepository prepo;
	
	@Autowired
	@Qualifier("clientrepo")
	private IClientRepository crepo;
	
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("AppImmo")).build();
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjetAppImmoBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		BienImmo bi = new BienImmo();
//		Proprietaire p = new Proprietaire();
//		
//		bi.setTypeBien("maison");
//		bi.setModeOffre("vente");
//		bi.setDateSoumission(new SimpleDateFormat("yyyy-MM-dd").parse("2020-04-15"));
//		bi.setStatut("disponible");
//		
//		birepo.save(bi);
//		
//		p.setNom("Macron");
//		p.setPrenom("Bertrand");
//		prepo.save(p);
//		
//		System.out.println(prepo.findAll());
//		
		Client c = new Client();
		c.setNom("Macron");
		c.setPrenom("Bertrand");
		crepo.save(c);
		
		System.out.println(crepo.findAll());
					
		
	}
	
}
