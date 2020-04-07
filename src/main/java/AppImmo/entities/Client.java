package AppImmo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client extends Personne {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Contrat contrat;
	private List<Visite> visites;
	private List<ClasseStandard> classeStandard;
	
	public Client() {
		super();
	}

	public Client(Contrat contrat, List<Visite> visites, List<ClasseStandard> classeStandard) {
		super();
		this.contrat = contrat;
		this.visites = visites;
		this.classeStandard = classeStandard;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public List<Visite> getVisites() {
		return visites;
	}

	public void setVisites(List<Visite> visites) {
		this.visites = visites;
	}

	public List<ClasseStandard> getClasseStandard() {
		return classeStandard;
	}

	public void setClasseStandard(List<ClasseStandard> classeStandard) {
		this.classeStandard = classeStandard;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Client [contrat=" + contrat + ", visites=" + visites + ", classeStandard=" + classeStandard + "]";
	}
	
	
	
}
