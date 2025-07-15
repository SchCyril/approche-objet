package entities;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale adressePostale = new AdressePostale(
                10,
                "Rue de la Paix",
                75002,
                "Paris"
        );

        AdressePostale adressePostale2 = new AdressePostale(
                20,
                "Avenue des Champs-Élysées",
                75008,
                "Paris"
        );
    }
}
