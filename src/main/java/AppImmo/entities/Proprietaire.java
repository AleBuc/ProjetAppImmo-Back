package AppImmo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Proprietaire extends Personne {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String telephonePro;
	private List<BienImmo> biensImmo;
	
	public Proprietaire() {
		super();
	}

	public Proprietaire(String telephonePro, List<BienImmo> biensImmo) {
		super();
		this.telephonePro = telephonePro;
		this.biensImmo = biensImmo;
	}

	public String getTelephonePro() {
		return telephonePro;
	}

	public void setTelephonePro(String telephonePro) {
		this.telephonePro = telephonePro;
	}
	
	@OneToMany(mappedBy = "proprietaire")
	public List<BienImmo> getBiensImmo() {
		return biensImmo;
	}
	
	public void setBiensImmo(List<BienImmo> biensImmo) {
		this.biensImmo = biensImmo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Proprietaire [telephonePro=" + telephonePro + "]";
	}
	
	

}
