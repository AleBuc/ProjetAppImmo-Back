package AppImmo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
	private List<ClasseStandard> classeStandard;
	
	public BienImmo() {
	}
	public BienImmo(long idBien, String typeBien, Date dateSoumission, String statut, String modeOffre,
			String localisation, float revenuCadastral, Proprietaire proprietaire, List<Visite> listVisites,
			Contrat contrat, List<ClasseStandard> classeStandard) {
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
		this.classeStandard = classeStandard;
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proprietaire_id")
	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	@OneToMany(mappedBy = "bien_immo")
	public List<Visite> getListVisites() {
		return listVisites;
	}
	
	public void setListVisites(List<Visite> listVisites) {
		this.listVisites = listVisites;
	}
	
	@OneToOne
	@JoinColumn(name = "contrat_id")
	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	@ManyToMany
	@JoinColumn(name = "classestandard_id")
	public List<ClasseStandard> getClasseStandard() {
		return classeStandard;
	}
	public void setClasseStandard(List<ClasseStandard> classeStandard) {
		this.classeStandard = classeStandard;
	}
	@Override
	public String toString() {
		return "BienImmo [idBien=" + idBien + ", typeBien=" + typeBien + ", dateSoumission=" + dateSoumission
				+ ", statut=" + statut + ", modeOffre=" + modeOffre + ", localisation=" + localisation
				+ ", revenuCadastral=" + revenuCadastral + ", proprietaire=" + proprietaire + ", listVisites="
				+ listVisites + ", contrat=" + contrat + ", classeStandard=" + classeStandard + "]";
	}


	
	
	
	
	
}
