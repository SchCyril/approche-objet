package entities;

public class Personne {

    private String nom;
    private String prenom;
    private AdressePostale adressePostale;

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public AdressePostale getAdressePostale() {
        return adressePostale;
    }
    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

   public void nomComplet() {
        System.out.println(prenom + " " + nom + " habite à " + adressePostale);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adressePostale=" + adressePostale +
                '}';
    }

}
