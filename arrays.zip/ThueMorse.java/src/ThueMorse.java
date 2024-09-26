//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ThueMorse {
    public static void main(String[] args) {
        /* Write a program ThueMorse.java that takes an integer command-line
         argument n and prints an n-by-n pattern like the ones below.
        Include two space characters between each + and - character.*/
        int x = Integer.parseInt(args[0]);
        String[][] array = new String [x][x];
        String thue   = "0";
        String morse  = "1";


        //
        for (int i = 1; i <= array.length; i++) {
            String t = thue;             // save away values
            String m = morse;
            thue  += m;
            morse += t;

        }

        String[] split = (thue.split("(?!^)"));

        for (var y = 0; y<split.length; y++){
            if (split[y] == "0"){
                split[y] = "+";
            }
            else split[y] = "-";
        }
        int index = 0;
        for (var i = 0; i < array.length; i++){
            for (var j = 0; j < array[i].length;j++){
                array[i][j] = (split[index]);
                index++;
            }
        }
        System.out.println(Arrays.toString(array));

        }
    }

}}







