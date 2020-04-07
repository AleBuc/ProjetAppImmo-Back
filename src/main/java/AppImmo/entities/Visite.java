package AppImmo.entities;

import java.io.Serializable;
import java.util.Date;

import AppImmo.entities.Client;
import AppImmo.entities.Conseiller;

public class Visite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long idVisite;
	private long idBien;
	private Date dateVisite;
	private Client client;
	private Conseiller conseiller;
	public Visite() {
	}
	public Visite(long idVisite, long idBien, Date dateVisite, Client client, Conseiller conseiller) {
		this.idVisite = idVisite;
		this.idBien = idBien;
		this.dateVisite = dateVisite;
		this.client = client;
		this.conseiller = conseiller;
	}
	public long getIdVisite() {
		return idVisite;
	}
	public void setIdVisite(long idVisite) {
		this.idVisite = idVisite;
	}
	public long getIdBien() {
		return idBien;
	}
	public void setIdBien(long idBien) {
		this.idBien = idBien;
	}
	public Date getDateVisite() {
		return dateVisite;
	}
	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	@Override
	public String toString() {
		return "Visite [idVisite=" + idVisite + ", idBien=" + idBien + ", dateVisite=" + dateVisite + "]";
	}
	
}
