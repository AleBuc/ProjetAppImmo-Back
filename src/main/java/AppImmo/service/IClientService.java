package AppImmo.service;

import java.util.List;

import AppImmo.entities.ClasseStandard;
import AppImmo.entities.Client;
import AppImmo.entities.Contrat;

public interface IClientService {


	public Client add(Client cl);

	public Client update(Client cl);

	public void delete(long id);
	
	public Client getById(long id);
	
	public List<Client> findAll();
	
	
	
//	public List<Client>ClientBienSpe();
	
//	public List<Client>clientClassStand(List<ClasseStandard>classeStandard);
	
	public List<Client> clientBienAcquis(Contrat contrat);
	
//	public List<Client>ClientClassStandSpe();

}
