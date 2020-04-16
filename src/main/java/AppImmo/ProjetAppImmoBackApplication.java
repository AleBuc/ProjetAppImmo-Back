package AppImmo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import AppImmo.entities.ClasseStandard;
import AppImmo.entities.Client;
import AppImmo.service.IClasseStandardService;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ProjetAppImmoBackApplication implements CommandLineRunner {

	//@Autowired
	//@Qualifier("biservice")
	//private IBienImmoService bienimmoService;
	
	//@Autowired
	//@Qualifier("vservice")
	//private IVisiteService visiteService;
	
	//@Autowired
	//@Qualifier("clientservice")
	//private IClientService clientService;
	
	@Autowired
	@Qualifier("csservice")
	private IClasseStandardService cstandardService;

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("AppImmo"))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetAppImmoBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		ClasseStandard cs = new ClasseStandard();
		List<Client> list = new ArrayList<Client>();
		Client c = new Client();
		c.setId(10);
		Client c1 = new Client();
		c1.setId(12);
		Client c2 = new Client();
		c2.setId(11);
		list.add(c);
		list.add(c1);
		list.add(c2);


		cs.setIdClasse(14);
		cs.setClient(list);
		//BienImmo i = new BienImmo();
		//Client c = new Client();
		//Visite v = new Visite();
		
		//c.setId(8);
		//v.setIdVisite(4);
		//v.setBien(i);
		//v.setClient(c);
		//i.setIdBien(4);
		//i.setStatut("disponible");
		
		
		//bienimmoService.saveOrUpdate(i);
		//visiteService.saveOrUpdate(v);
		//clientService.add(c);
		
		cstandardService.saveOrUpdate(cs);
		

	}

}
