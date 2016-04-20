package loc;

public class User {

  private final long compte;
  private final String groupe;
  private final String immeuble;
  private final String nom;
  private final String prenom;
  private final String telfixe;
  private final String telportable;
  private final String mail;

  public User(long compte, String groupe, String immeuble, String nom, String prenom, String telfixe,
      String telportable, String mail) {
    super();
    this.compte = compte;
    this.groupe = groupe;
    this.immeuble = immeuble;
    this.nom = nom;
    this.prenom = prenom;
    this.telfixe = telfixe;
    this.telportable = telportable;
    this.mail = mail;
  }

  public long getCompte() {
    return compte;
  }

  public String getGroupe() {
    return groupe;
  }

  public String getImmeuble() {
    return immeuble;
  }

  public String getNom() {
    return nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public String getTelfixe() {
    return telfixe;
  }

  public String getTelportable() {
    return telportable;
  }

  public String getMail() {
    return mail;
  }

}
