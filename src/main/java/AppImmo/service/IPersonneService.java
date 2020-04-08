package AppImmo.service;

import java.util.List;

import AppImmo.entities.Personne;


public interface IPersonneService {
	
	public Personne add(Personne p);

	public Personne update(Personne p);

	public void delete(long id);
	
	public Personne getById(long id);
	
	public List<Personne> getAll();
	
//	public Personne ajouterAdresse(long id_p, adresse adr);

	

}
