package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import AppImmo.entities.Personne;
import AppImmo.repositories.IPersonneRepository;
import AppImmo.service.IPersonneService;

@Service
public class PersonneService implements IPersonneService {

	@Autowired
	@Qualifier("personneclient")
	private IPersonneRepository personnerepo;
	
	
	@Override
	public Personne add(Personne p) {
		return personnerepo.save(p);
	}

	@Override
	public Personne update(Personne p) {
		return personnerepo.save(p);
	}

	@Override
	public void delete(long id) {
		personnerepo.deleteById(id);
		
	}

	@Override
	public Personne getById(long id) {
		return personnerepo.findById(id).get();
	}

	@Override
	public List<Personne> findAll() {
		return personnerepo.findAll();
	}
	
	

}
