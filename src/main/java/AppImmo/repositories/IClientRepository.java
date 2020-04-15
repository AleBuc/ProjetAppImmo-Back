package AppImmo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import AppImmo.entities.Client;
import AppImmo.entities.Contrat;

@Repository("clientrepo")
public interface IClientRepository extends JpaRepository<Client, Long>{

	@Query
	public List<Client> clientBienAcquis(Contrat contrat);
	


}
