package entitiesPoint;

public class FigureUtil {

    public static Rond getRandomRond(Point centre) {
        int rayon = (int) (Math.random() * 100);
        return new Rond(rayon, centre);

    }

    public static Rectangle getRandomRectangle (Point point) {
        int longueur = (int) (Math.random() * 100);
        int largeur = (int) (Math.random() * 100);
        return new Rectangle(point, longueur, largeur);
        
    }
}
