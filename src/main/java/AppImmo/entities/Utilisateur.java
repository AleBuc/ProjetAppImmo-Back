package AppImmo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Utilisateur {

	private long idUser;
	private String login;
	private String password;
	private Conseiller conseiller;

	public Utilisateur() {
	}

	public Utilisateur(long idUser, String login, String password, Conseiller conseiller) {
		this.idUser = idUser;
		this.login = login;
		this.password = password;
		this.conseiller = conseiller;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "conseiller_id", nullable = false)
	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUser=" + idUser + ", login=" + login + ", password=" + password + ", conseiller="
				+ conseiller + "]";
	}

}
