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
import AppImmo.service.IBienImmoService;

@RestController
@RequestMapping("/apiBienImmo")
@CrossOrigin(origins = "http://localhost:4200/")
public class BienImmoWebservice {

	@Autowired
	@Qualifier("biservice")
	private IBienImmoService service;

	@RequestMapping(value = "/ajout", method = RequestMethod.POST)
	public BienImmo ajout(@RequestBody BienImmo bi) {
		return service.saveOrUpdate(bi);

	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public BienImmo update(@RequestBody BienImmo bi) {
		return service.saveOrUpdate(bi);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}

	@RequestMapping(value = "/bienimmo/{id}", method = RequestMethod.GET)
	public BienImmo getById(@PathVariable long id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/biensimmos", method = RequestMethod.GET)
	public List<BienImmo> findAll() {
		return service.findAll();
	}

}
