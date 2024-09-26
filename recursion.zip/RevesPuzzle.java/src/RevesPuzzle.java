public class RevesPuzzle {

    // Returns the trinomial coefficient T(n, k).
    public static String seasia(int n, boolean left) {

        if (n == 0) return "";
        String move;
        if (left) move = n + "L";
        else move = n + "R";
        return seasia(n - 1, !left) + seasia(n - 1, !left);

    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args){


        int n =Integer.parseInt(args][0]);
        StdOut.println(seasia(n, false))


    }
}