package AppImmo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import AppImmo.entities.Proprietaire;
import AppImmo.entities.Contrat;

@Entity
public class BienImmo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long idBien;
	private String typeBien;
	private Date dateSoumission;
	private String statut;
	private String modeOffre;
	private String localisation;
	private float revenuCadastral;
	private Proprietaire proprietaire;
	private List<Visite> listVisites;
	private Contrat contrat;
	
	public BienImmo() {
	}

	public BienImmo(long idBien, String typeBien, Date dateSoumission, String statut, String modeOffre,
			String localisation, float revenuCadastral, Proprietaire proprietaire, List<Visite> listVisites,
			Contrat contrat) {
		this.idBien = idBien;
		this.typeBien = typeBien;
		this.dateSoumission = dateSoumission;
		this.statut = statut;
		this.modeOffre = modeOffre;
		this.localisation = localisation;
		this.revenuCadastral = revenuCadastral;
		this.proprietaire = proprietaire;
		this.listVisites = listVisites;
		this.contrat = contrat;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdBien() {
		return idBien;
	}

	public void setIdBien(long idBien) {
		this.idBien = idBien;
	}

	public String getTypeBien() {
		return typeBien;
	}

	public void setTypeBien(String typeBien) {
		this.typeBien = typeBien;
	}

	public Date getDateSoumission() {
		return dateSoumission;
	}

	public void setDateSoumission(Date dateSoumission) {
		this.dateSoumission = dateSoumission;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getModeOffre() {
		return modeOffre;
	}

	public void setModeOffre(String modeOffre) {
		this.modeOffre = modeOffre;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public float getRevenuCadastral() {
		return revenuCadastral;
	}

	public void setRevenuCadastral(float revenuCadastral) {
		this.revenuCadastral = revenuCadastral;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public List<Visite> getListVisites() {
		return listVisites;
	}

	public void setListVisites(List<Visite> listVisites) {
		this.listVisites = listVisites;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	@Override
	public String toString() {
		return "bienImmo [idBien=" + idBien + ", typeBien=" + typeBien + ", dateSoumission=" + dateSoumission
				+ ", statut=" + statut + ", modeOffre=" + modeOffre + ", localisation=" + localisation
				+ ", revenuCadastral=" + revenuCadastral + ", listVisites=" + listVisites + "]";
	}
	
	
	
	
	
}
