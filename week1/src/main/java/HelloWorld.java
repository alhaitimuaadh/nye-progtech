public class HelloWorld {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter your name!");
            return;
        }

        String name = args[0];
        String language = "hun";

        if (args.length >= 2) {
            language = args[1];
        }

        switch (language) {
            case "hun":
                System.out.println("Szia, " + name + "!");
                break;

            case "eng":
                System.out.println("Hello, " + name + "!");
                break;

            case "ger":
                System.out.println("Hallo, " + name + "!");
                break;

            default:
                System.out.println("Unsupported language!");
        }
    }
}