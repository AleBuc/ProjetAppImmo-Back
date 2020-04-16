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

import AppImmo.entities.BienImmo;
import AppImmo.entities.Proprietaire;
import AppImmo.service.IProprietaireService;

@RestController
@RequestMapping("/apiProprietaire")
@CrossOrigin(origins = "http://localhost:4200/")
public class ProprietaireWebService {
	
	@Autowired
	@Qualifier("proprietaireservice")
	private IProprietaireService service;
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public Proprietaire add(@RequestBody Proprietaire p) {
		return service.add(p);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.PUT)
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
	
	@RequestMapping(value="/proprietaires", method = RequestMethod.GET)
	public List<Proprietaire> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value="/bienproprio/{id}", method = RequestMethod.GET)
	public List<BienImmo> bienProprio(@PathVariable long id) {
		return service.bienProprio(id);
	
	}

}
