package AppImmo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import AppImmo.entities.Proprietaire;
import AppImmo.service.IProprietaireService;

@RestController
@RequestMapping("/apiProprietaire")
@CrossOrigin("*")
public class ProprietaireWebService {
	
	@Autowired IProprietaireService service;
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public Proprietaire add(@RequestBody Proprietaire p) {
		return service.add(p);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public Proprietaire update(@RequestBody Proprietaire p) {
		return service.update(p);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/proprietaire/{id}", method = RequestMethod.GET)
	public Proprietaire getById(@PathVariable long id) {
		return service.getById(id);
	}
	
	@RequestMapping(value="/proprietaire/{id}", method = RequestMethod.GET)
	public List<Proprietaire> findAll() {
		return service.findAll();
	}
	
	

}
