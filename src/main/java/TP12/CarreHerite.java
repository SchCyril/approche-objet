package TP12;

public class CarreHerite extends Rectangle {
    public CarreHerite(Point pointHautGauche, int cote) {
        super(pointHautGauche, cote, cote);
    }

    @Override
    protected String getType() {
        return "Carré";
    }
}
