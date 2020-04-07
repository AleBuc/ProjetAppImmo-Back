package AppImmo.entities;

public class Contrat extends Client {

long idContrat;
Client client;
String referenceContrat;
String dateAchat;
int prixAchat;
Conseiller conseiller;
public Contrat() {
	super();
	// TODO Auto-generated constructor stub
}
public Contrat(long idContrat, Client client, String referenceContrat, String dateAchat, int prixAchat,
		Conseiller conseiller) {
	super();
	this.idContrat = idContrat;
	this.client = client;
	this.referenceContrat = referenceContrat;
	this.dateAchat = dateAchat;
	this.prixAchat = prixAchat;
	this.conseiller = conseiller;
}
public long getIdContrat() {
	return idContrat;
}
public void setIdContrat(long idContrat) {
	this.idContrat = idContrat;
}
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
public Conseiller getConseiller() {
	return conseiller;
}
public void setConseiller(Conseiller conseiller) {
	this.conseiller = conseiller;
}
@Override
public String toString() {
	return "Contrat [idContrat=" + idContrat + ", referenceContrat=" + referenceContrat + ", dateAchat=" + dateAchat
			+ ", prixAchat=" + prixAchat + ", conseiller=" + conseiller + "]";
}
	
	
	
}
