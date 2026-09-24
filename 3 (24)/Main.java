import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("X:");
        double x = scanner.nextDouble();

        System.out.println("Y:");
        double y = scanner.nextDouble();

        printColorForPoint(x, y);
    }

    private static void printColorForPoint(double x, double y) {
        SimpleColor color = getColor(x, y);
        System.out.println(color);
    }

    private static SimpleColor getColor(double x, double y) {
        HorizontalParabola hor = new HorizontalParabola(5f, -4f, 1f/3f);
        VerticalParabola vert = new VerticalParabola(-4f, 3f, .5f);

        if (x > 10f || x < -10f || y > 10f || y < -10f) { return SimpleColor.WHITE; } // White outside
        else if (hor.isPointUpperParabola(x, y)) { return SimpleColor.BLUE; }

        else if (y > 0 && y < 1 && x > -3 && x < 0) { return SimpleColor.BLUE; }

        else if (vert.isPointUpperParabola(x, y)) {
            if (x >= -3 && x <= 0 && y >= 5 && y <= 8) { return SimpleColor.GREEN; }
            else if (x <= -3 && y <= 5) { return SimpleColor.ORANGE; }
            else if (x >= -3 && x <= 0 && y <= 5) { return SimpleColor.YELLOW; }
            else { return SimpleColor.GRAY; }
        } 
        else if (x >= -6f && x <= 4f && y >= 1f && y <= 5f) { return SimpleColor.WHITE; }
        else { return SimpleColor.YELLOW; }
    }
}
