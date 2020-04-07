package AppImmo.service;

import java.util.List;

import AppImmo.entities.BienImmo;
import AppImmo.entities.Proprietaire;

public interface IProprietaireService {

	public Proprietaire add(Proprietaire p);

	public Proprietaire update(Proprietaire p);

	//public Proprietaire ajouterBienImmoAProprietaire(int id_p, BienImmo bienIm);
	
	public void delete(int id);
	
	public Proprietaire getById(int id);
	
	public List<Proprietaire> getAll();
}
