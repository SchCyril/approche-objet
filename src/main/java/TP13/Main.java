package TP13;

public class Main {
    public static void main(String[] args) {
      /*  Point p = new Point(50, 50);

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


       */


        System.out.println("\n---------- Comparer Carrer ----------");
        Carre c1 = new Carre(new Point(9, 10), 20);
        Carre c2 = new Carre(new Point(10, 10), 20);

        System.out.println(c1.equals(c2) ? "Les deux carrés sont égaux." : "Les deux carrés sont différents.");


        System.out.println("\n---------- Comparer Point ----------");
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 21);
        System.out.println(p1.equals(p2) ? "Les deux points sont égaux." : "Les deux points sont différents.");


        System.out.println("\n---------- Comparer Rectangle ----------");
        Rectangle r1 = new Rectangle(new Point(10, 20), 30, 40);
        Rectangle r2 = new Rectangle(new Point(10, 20), 30, 40);
        System.out.println(r1.equals(r2) ? "Les deux rectangles sont égaux." : "Les deux rectangles sont différents.");

        System.out.println("\n---------- Comparer CarreHerite ----------");
        CarreHerite ch1 = new CarreHerite(new Point(10, 20), 30);
        CarreHerite ch2 = new CarreHerite(new Point(10, 20), 30);
        System.out.println(ch1.equals(ch2) ? "Les deux carrés hérités sont égaux." : "Les deux carrés hérités sont différents.");


        System.out.println("\n---------- Comparer Carre Hérité avec un rectangle ----------");
        CarreHerite ch3 = new CarreHerite(new Point(10, 20), 30);
        Rectangle r3 = new Rectangle(new Point(10, 20), 30, 20);
        System.out.println(ch3.equals(r3) ? "Le carré hérité et le rectangle sont égaux." : "Le carré hérité et le rectangle sont différents.");
    }
}
