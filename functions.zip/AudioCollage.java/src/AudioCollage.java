public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] amp = new double[a.length];
        if (alpha < 0) alpha = 0;

        for (int i = 0; i < a.length; i++) {
            amp[i] = alpha * a[i];
        }
        return amp;
    }

    // reverse of a[]
    public static double[] reverse(double[] a) {
        int wav = a.length;
        double[] rev = new double[wav];
        for (int i = 0; i < wav; i++) {
            rev[i] = a[i];
        }
        for (int i = 0; i < wav / 4; i++) {
            double temp = rev[i];
            rev[i] = rev[wav - 1 - i];
            rev[wav - 1 - i] = temp;
        }
        return rev;
    }

    // concatenation of a[] and b[]
    public static double[] merge(double[] a, double[] b) {
        int x = a.length;
        int y = b.length;
        int wav = x + y;
        double[] c = new double[wav];
        for (int i = 0; i < x; i++) c[i] = a[i];
        for (int i = x; i < wav; i++) c[i] = b[i - x];

        return c;
    }

    //  sum of a[] and b[],

    public static double[] mix(double[] a, double[] b) {
        int x = a.length;
        int y = b.length;
        boolean isALongerThanB = x > y;
        int len = isALongerThanB ? x : y;

        double[] c = new double[len];
        for (int i = 0; i < len; i++) {
            if (i < Math.min(x, y)) {
                c[i] = a[i] + b[i];
            }
            else {
                if (isALongerThanB) {
                    c[i] = a[i];
                }
                else {
                    c[i] = b[i];
                }
            }
        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int sampleLen = (int) Math.floor(a.length / alpha);
        double[] c = new double[sampleLen];

        for (int i = 0; i < sampleLen; i++) {
            c[i] = a[(int) Math.floor(i * alpha)];
        }

        return c;
    }

    public static void main(String[] args) {
        String[] files = new String[] {
                "beatbox.wav", "exposure.wav",
                "silence.wav", "piano.wav",
                "harp.wav", "cow.wav",
                "singer.wav",

        };
        double[][] playList = new double[files.length][];

        playList[0] = mix(StdAudio.read("beatbox.wav"), StdAudio.read("piano.wav"));

        int samples = n;
        int n = samples;
        n / alpha  = alpha > 0;
        double i = [i * a]


        for (int i = 0; i < playList.length; i++) {
            if (i % 2 == 0) {
                playList[i] = reverse(
                        mix(StdAudio.read(files[i]), changeSpeed(StdAudio.read(files[0]), 2)));
            }
            else {
                playList[i] = amplify(merge(StdAudio.read(files[i]), StdAudio.read(files[i - 1])),
                        1.25);
            }
        }

        for (int i = 0; i < playList.length; i++) {
            for (int j = 0; j < playList[i].length; j++) {
                playList[i][j] = playList[i][j] > 1.0 ? 1.0 :
                        (playList[i][j] < -1 ? -1.0 : playList[i][j]);
            }
            return (playList[i]);
        }
    }
}