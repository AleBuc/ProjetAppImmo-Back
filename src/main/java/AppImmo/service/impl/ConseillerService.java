package AppImmo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import AppImmo.entities.BienImmo;
import AppImmo.entities.Conseiller;
import AppImmo.entities.Contrat;
import AppImmo.repositories.IConseillerRepository;
import AppImmo.service.IConseillerService;

@Service("consservice")
public class ConseillerService implements IConseillerService {

	@Autowired
	@Qualifier("consrepo")
	private IConseillerRepository repo;

	@Override
	public Conseiller saveOrUpdate(Conseiller c) {
		return repo.save(c);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public Conseiller getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Conseiller> findAll() {
		return repo.findAll();
	}

	@Override
	public List<BienImmo> bienAcquis(long id) {
		List<BienImmo> listeacquis = new ArrayList<BienImmo>();
		Conseiller cl = this.getById(id);
		List<Contrat> liste = cl.getContrats();
		for (Contrat c : liste) {
			listeacquis.add(c.getBienImmo());
		}
		return listeacquis;
	}

}