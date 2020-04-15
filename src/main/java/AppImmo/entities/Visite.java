package AppImmo.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Visite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long idVisite;
	private BienImmo bien;
	private Timestamp dateVisite;
	private Client client;
	private Conseiller conseiller;
	public Visite() {
	}
	public Visite(long idVisite, BienImmo bien, Timestamp dateVisite, Client client, Conseiller conseiller) {
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
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	public BienImmo getBien() {
		return bien;
	}
	public void setBien(BienImmo bien) {
		this.bien = bien;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Timestamp getDateVisite() {
		return dateVisite;
	}
	public void setDateVisite(Timestamp dateVisite) {
		this.dateVisite = dateVisite;
	}
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
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
