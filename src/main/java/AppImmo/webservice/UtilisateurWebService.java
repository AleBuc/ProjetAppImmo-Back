package AppImmo.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import AppImmo.entities.Utilisateur;
import AppImmo.service.IUtilisateurService;

@RestController
@RequestMapping("application")
public class UtilisateurWebService {

	@Autowired
	private IUtilisateurService service;

	@RequestMapping(value = "/ajout", method = RequestMethod.POST)
	public Utilisateur ajout(@RequestBody Utilisateur u) {
		return service.saveOrUpdate(u);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Utilisateur update(@RequestBody Utilisateur u) {
		return service.saveOrUpdate(u);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}

	@RequestMapping(value = "Utilisateur", method = RequestMethod.GET)
	public Utilisateur ajout(@PathVariable long id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/Utilisateurs", method = RequestMethod.GET)
	public List<Utilisateur> findAll() {
		return service.findAll();
	}

}
