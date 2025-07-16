package TP12;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(50, 50);

        Rond rond = new Rond(p, 50);
        rond.affiche();

        Rectangle r = new Rectangle(p, 100, 50);
        r.affiche();

        Carre c = new Carre(p, 50);
        c.affiche();

        CarreHerite c2 = new CarreHerite(p, 50);
        c2.affiche();

        FigureUtil.getRandomRond().affiche();
        FigureUtil.getRandomRectangle().affiche();
        FigureUtil.getRandomRond().affiche();
        FigureUtil.getRandomRectangle().affiche();
        FigureUtil.getRandomCarre().affiche();
        FigureUtil.getRandomCarreHerite().affiche();
    }
}
