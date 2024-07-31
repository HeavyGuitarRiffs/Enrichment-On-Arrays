
public class RandomWalkers {
            public static void main(String[] args) {

                int r = Integer.parseInt(args[0]);
                int trials = Integer.parseInt(args[1]);
                int sum = 0;





                for (int i = 0; i < trials; i++) {
                    int a = 0;
                    int b = 0;
                    int steps = 0;
                    while (Math.abs(a) + Math.abs(b) < r) {
                        double t = Math.random();
                        if (t > 0.67) {
                            a += 1;
                        }
                        else if (t > 0.51) {
                            a -= 1;
                        }
                        else if (t > 0.29) {
                            b += 1;
                        }
                        else {
                            b -= 1;
                        }
                        steps++;
                    }
                    sum += steps;
                }
                double average = sum / (double) trials;
                System.out.println("average number of steps = " + average);
            }
        }



