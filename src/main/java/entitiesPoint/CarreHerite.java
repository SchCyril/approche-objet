package entitiesPoint;

public class CarreHerite extends Rectangle{


    public CarreHerite(Point point, int longueur, int largeur) {
        super(point, longueur, largeur);
    }

    public String getType() {
        return "CarreHerite";
    }
}
