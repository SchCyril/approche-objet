package TP13;

public class Carre {
    private final Point pointHautGauche;
    private final Point pointBasGauche;
    private final Point pointHautDroit;
    private final Point pointBasDroit;

    public Carre(Point pointHautGauche, int cote) {
        this.pointHautGauche = pointHautGauche;
        pointBasGauche = new Point(pointHautGauche.getX(), pointHautGauche.getY() + cote);
        pointBasDroit = new Point(pointHautGauche.getX() + cote, pointHautGauche.getY() + cote);
        pointHautDroit = new Point(pointHautGauche.getX() + cote, pointHautGauche.getY());
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

    @Override
    public String toString() {
        return "Carré [pointHautGauche=" + pointHautGauche + ", pointBasGauche=" + pointBasGauche
                + ", pointHautDroit=" + pointHautDroit + ", pointBasDroit=" + pointBasDroit + "]";
    }

    public void affiche() {
        System.out.println(this);
    }


    public boolean equals(Carre c) {
        return c.pointHautGauche.getX() == this.pointHautGauche.getX() &&
                c.pointHautGauche.getY() == this.pointHautGauche.getY() &&
                c.pointBasGauche.getX() == this.pointBasGauche.getX() &&
                c.pointBasGauche.getY() == this.pointBasGauche.getY() &&
                c.pointHautDroit.getX() == this.pointHautDroit.getX() &&
                c.pointHautDroit.getY() == this.pointHautDroit.getY() &&
                c.pointBasDroit.getX() == this.pointBasDroit.getX() &&
                c.pointBasDroit.getY() == this.pointBasDroit.getY();
    }
}
