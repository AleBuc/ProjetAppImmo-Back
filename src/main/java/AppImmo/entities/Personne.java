package AppImmo.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Personne implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nom;
	private String prenom;
	private String adresse;
	private String numeroTelephonePersonnel;
	
	public Personne() {
		super();
	}

	public Personne(long id, String nom, String prenom, String adresse, String numeroTelephonePersonnel) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numeroTelephonePersonnel = numeroTelephonePersonnel;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumeroTelephonePersonnel() {
		return numeroTelephonePersonnel;
	}

	public void setNumeroTelephonePersonnel(String numeroTelephonePersonnel) {
		this.numeroTelephonePersonnel = numeroTelephonePersonnel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", numeroTelephonePersonnel=" + numeroTelephonePersonnel + "]";
	}
	
	
	
}
