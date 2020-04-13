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

import AppImmo.entities.Conseiller;
import AppImmo.service.IConseillerService;

@RestController
@RequestMapping("/apiConseiller")
@CrossOrigin(origins = "http://localhost:8082/")
public class ConseillerWebService {

	@Autowired
	@Qualifier("consservice")
	private IConseillerService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Conseiller ajout(@RequestBody Conseiller c) {
		return service.saveOrUpdate(c);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Conseiller update(@RequestBody Conseiller c) {
		return service.saveOrUpdate(c);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}

	@RequestMapping(value = "/conseiller/{id}", method = RequestMethod.GET)
	public Conseiller getById(@PathVariable long id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/conseillers", method = RequestMethod.GET)
	public List<Conseiller> findAll() {
		return service.findAll();
	}

}