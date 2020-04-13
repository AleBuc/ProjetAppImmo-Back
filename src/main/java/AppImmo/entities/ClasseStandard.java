package AppImmo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class ClasseStandard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long idClasse;
	private String nomClasse;
	private String typeBien;
	private int superficieMin;
	private float prixMax;
	private List<BienImmo> biens;
	private List<Client> client;
	public ClasseStandard() {
	}
	public ClasseStandard(long idClasse, String nomClasse, String typeBien, int superficieMin, float prixMax,
			List<BienImmo> biens, List<Client> client) {
		this.idClasse = idClasse;
		this.nomClasse = nomClasse;
		this.typeBien = typeBien;
		this.superficieMin = superficieMin;
		this.prixMax = prixMax;
		this.biens = biens;
		this.client = client;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdClasse() {
		return idClasse;
	}
	public void setIdClasse(long idClasse) {
		this.idClasse = idClasse;
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	public String getTypeBien() {
		return typeBien;
	}
	public void setTypeBien(String typeBien) {
		this.typeBien = typeBien;
	}
	public int getSuperficieMin() {
		return superficieMin;
	}
	public void setSuperficieMin(int superficieMin) {
		this.superficieMin = superficieMin;
	}
	public float getPrixMax() {
		return prixMax;
	}
	public void setPrixMax(float prixMax) {
		this.prixMax = prixMax;
	}
	
	@ManyToMany
	public List<BienImmo> getBiens() {
		return biens;
	}
	public void setBiens(List<BienImmo> biens) {
		this.biens = biens;
	}
	@ManyToOne
	@JoinColumn(name = "client_id")
	public List<Client> getClient() {
		return client;
	}
	public void setClient(List<Client> client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "ClasseStandard [idClasse=" + idClasse + ", nomClasse=" + nomClasse + ", typeBien=" + typeBien
				+ ", superficieMin=" + superficieMin + ", prixMax=" + prixMax + ", biens=" + biens + "]";
	}
	
	
	
}
