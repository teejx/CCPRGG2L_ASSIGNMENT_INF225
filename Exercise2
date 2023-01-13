import java.util.Scanner;

public class activity2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        train("License");
        scan.close();
    }

    static void train(String license) {

        System.out.println("Training!");
        taste(license);

        String feedback = getFeedBack(license);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixRecipe(license);

            // Recursive call
            train(license);
        } else if (feedback.equals("yes")) {
            serve(license);
        }
    }

    static void taste(String license) {
        System.out.println("Getting Results");
    }

    static String getFeedBack(String license) {
        System.out.println("is your training enought to get a " + license + "? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRecipe(String license) {
        System.out.print("Enter missing skill:");
        String ingredient = scan.next();
        System.out.println("Fixing training. Added " + ingredient);
    }

    static void serve(String license) {
        System.out.println("Getting " + license);
    }

}
