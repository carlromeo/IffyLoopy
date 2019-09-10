import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String userInput= "y";
        boolean userInput2;


        while ((!userInput.equalsIgnoreCase("y")) || (userInput.equalsIgnoreCase("Yes)"))) {
            System.out.println("Are your eyes red?");
            userInput = keyboard.nextLine();
            if ((!userInput.equalsIgnoreCase("y")) || (userInput.equalsIgnoreCase("Yes)"))) {
                userInput2 = false;
            } else {
                userInput2 = true;
            }

            if (userInput2 == false) ;
            System.out.println("Get some sleep!");

        }else{
            System.out.println("You look great!");
        }
        System.out.println("Do you want to play again");
        userInput= keyboard.nextLine();

    }
}
