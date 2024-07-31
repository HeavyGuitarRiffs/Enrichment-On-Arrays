//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CMYKtoRGB {
    public static void main(String[] args) {

        // 4. Your program must take four double command-line arguments cyan, magenta,
        // yellow, and black; compute the corresponding RGB values, each rounded to the
        // nearest integer; and print the RGB values, as in the following sample



        double cyan = Math.ceil(0.5806205450079456);
        double magenta = Math.ceil(0.5799418213141635);
        double yellow = Math.ceil(0.0717449228447622);
        double black = Math.ceil(0.7536878743438054);

        System.out.println(Math.ceil(cyan));
        System.out.println(Math.ceil(magenta));
        System.out.println(Math.ceil(yellow));
        System.out.println(Math.ceil(black));

        double white = 1 - 0.7536878743438054;
        double red = 255 * (1 - 0.7536878743438054) * (1 - 0.5806205450079456);
        double green = 255 * (1 - 0.7536878743438054) * (1 - 0.5799418213141635);
        double blue = 255 * (1 - 0.7536878743438054) * ( 1 - 0.0717449228447622);

        System.out.println(white);
        System.out.println(red);
        System.out.println(green);
        System.out.println(blue);
        }
    }
