package AppImmo.entities;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Contrat {

	private long idContrat;
	private Client client;
	private String referenceContrat;
	private String dateAchat;
	private int prixAchat;
	private Conseiller conseiller;
	private BienImmo bienImmo;
	
	public Contrat() {
	}

	public Contrat(long idContrat, Client client, String referenceContrat, String dateAchat, int prixAchat,
			Conseiller conseiller, BienImmo bienImmo) {
		this.idContrat = idContrat;
		this.client = client;
		this.referenceContrat = referenceContrat;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
		this.conseiller = conseiller;
		this.bienImmo = bienImmo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(long idContrat) {
		this.idContrat = idContrat;
	}
	
	@OneToOne
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getReferenceContrat() {
		return referenceContrat;
	}

	public void setReferenceContrat(String referenceContrat) {
		this.referenceContrat = referenceContrat;
	}

	public String getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(String dateAchat) {
		this.dateAchat = dateAchat;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	@OneToOne
	public BienImmo getBienImmo() {
		return bienImmo;
	}

	public void setBienImmo(BienImmo bienImmo) {
		this.bienImmo = bienImmo;
	}

	@Override
	public String toString() {
		return "Contrat [idContrat=" + idContrat + ", client=" + client + ", referenceContrat=" + referenceContrat
				+ ", dateAchat=" + dateAchat + ", prixAchat=" + prixAchat + ", conseiller=" + conseiller + ", bienImmo="
				+ bienImmo + "]";
	}
	
}
