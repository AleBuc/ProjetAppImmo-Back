package AppImmo.service;

import java.util.List;

import AppImmo.entities.Utilisateur;

public interface IUtilisateurService {
	
	    public Utilisateur saveOrUpdate(Utilisateur u);
	    public void delete(long id);
	    public Utilisateur getById(long id);
	    public List<Utilisateur> findAll();
	
}
