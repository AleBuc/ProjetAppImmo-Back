package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import AppImmo.entities.BienImmo;
import AppImmo.entities.ClasseStandard;
import AppImmo.entities.Client;
import AppImmo.entities.Contrat;
import AppImmo.repositories.IClientRepository;
import AppImmo.service.IClientService;

@Service("clientservice")
public class ClientService implements IClientService{
	
	@Autowired
	@Qualifier("clientrepo")
	private IClientRepository clientrepo;

	@Override
	public Client add(Client cl) {
		return clientrepo.save(cl);
	}

	@Override
	public Client update(Client cl) {
		return clientrepo.save(cl);
	}

	@Override
	public void delete(long id) {
		clientrepo.deleteById(id);
		
	}

	@Override
	public Client getById(long id) {
		return clientrepo.findById(id).get();
	}

	@Override
	public List<Client> findAll() {
		return clientrepo.findAll();
	}

//	@Override
//	public List<Client> clientClassStand(List<ClasseStandard> classeStandard) {
//
//		return clientrepo.clientClassStand(List<ClasseStandard> classeStandard);
//	}

	@Override
	public List<Client> clientBienAcquis(Contrat contrat) {

		return clientrepo.clientBienAcquis(contrat);
	}





	
	

}
