package entities;

public class TestPersonne {
    public static void main(String[] args) {

        Personne personne1 = new Personne(
                "Schneidenbach",
                "Cyril",
                new AdressePostale(10, "Rue de la Paix", 75002, "Paris")
        );

        Personne personne2 = new Personne(
                "Dupont",
                "Jean",
                new AdressePostale(20, "Avenue des Champs-Élysées", 75008, "Paris")
        );

        Personne personne3 = new Personne(
                "Schneidenbach",
                "Cyril"
        );

        personne2.setAdressePostale(new AdressePostale(40, "Rue Louis l'Epine", 34470, "Pérols"));

        personne2.nomComplet();
    }
}
