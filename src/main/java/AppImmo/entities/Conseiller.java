package AppImmo.entities;

public class Conseiller extends Utilisateur {

	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private String agence;

	@Override
	public String toString() {
		return "Conseiller [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email=" + email
				+ ", agence=" + agence + "]";
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

	public Conseiller(String nom, String prenom, String telephone, String email, String agence) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.agence = agence;
	}

	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub

	}
}
