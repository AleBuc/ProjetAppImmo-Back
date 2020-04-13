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

import AppImmo.entities.Utilisateur;
import AppImmo.service.IUtilisateurService;

@RestController
@RequestMapping("/apiUtilisateur")
@CrossOrigin(origins = "http://localhost:8082/")
public class UtilisateurWebService {

	@Autowired
	@Qualifier("uservice")
	private IUtilisateurService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Utilisateur ajout(@RequestBody Utilisateur u) {
		return service.saveOrUpdate(u);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Utilisateur update(@RequestBody Utilisateur u) {
		return service.saveOrUpdate(u);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}

	@RequestMapping(value = "/utilisateur/{id}", method = RequestMethod.GET)
	public Utilisateur getById(@PathVariable long id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
	public List<Utilisateur> findAll() {
		return service.findAll();
	}

}
