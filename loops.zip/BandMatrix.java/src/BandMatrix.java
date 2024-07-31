public class BandMatrix {
    public static void main(String[] args)
    {

        int width = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        for (int i = 0; i < width; i++)
            for (int j = 0; j < n; j++) {
                if (j != 0) System.out.print(" ");
                if (Math.abs(j - i) > width) {
                    if (n >= width) {
                        System.out.println();
                    } else {
                        System.out.println("0 * 0");
                    }


                }}
    }}
