public class HelloEnhancedUC5 {

    public static void main(String[] args) {

        if (args.length > 0) {

            System.out.print("Hello ");

            for (String name : args) {
                System.out.print(name + " ");
            }

            System.out.println();

        } else {
            System.out.println("Hello, World!");
        }

    }

}