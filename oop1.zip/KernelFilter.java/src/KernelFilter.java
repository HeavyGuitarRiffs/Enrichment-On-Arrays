import java.awt.Color;
public class KernelFilter {

    // Returns a new picture that applies the identity filter to the given picture.
    public static Picture identity(Picture picture) {


    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    public static Picture gaussian

        String Picture = String.valueOf(gaussian);


        int p = (1/16);

        double r1 = [1] [2] [1];
        double g1 = [2, 4, 2];
        double b1 = [1, 2, 1];




    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen



        String newPicture = String.valueOf(sharpen);
        int p = new p;
        double r1 = [0, -1, 0];
        double g1 = [-1, 5, -1];
        double b1 = [0, -1, 0];


    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture)


        String Pixel = String.valueOf(laplacian);
        int p = new p;
        double r1 = [-1, -1, -1];
        double g1 = [-1, 8, -1];
        double b1 = [-1, -1, -1];


    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss

        String Photo = String.valueOf(emboss);
        int p = new p;
        double r1 = [-2, -1, 0];
        double g1 = [-1, 1, 1];
        double b1 = [0, 1, 2];

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur

        String Pixels = String.valueOf(motionBlur);
         int p = (1/9) *
        double [][] =

        {"1, 0, 0, 0, 0, 0, 0, 0, 0"};
        {"0, 1, 0, 0, 0, 0, 0, 0, 0"};
        {"0, 0, 1, 0, 0, 0, 0, 0, 0"};
        {"0, 0, 0, 1, 0, 0, 0, 0, 0"};
        {"0, 0, 0, 0, 1, 0, 0, 0, 0"};
        {"0, 0, 0, 0, 0, 1, 0, 0, 0"};
        {"0, 0, 0, 0, 0, 0, 1, 0, 0"};
        {"0, 0, 0, 0, 0, 0, 0, 1, 0"};
        {"1, 0, 0, 0, 0, 0, 0, 0, 1"};




    // Test client (ungraded).
    public static void main(String[] args)

       Picture source = new Picture(args[0]);
       int width = source.width();
       int height = source.height();
       Picture target = new Picture(width, height);
       for (int col = 0; col < width; col;++)
           for(int row = 0; row < height; row++)
               target.set()col, height-row-1, source.get(col,row);
       target.show();





}