package AppImmo.entities;

public class Utilisateur {

String login;
String password;
public Utilisateur(String login, String password) {
	super();
	this.login = login;
	this.password = password;
}
public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
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
@Override
public String toString() {
	return "Utilisateur [login=" + login + ", password=" + password + "]";
}
	
	
}
