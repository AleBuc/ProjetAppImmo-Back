package AppImmo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import AppImmo.entities.Personne;
import AppImmo.service.IPersonneService;

@RestController
@RequestMapping("/apiPersonne")
@CrossOrigin("*")
public class PersonneWebservice {
	
	@Autowired 
	@Qualifier("personneservice")
	private IPersonneService service;
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public Personne add(@RequestBody Personne p) {
		return service.add(p);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public Personne update(@RequestBody Personne p) {
		return service.update(p);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/personne/{id}", method = RequestMethod.GET)
	public Personne getById(@PathVariable long id) {
		return service.getById(id);
	}
	
	@RequestMapping(value="/personnes", method = RequestMethod.GET)
	public List<Personne> findAll() {
		return service.findAll();
	}

}
