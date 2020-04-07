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
	
	private long idContrat;
	private List<Visite> visites;
	private List<ClassesStandards> classesstandards;
	
	public Client() {
		super();
	}
	public Client(long idContrat, List<Visite> visites, List<ClassesStandards> classesstandards) {
		super();
		this.idContrat = idContrat;
		this.visites = visites;
		this.classesstandards = classesstandards;
	}
	@Id
	public long getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(long idContrat) {
		this.idContrat = idContrat;
	}
	public List<Visite> getVisites() {
		return visites;
	}
	public void setVisites(List<Visite> visites) {
		this.visites = visites;
	}
	public List<ClassesStandards> getClassesstandards() {
		return classesstandards;
	}
	public void setClassesstandards(List<ClassesStandards> classesstandards) {
		this.classesstandards = classesstandards;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Client [idContrat=" + idContrat + "]";
	}

	
}
