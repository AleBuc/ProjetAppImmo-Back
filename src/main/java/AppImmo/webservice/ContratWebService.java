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

import AppImmo.entities.Contrat;
import AppImmo.service.IContratService;

@RestController
@RequestMapping("/apiContrat")
@CrossOrigin(origins = "http://localhost:8082/")
public class ContratWebService {

	@Autowired
	@Qualifier("contservice")
	private IContratService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Contrat ajout(@RequestBody Contrat ct) {
		return service.saveOrUpdate(ct);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Contrat update(@RequestBody Contrat ct) {
		return service.saveOrUpdate(ct);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}

	@RequestMapping(value = "/contrat/{id}", method = RequestMethod.GET)
	public Contrat getById(@PathVariable long id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/contrats", method = RequestMethod.GET)
	public List<Contrat> findAll() {
		return service.findAll();
	}

}
