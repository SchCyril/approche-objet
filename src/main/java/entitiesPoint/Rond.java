package entitiesPoint;

public class Rond {
    private final int rayon;
    private final Point centre;

    public Rond(int rayon, Point centre) {
        this.rayon = rayon;
        this.centre = centre;
    }

    public int getRayon() {
        return rayon;
    }

    @Override
    public String toString() {
        return "Rond{" +
                "rayon=" + rayon +
                ", centre=" + centre +
                '}';
    }

    public void afficher() {
        System.out.println(this);
    }
}
