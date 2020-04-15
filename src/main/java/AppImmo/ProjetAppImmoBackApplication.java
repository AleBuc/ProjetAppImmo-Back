package AppImmo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import AppImmo.entities.BienImmo;
import AppImmo.entities.Proprietaire;
import AppImmo.service.IBienImmoService;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProjetAppImmoBackApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("biservice")
	private IBienImmoService bienimmoService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetAppImmoBackApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("AppImmo"))
				.build();
	}

	@Override
	public void run(String... args) throws Exception {
		BienImmo i = new BienImmo();
		Proprietaire p = new Proprietaire();
		p.setId(1);
		i.setIdBien(8);
		i.setStatut("disponible");
		i.setProprietaire(p);
		bienimmoService.saveOrUpdate(i);

		// conseillerService.findAll();
	}

}
