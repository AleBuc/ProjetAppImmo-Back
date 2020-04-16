package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AppImmo.entities.Client;

@Repository("clientrepo")
public interface IClientRepository extends JpaRepository<Client, Long> {

}
