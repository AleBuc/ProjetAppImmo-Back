package AppImmo.service;

import java.util.List;

import AppImmo.entities.BienImmo;

public interface IBienImmoService {
	
	public BienImmo saveOrUpdate(BienImmo bi);

	public void delete(long id);

	public BienImmo getById(long id);

	public List<BienImmo> findAll();

}
