package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import AppImmo.entities.Proprietaire;
import AppImmo.repositories.IProprietaireRepository;
import AppImmo.service.IProprietaireService;

@Service("proprietaireservice")
public class ProprietaireService implements IProprietaireService {

	
	@Autowired
	@Qualifier("proprietairerepo")
	private IProprietaireRepository proprietairerepo;
	
	
	@Override
	public Proprietaire add(Proprietaire p) {
		return proprietairerepo.save(p);
	}

	@Override
	public Proprietaire update(Proprietaire p) {
		return proprietairerepo.save(p);
	}

	@Override
	public void delete(long id) {
		proprietairerepo.deleteById(id);
	}

	@Override
	public Proprietaire getById(long id) {
		return proprietairerepo.findById(id).get();
	}

	@Override
	public List<Proprietaire> findAll() {
		return proprietairerepo.findAll();
	}

}
