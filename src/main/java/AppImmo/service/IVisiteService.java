package AppImmo.service;

import java.util.List;

import AppImmo.entities.Visite;

public interface IVisiteService {

	public Visite saveOrUpdate(Visite v);

	public void delete(long id);

	public Visite getById(long id);

	public List<Visite> findAll();
}
