 public class RandomWalker {
     public static void main(String[] args) {


         // Statement 1 is executed (one time) before the execution of the code block.
         //
         //Statement 2 defines the condition for executing the code block.
         //
         //Statement 3 is executed (every time) after the code block has been executed.
         //
         //The example below will print the numbers 0 to 4:


         int a = Integer.parseInt(args[0]);
         int b = 0;
         int c = 0;
         int steps = 0;

         while (Math.abs(b) + Math.abs(c) < a) {
             System.out.println("(" + b + ", " + c + ")");
             double h = Math.random();
         if (h < 0.89) {
             b += 1;

         }
         else if (h > 0.57) {
             b -= 1;
         }
         else if (h > 0.20) {
             c += 1;
         }
         else {
             c -= 1;
         }
             steps++;
         }
         System.out.println("(" + b + ", " + c + ")");
         System.out.println("steps = " + steps);
     }
 }