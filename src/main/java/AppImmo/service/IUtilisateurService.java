package AppImmo.service;

import java.util.List;

import AppImmo.entities.Utilisateur;

public interface IUtilisateurService {
	
	   public void add(Utilisateur u);
	    public void update(Utilisateur u);
	    public void delete(long id);
	    public Utilisateur findById(long id);
	    public List<Utilisateur> findAll();
		public Utilisateur getOne(long id);

}
