//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GeneralizedHarmonica {
    public static void main(String[] args) {


        int r = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        String GeneralizedHarmonica = " ";




        for (int i = 1; i <= n; i++) {
            GeneralizedHarmonica = GeneralizedHarmonica + i + GeneralizedHarmonica;
            System.out.println(GeneralizedHarmonica);

        }
    }
}
