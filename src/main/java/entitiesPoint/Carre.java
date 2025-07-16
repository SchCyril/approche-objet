package entitiesPoint;

public class Carre {

    private final Point point;
    private final int cote;

    public Carre(Point point, int cote) {
        this.point = point;
        this.cote = cote;
    }

    public String toString() {
        return "Carre{" +
                "point=" + point +
                ", cote=" + cote +
                '}';
    }
    public void afficher() {
        System.out.println(this);
    }


    public boolean equals(Carre c) {
        return this.point.equals(c.point) && this.cote == c.cote;
    }
}
