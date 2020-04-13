package AppImmo.entities;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Conseiller {

	private long idConseiller;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private String agence;
	private List<Visite> visites;
	private List<Contrat> contrats;

	public Conseiller() {
	}

	public Conseiller(long idConseiller, String nom, String prenom, String telephone, String email, String agence,
			List<Visite> visites, List<Contrat> contrats) {
		this.idConseiller = idConseiller;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.agence = agence;
		this.visites = visites;
		this.contrats = contrats;
	}
	
	@Id
	public long getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(long idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}
	
	@OneToMany(mappedBy="conseiller")
	public List<Visite> getVisites() {
		return visites;
	}

	public void setVisites(List<Visite> visites) {
		this.visites = visites;
	}
	
	@OneToMany(mappedBy="conseiller")
	public List<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}

	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", nom=" + nom + ", prenom=" + prenom + ", telephone="
				+ telephone + ", email=" + email + ", agence=" + agence + ", visites=" + visites + ", contrats="
				+ contrats + "]";
	}

}
