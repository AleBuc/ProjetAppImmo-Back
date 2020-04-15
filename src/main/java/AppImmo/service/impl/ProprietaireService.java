package AppImmo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import AppImmo.entities.BienImmo;
import AppImmo.entities.Proprietaire;
import AppImmo.repositories.IBienImmoRepository;
import AppImmo.repositories.IProprietaireRepository;
import AppImmo.service.IProprietaireService;

@Service("proprietaireservice")
public class ProprietaireService implements IProprietaireService {

	@Autowired
	@Qualifier("proprietairerepo")
	private IProprietaireRepository proprietairerepo;

	@Autowired
	@Qualifier("birepo")
	private IBienImmoRepository repo;

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

	@Override
	public List<BienImmo> bienProprio(long id) {
		List<BienImmo> listdisp = new ArrayList<BienImmo>();
		Proprietaire p = this.getById(id);
		List<BienImmo> liste = p.getBiensImmo();
		for (BienImmo i : liste) {
			if (i.getStatut() == "disponible")
				;
			listdisp.add(i);

		}

		return listdisp;

	}

}
