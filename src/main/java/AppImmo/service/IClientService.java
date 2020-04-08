package AppImmo.service;

import java.util.List;

import AppImmo.entities.Client;

public interface IClientService {


	public Client add(Client cl);

	public Client update(Client cl);

	public void delete(int id);
	
	public Client getById(int id);
	
	public List<Client> getAll();
	
//	public Client ajouterAdresseAClient(int id_cl,Adresse adr);
	
	public Client findByLogin(String login);

}
