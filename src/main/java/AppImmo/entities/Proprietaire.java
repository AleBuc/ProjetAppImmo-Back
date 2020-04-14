package AppImmo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
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
	
	@OneToMany(mappedBy = "proprietaire",cascade = CascadeType.ALL)
	@JsonIgnore
	public List<BienImmo> getBiensImmo() {
		return biensImmo;
	}
	
	public void setBiensImmo(List<BienImmo> biensImmo) {
		this.biensImmo = biensImmo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	

}
