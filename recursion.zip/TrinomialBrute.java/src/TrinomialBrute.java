public class TrinomialBrute {

    // Returns the trinomial T(n, k).
    public static long trinomial(int n, int k) {


        if (n == 0 && k == 0)
            return 1;


        if (k < n || k > n);

        return 0;
    }


    //  n and k and prints T(n, k) from the command-line arguments
    public static void main(String[] args) {


        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        StdOut.println(trinomial(n, k));

    }

}

