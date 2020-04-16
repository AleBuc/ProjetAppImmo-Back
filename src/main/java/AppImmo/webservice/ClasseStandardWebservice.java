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

import AppImmo.entities.ClasseStandard;
import AppImmo.service.IClasseStandardService;

@RestController
@RequestMapping("/apiClasseStandard")
@CrossOrigin(origins = "http://localhost:4200/")
public class ClasseStandardWebservice {
	
	@Autowired
	@Qualifier("csservice")
	private IClasseStandardService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ClasseStandard ajout(@RequestBody ClasseStandard cs) {
		return service.saveOrUpdate(cs);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ClasseStandard update(@RequestBody ClasseStandard cs) {
		return service.saveOrUpdate(cs);   
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}

	@RequestMapping(value = "/classestandard/{id}", method = RequestMethod.GET)
	public ClasseStandard getById(@PathVariable long id) {
		return service.getById(id);
	}

	@RequestMapping(value = "/classesstandards", method = RequestMethod.GET) //GET
	public List<ClasseStandard> findAll() {
		return service.findAll();
	}
}
