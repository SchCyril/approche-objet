package TP13;

public class CarreHerite extends Rectangle {
    public CarreHerite(Point pointHautGauche, int cote) {
        super(pointHautGauche, cote, cote);
    }

    @Override
    protected String getType() {
        return "Carré";
    }


    public boolean equals(CarreHerite r) {
        return r.getPointHautGauche().getX() == this.getPointHautGauche().getX() &&
               r.getPointHautGauche().getY() == this.getPointHautGauche().getY() &&
               r.getPointBasGauche().getX() == this.getPointBasGauche().getX() &&
               r.getPointBasGauche().getY() == this.getPointBasGauche().getY() &&
               r.getPointHautDroit().getX() == this.getPointHautDroit().getX() &&
               r.getPointHautDroit().getY() == this.getPointHautDroit().getY() &&
               r.getPointBasDroit().getX() == this.getPointBasDroit().getX() &&
               r.getPointBasDroit().getY() == this.getPointBasDroit().getY();
    }
}
