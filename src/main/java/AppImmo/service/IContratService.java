package AppImmo.service;

import java.util.List;

import AppImmo.entities.Contrat;

public interface IContratService {
	
	   public void add(Contrat ct);
	    public void update(Contrat ct);
	    public void delete(long id);
	    public Contrat findById(long id);
	    public List<Contrat> findAll();
		public Contrat getOne(long id);

}
