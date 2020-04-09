package AppImmo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import AppImmo.entities.Conseiller;
import AppImmo.service.IConseillerService;

@RestController
@RequestMapping("application")
public class ConseillerWebService {

	@Autowired
	private IConseillerService service;

	@RequestMapping(value = "/ajout", method = RequestMethod.POST)
	public Conseiller ajout(@RequestBody Conseiller c) {
		return service.saveOrUpdate(c);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Conseiller update(@RequestBody Conseiller c) {
		return service.saveOrUpdate(c);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}

	@RequestMapping(value = "Conseiller", method = RequestMethod.GET)
	public Conseiller ajout(@PathVariable long id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/Conseillers", method = RequestMethod.GET)
	public List<Conseiller> findAll() {
		return service.findAll();
	}

}