package TP13;

public class Rond {
    private final Point centre;
    private final int rayon;

    public Rond(Point centre, int rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Rond [centre=" + centre + ", rayon=" + rayon + "]";
    }

    public void affiche() {
        System.out.println(this.toString());
    }
}	
