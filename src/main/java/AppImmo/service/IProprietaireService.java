package AppImmo.service;

import java.util.List;

import AppImmo.entities.Proprietaire;

public interface IProprietaireService {

	public Proprietaire add(Proprietaire p);

	public Proprietaire update(Proprietaire p);

	//public Proprietaire ajouterBienImmo(int id_p, BienImmo bienIm);
	
	public void delete(long id);
	
	public Proprietaire getById(long id);
	
	public List<Proprietaire> getAll();
}
