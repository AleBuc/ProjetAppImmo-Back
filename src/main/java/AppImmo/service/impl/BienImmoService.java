package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import AppImmo.entities.BienImmo;
import AppImmo.entities.Proprietaire;
import AppImmo.repositories.IBienImmoRepository;
import AppImmo.service.IBienImmoService;

@Service("biservice")
public class BienImmoService implements IBienImmoService {

	@Autowired
	@Qualifier("birepo")
	private IBienImmoRepository repo;

	@Override
	public BienImmo saveOrUpdate(BienImmo bi) {
		return repo.save(bi);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public BienImmo getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<BienImmo> findAll() {
		return repo.findAll();
	}

	@Override
	public List<BienImmo> findByProprietaire(Proprietaire proprietaire) {
		return repo.findByProprietaire(proprietaire);
	}

	@Override
	public List<BienImmo> bienClassStand(float idClasseStandard) {
		return repo.bienClassStand(idClasseStandard);
	}

}
