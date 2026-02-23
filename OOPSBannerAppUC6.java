public class OOPSBannerAppUC6 {

    // Static method for letter O
    public static String[] getO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method for letter P
    public static String[] getP() {
        return new String[] {
            "****** ",
            "*     *",
            "****** ",
            "*      ",
            "*      "
        };
    }

    // Static method for letter S
    public static String[] getS() {
        return new String[] {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Loop-based banner rendering
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}