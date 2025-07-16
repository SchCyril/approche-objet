package TP11;

import java.util.Random;

public class FigureUtil {
    private static Point getRandomPoint() {
        Random rand = new Random();
        return new Point(rand.nextInt(100) + 1, rand.nextInt(100) + 1);
    }

    public static Rond getRandomRond() {
        Random rand = new Random();
        return new Rond(getRandomPoint(), rand.nextInt(100) + 1);
    }

    public static Rectangle getRandomRectangle() {
        Random rand = new Random();
        return new Rectangle(getRandomPoint(), rand.nextInt(100) + 1, rand.nextInt(100) + 1);
    }
}
