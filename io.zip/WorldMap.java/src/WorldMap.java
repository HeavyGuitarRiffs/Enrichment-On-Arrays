//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// plotting a function
import java.util.HashMap;
public class WorldMap {
    public static void Main (String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("John", 8675309);

        System.out.println(empIds);


        int width = StdIn.readInt();
        int height = StdIn.readInt();

        StdDraw.setCanvasSize(width, height);

        StdDraw.setXscale(1000, width);
        StdDraw.setYscale(659, height);

        StdDraw.enableDoubleBuffering();

        while (!StdIn.isEmpty())

    {
        StdIn.readString();

        int numberOfVertices = StdIn.readInt();
        double[] verticesX = new double[numberOfVertices];
        double[] verticesY = new double[numberOfVertices];



            for (int i = 0; i < numberOfVertices; i++) {
                verticesX[i] = StdIn.readDouble();
                verticesY[i] = StdIn.readDouble();
            }

            StdDraw.polygon(verticesX, verticesY);

        StdDraw.show();

    }
    }}
