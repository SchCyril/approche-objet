package TP13;

public class Rectangle {
    private final Point pointHautGauche;
    private final Point pointBasGauche;
    private final Point pointHautDroit;
    private final Point pointBasDroit;

    public Rectangle(Point pointHautGauche, int largeur, int hauteur) {
        this.pointHautGauche = pointHautGauche;
        pointBasGauche = new Point(pointHautGauche.getX(), pointHautGauche.getY() + hauteur);
        pointBasDroit = new Point(pointHautGauche.getX() + largeur, pointHautGauche.getY() + hauteur);
        pointHautDroit = new Point(pointHautGauche.getX() + largeur, pointHautGauche.getY());
    }

    public Point getPointHautGauche() {
        return pointHautGauche;
    }

    public Point getPointBasGauche() {
        return pointBasGauche;
    }

    public Point getPointHautDroit() {
        return pointHautDroit;
    }

    public Point getPointBasDroit() {
        return pointBasDroit;
    }

    protected String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return getType() + " [pointHautGauche=" + pointHautGauche + ", pointBasGauche=" + pointBasGauche
                + ", pointHautDroit=" + pointHautDroit + ", pointBasDroit=" + pointBasDroit + "]";
    }

    public void affiche() {
        System.out.println(this);
    }

    public boolean equals(Rectangle r) {
        return r.pointHautGauche.getX() == this.pointHautGauche.getX() &&
                r.pointHautGauche.getY() == this.pointHautGauche.getY() &&
                r.pointBasGauche.getX() == this.pointBasGauche.getX() &&
                r.pointBasGauche.getY() == this.pointBasGauche.getY() &&
                r.pointHautDroit.getX() == this.pointHautDroit.getX() &&
                r.pointHautDroit.getY() == this.pointHautDroit.getY() &&
                r.pointBasDroit.getX() == this.pointBasDroit.getX() &&
                r.pointBasDroit.getY() == this.pointBasDroit.getY();
    }
}
