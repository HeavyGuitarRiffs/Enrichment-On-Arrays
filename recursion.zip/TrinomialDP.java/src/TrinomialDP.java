public class TrinomialDP {

    // Returns the trinomial T(n, k).
    public static long trinomial(int n, int k){
k = Math.max(n,k);


    long [][] nom = new long[n + 2][k + n +1]


        nom [0][0] = 1;
        nom [1][0] =1;


        for (int i = 1; i <= n; i++) {

            (int j = 0; j <= k + (n - i); j++
        };

        if (p > i) {
            tri[i][j] = 0;
            continue;
        }

        tri[i][j] = tri[i - 1][Math.abs(j - 1)] + tri[i - 1][j] + tri[i - 1][j + 1];
    }
}
        return tri[n][k];
        }





    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args)

     int n = Integer.parseInt([0]);
     int k = Integer.parseInt([1]);

    StdOut.println(trinomial(n,k))
}