public class StdIn {

    // Returns the gcd of a and b.
    public static int gcd(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        while (absB != 0) {
            int mod = absA % absB;
            absA = absB;
            absB = mod;
        }

        return absA;
    }

    // Returns the lcm
    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        if (gcd == 0) return 0;
        // Dividing first to prevent the overflow.
        return Math.abs(a) / gcd * Math.abs(b);
    }

    // Returns true relatively prime; or false
    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        if (n <= 0) return 0;

        int count = 1;
        for (int i = 2; i < n; i++) {
            if (areRelativelyPrime(n, i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        StdOut.printf("gcd(%d, %d)\t = \t%d\n", a, b, gcd(a, b));
        StdOut.printf("lcm(%d, %d)\t = \t%d\n", a, b, lcm(a, b));
        StdOut.printf("areRelativelyPrime(%d, %d)\t = \t" + areRelativelyPrime(a, b) + "\n", a, b);
        StdOut.printf("totient(%d)\t = \t%d\n", a, totient(a));
        StdOut.printf("totient(%d)\t = \t%d\n", b, totient(b));
    }
}