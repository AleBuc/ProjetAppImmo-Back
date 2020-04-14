package AppImmo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import AppImmo.entities.BienImmo;
import AppImmo.entities.Proprietaire;

@Repository("birepo")
public interface IBienImmoRepository extends JpaRepository<BienImmo, Long>{

	public List<BienImmo> findByProprietaire(Proprietaire proprietaire);
	
	@Query("select bi from BienImmo bi join bi.classeStandard cs where cs.id =:idcs and bi.statut=disponible ")
	public List<BienImmo> bienClassStand(@Param("idcs") float idClasseStandard);
	
}
