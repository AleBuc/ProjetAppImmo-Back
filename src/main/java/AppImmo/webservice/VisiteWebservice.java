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

import AppImmo.entities.Visite;
import AppImmo.service.IVisiteService;

@RestController
@RequestMapping("/apiVisite")
@CrossOrigin(origins = "http://localhost:4200/")
public class VisiteWebservice {
	
	@Autowired
	@Qualifier("vservice")
	private IVisiteService service;

	@RequestMapping(value = "/ajout", method = RequestMethod.POST)
	public Visite ajout(@RequestBody Visite v) {
		return service.saveOrUpdate(v);

	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Visite update(@RequestBody Visite v) {
		return service.saveOrUpdate(v);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}

	@RequestMapping(value = "/visite/{id}", method = RequestMethod.GET)
	public Visite getById(@PathVariable long id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/visites", method = RequestMethod.GET)
	public List<Visite> findAll() {
		return service.findAll();
	}
}
