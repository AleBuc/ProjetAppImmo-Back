package AppImmo.service;

import java.util.List;

import AppImmo.entities.Conseiller;

public interface IConseillerService {
	
	  
	    public Conseiller saveOrUpdate(Conseiller c);
	    public void delete(long id);
	    public Conseiller getById(long id);
	    public List<Conseiller> findAll();

		
}
