//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* that takes two integer command-line arguments n and trials and performs the following experiment, trials times:

Choose a birthday for the next person, uniformly at random between 0 and n−1.
Have that person enter the room.
If that person shares a birthday with someone else in the room, stop; otherwise repeat.
In each experiment, count the number of people that enter the room. Print a table that summarizes the results (the count i, the number of times that exactly i people enter the room, and the fraction of times that i or fewer people enter the room) for each possible
value of i from 1 until the fraction reaches (or exceeds) 50%/ *
         */

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int i = 1;
        double fraction = 0;
        double[] peopleCount = new double[n + 2];

        while (fraction < 0.50 && i <= n) {
            for (int j = 0; j < trials; j++) {
                int found = 0;
                boolean[] birthArr = new boolean[n];
                int enterPeople = 1;

                while (enterPeople < i + 1) {
                    int birthday = (int) (Math.random() * n);
                    enterPeople++;

                    if (!birthArr[birthday]) birthArr[birthday] = true;
                    else found++;
                }

                peopleCount[i] += found;
            }
            fraction = peopleCount[i] / trials;

            System.out.println(
                    i + "\t" + (int) (peopleCount[i] - peopleCount[i - 1]) + "\t" + fraction);
            i++;


        }


        System.out.println("i = " + i);
    }
    }
