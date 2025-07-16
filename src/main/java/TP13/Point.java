package TP13;

public class Point {
    private final int x;
    private final int y;
    private static final int INIT_X = 25;
    private static final int INIT_Y = 25;

    public Point() {
        this(INIT_X, INIT_Y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public boolean equals(Point p) {
        return this.x == p.x && this.y == p.y;
    }
}
