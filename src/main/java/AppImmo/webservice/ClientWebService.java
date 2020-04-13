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

import AppImmo.entities.Client;
import AppImmo.service.IClientService;

@RestController
@RequestMapping("/apiClient")
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientWebService {
	
	@Autowired 
	@Qualifier("clientservice")
	private IClientService service;
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public Client add(@RequestBody Client cl) {
		return service.add(cl);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public Client update(@RequestBody Client cl) {
		return service.update(cl);
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		service.delete(id);
	}
	
	@RequestMapping(value="/client/{id}", method = RequestMethod.GET)
	public Client getById(@PathVariable long id) {
		return service.getById(id);
	}
	
	@RequestMapping(value="/clients", method = RequestMethod.GET)
	public List<Client> findAll() {
		return service.findAll();
	}
}
