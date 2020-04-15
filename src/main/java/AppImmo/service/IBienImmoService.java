package AppImmo.service;

import java.util.List;

import AppImmo.entities.BienImmo;
import AppImmo.entities.Proprietaire;

public interface IBienImmoService {
	
	public BienImmo saveOrUpdate(BienImmo bi);

	public void delete(long id);

	public BienImmo getById(long id);

	public List<BienImmo> findAll();
	
	public List<BienImmo> findByProprietaire(Proprietaire proprietaire);
	
	public List<BienImmo> bienClassStand (float idClasseStandard);

}
