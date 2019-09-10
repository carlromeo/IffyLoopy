import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String space = "";
        String response = "y";
        String userInput = "y";
        boolean userInput2;

        while (!(userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("No"))) {
            System.out.println("Please type 5 words, hitting enter when you complete each word.");
            for (int i = 0; i < 5; i++) {
                space += keyboard.next() + " ";
            }

            System.out.println(space);
            keyboard.nextLine();

            System.out.println("Are your eyes red after all that typing?");
            response = keyboard.next() + " ";
        if ((response.equalsIgnoreCase("y")) || (response.equalsIgnoreCase("Yes)"))) {
            userInput2 = true;
        } else {userInput2 = false;}

        if (userInput2) {
            System.out.println("Get some sleep!");
        } else {
            System.out.println ("You look great!");
        }
        System.out.println("Do you want to play again");
        userInput = keyboard.nextLine();
        space = "";
        }


    System.out.println("Goodbye then!");

    }
}


//while ((userInput.equalsIgnoreCase("y")) || (userInput.equalsIgnoreCase("Yes)"))) {
//        System.out.println("Are your eyes red?");
//        userInput = keyboard.nextLine();
