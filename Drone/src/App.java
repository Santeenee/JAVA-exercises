public class App {

    private static int d = 10;

    /**
     * RETURN true if the place is to drill, otherwise
     * return false.
     */

    public static boolean to_drill(double x, double y) {
        boolean result = false;
        // ci ho speso minuti inutili e poi mancava solo il casting a float...
        float raggio = (float) d / 4;

        double distanzaDalCentro = Math.sqrt(Math.pow(Math.abs(x), 2) + Math.pow(Math.abs(y), 2));

        // corona
        if (distanzaDalCentro <= raggio) {
            result = true;
        }
        // top right corner
        else if (distanzaDalCentro > (raggio * 2) && x > 0 && y > 0) {
            result = true;
        }
        // bottom left corner
        else if (distanzaDalCentro > (raggio * 2) && x < 0 && y < 0) {
            result = true;
        }

        return result;
    }

    public static void check(boolean expected, boolean actual) {
        if (expected != actual) {
            throw new AssertionError("\n\nERROR! Expected: " + expected + " Actual: " + actual + "\n");
        }
    }

    public static void main(String[] args) throws Exception {

        // inner radius
        check(true, to_drill(0, 0));
        check(true, to_drill(0.2 * d, 0));
        check(true, to_drill(0, 0.1 * d));
        check(true, to_drill(0, -0.03 * d));
        check(true, to_drill(-0.01 * d, -d * 0.05));
        // corona
        check(false, to_drill(0, -0.3 * d));
        check(false, to_drill(0.35 * d, 0));
        check(false, to_drill(0.4 * d, 0.27 * d));
        check(false, to_drill(0.31 * d, -0.4 * d));
        check(false, to_drill(-0.31 * d, 0.4 * d));
        check(false, to_drill(-0.3 * d, -0.38 * d));
        // corners
        check(true, to_drill(0.49 * d, 0.49 * d));
        check(false, to_drill(0.45 * d, -0.46 * d));
        check(false, to_drill(-0.48 * d, 0.45 * d));
        check(true, to_drill(-0.49 * d, -0.47 * d));

        System.out.println("\nSUCCESS\n");
    }
}
