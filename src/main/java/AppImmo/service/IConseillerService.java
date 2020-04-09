package AppImmo.service;

import java.util.List;

import AppImmo.entities.Conseiller;

public interface IConseillerService {
	
	   public void add(Conseiller c);
	    public void update(Conseiller c);
	    public void delete(long id);
	    public Conseiller findById(long id);
	    public List<Conseiller> findAll();
		public Conseiller getOne(long id);
		
}
