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
	private List<ClasseStandard> classestandard;
	
	public Client() {
		super();
	}
	public Client(long idContrat, List<Visite> visites, List<ClasseStandard> classestandard) {
		super();
		this.idContrat = idContrat;
		this.visites = visites;
		this.classestandard = classestandard;
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
	public List<ClasseStandard> getClassesstandards() {
		return classestandard;
	}
	public void setClassesstandards(List<ClasseStandard> classesstandards) {
		this.classestandard = classestandard;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Client [idContrat=" + idContrat + "]";
	}

	
}
