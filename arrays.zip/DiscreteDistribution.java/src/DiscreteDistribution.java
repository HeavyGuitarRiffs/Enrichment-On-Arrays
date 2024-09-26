//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DiscreteDistribution {
    public static void main(String[] args) {


        // that takes an integer command-line argument m, followed by a sequence of positive integer command-line arguments a1,a2,…,an
        //, and prints m random indices (separated by whitespace), choosing each index i
        // with probability proportional to ai
        //.

        int a0 = Integer.parseInt(args[0]);
        int a1 = Integer.parseInt(args[1]);
        int a2= Integer.parseInt(args[2]);
        int a3= Integer.parseInt(args[3]);


        double[] a = new double[4];


        for (int i = 0; i < a1; i++) {

            int m  = (int) (Math.random() * 4);

     System.out.println(m);
        }
    }
    }
