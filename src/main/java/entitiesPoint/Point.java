package entitiesPoint;

public class Point {
    private final static int INIT_X = 25;
    private final static int INIT_Y = 25;
    private int x;
    private int y;


  /*  public Point () {
        this(INIT_X, INIT_Y);
    } */

    public Point(int x, int y) {
        this.x= x;
        this.y = y;
    }

    public int getINIT_X() {
        return INIT_X;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getINIT_Y() {
        return INIT_Y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + INIT_X +
                ", y=" + INIT_Y +
                '}';
    }

    // redefinition methode equals pour comparer deux objets Point avec leurs coordonnees x et y
    public boolean equals(Point p) {
        return this.x == p.x && this.y == p.y;

    }
}
