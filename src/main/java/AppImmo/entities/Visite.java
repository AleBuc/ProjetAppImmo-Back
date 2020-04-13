package AppImmo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Visite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long idVisite;
	private BienImmo bien;
	private Date dateVisite;
	private Client client;
	private Conseiller conseiller;
	public Visite() {
	}
	public Visite(long idVisite, BienImmo bien, Date dateVisite, Client client, Conseiller conseiller) {
		this.idVisite = idVisite;
		this.bien = bien;
		this.dateVisite = dateVisite;
		this.client = client;
		this.conseiller = conseiller;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdVisite() {
		return idVisite;
	}
	public void setIdVisite(long idVisite) {
		this.idVisite = idVisite;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	public BienImmo getBien() {
		return bien;
	}
	public void setBien(BienImmo bien) {
		this.bien = bien;
	}
	public Date getDateVisite() {
		return dateVisite;
	}
	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	@Override
	public String toString() {
		return "Visite [idVisite=" + idVisite + ", bien=" + bien + ", dateVisite=" + dateVisite + ", client=" + client
				+ ", conseiller=" + conseiller + "]";
	}

	
}
