package TP11;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(50, 50);

        Rond rond = new Rond(p, 50);
        rond.affiche();

        Rectangle r = new Rectangle(p, 100, 50);
        r.affiche();

        FigureUtil.getRandomRond().affiche();
        FigureUtil.getRandomRectangle().affiche();
        FigureUtil.getRandomRond().affiche();
        FigureUtil.getRandomRectangle().affiche();
    }
}
