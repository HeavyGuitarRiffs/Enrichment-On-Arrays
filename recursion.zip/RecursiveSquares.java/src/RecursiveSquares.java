import java.awt.*;

public class RecursiveSquares {

    // Draws a square centered on (x, y) of the given side length
    // with a light gray background and a black border.
    public static void drawSquare(double x, double y, double length) {

        // Draws a recursive square pattern of order n, centered on (x, y)
        // of the given side length.

        if (n == 0) return;
        double x0 = x - sq/2., x1 = x + sz/2;
        double y0 = y - sz/2, y1 = y + sz/2;
        StdDraw.line(x0, y, x1, y);
        StdDraw.line(x0, y0, x0, y1);
        draw(n-1, sz/2, x0, y0);
        draw(n-1, sz/2, x0, y1);
        draw(n-1, sz/2, x1, y0);
        draw(n-1, sz/2, x1, y1);
        StdDraw.clear (Color.GRAY);
        StdDraw.setXscale(Color.HSBtoRGB(BLACK));
        StdDraw.setYscale(Color.BLACK);
    }}
    public static void draw(int n, double x, double y, double length){

    // Takes an integer command-line argument n and draws a recursive
    // square pattern of order n, centered on (0.5, 0.5) with side length 0.5.

        if (n == 0) return;
        double x0 = x - sz/2., x1 = x + sz/2;
        double y0 = y - sz/2, y1 = y + sz/2;
        StdDraw.line(x0, y, x1, y);
        StdDraw.line(x0, y0, x0, y1);
        draw(n-1, sz/2, x0, y0);
        draw(n-1, sz/2, x0, y1);
        draw(n-1, sz/2, x1, y0);
        draw(n-1, sz/2, x1, y1);


    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        draw(n, .5, .5, .5);
    }
}