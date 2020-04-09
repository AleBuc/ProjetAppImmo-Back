package AppImmo.service;

import java.util.List;

import AppImmo.entities.Contrat;

public interface IContratService {
	
	 
	    public Contrat saveOrUpdate(Contrat ct);
	    public void delete(long id);
	    public Contrat getById(long id);
	    public List<Contrat> findAll();

}
