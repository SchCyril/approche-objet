package entitiesPoint;

public class Rectangle {

    private final Point point;
    private final int longueur;
    private final int largeur;


    public Rectangle(Point point, int longueur, int largeur) {
        this.point = point;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Point getPoint() {
        return point;
    }

    // Méthodes pour obtenir les points des coins du rectangle

    public Point getPointBasGauche() {
        return new Point(point.getX(), point.getY() + largeur);
    }

    public Point getPointHautGauche() {
        return new Point(point.getX(), point.getY() - largeur);
    }

    public Point getPointHautDroit() {
        return new Point(point.getX() + longueur, point.getY() - largeur);
    }

    public Point getPointBasDroit() {
        return new Point(point.getX() + longueur, point.getY() + largeur);
    }

    public String toString() {
        return "pointBasGauche=" + getPointBasGauche() +
                ", pointHautGauche=" + getPointHautGauche() +
                ", pointHautDroit=" + getPointHautDroit() +
                ", pointBasDroit=" + getPointBasDroit() +
                "} et est du type : " + getType();
    }

    public String getType() {
        return "Rectangle";
    }

    public boolean equals(Rectangle r) {
        return this.point.equals(r.point) && this.longueur == r.longueur && this.largeur == r.largeur;
    }

}
