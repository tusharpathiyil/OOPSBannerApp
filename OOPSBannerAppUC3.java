public class OOPSBannerAppUC3 {

    public static void main(String[] args) {

        String space = " ";
        String star = "*";

        String line1 = String.join("",
                space, "*****", repeat(space,3),
                "*****", repeat(space,3),
                "*****", repeat(space,3),
                "*****");

        String line2 = String.join("",
                star, repeat(space,5), star, space,
                star, repeat(space,5), star, space,
                star, repeat(space,5), star, space,
                star, repeat(space,5));

        String line3 = line2;

        String line4 = String.join("",
                star, repeat(space,5), star, space,
                star, repeat(space,5), star, space,
                "*****", repeat(space,3),
                "*****", space);

        String line5 = String.join("",
        star, repeat(space,5), star, space,
        star, repeat(space,5), star, space,
        star, repeat(space,11), star, space);


        String line6 = line5;

        String line7 = String.join("",
                space, "*****", repeat(space,3),
                "*****", repeat(space,2),
                star, repeat(space,7),
                "*****", space);

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }

    public static String repeat(String str, int count) {
        return String.join("", java.util.Collections.nCopies(count, str));
    }
}

