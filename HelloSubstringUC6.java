public class HelloSubstringUC6 {

    public static void main(String[] args) {

        if (args.length > 0) {

            String names = "";

            for (String name : args) {
                names += name + ", ";
            }

            // Remove trailing comma and space
            names = names.substring(0, names.length() - 2);

            System.out.println("Hello " + names);

        } else {
            System.out.println("Hello, World!");
        }

    }

}