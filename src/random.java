import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int randomNum;
        int userInput = 0;
        boolean valid = false;

        //game
        do {
            randomNum = 1 + (int)(Math.random() * ((10-1) + 1));
            System.out.println("guess the number! [1-10]");
            if (scan.hasNextInt()) {
               userInput = scan.nextInt();
                if (userInput == randomNum) {
                    System.out.println("You guessed it!");
                    valid = true;
                }
                else if (userInput < randomNum) {
                    System.out.println("my number was " +randomNum);
                    System.out.println("Your guess is low.");
                    scan.nextLine();
                }
                else if (userInput > randomNum) {
                    System.out.println("my number was " + randomNum);
                    System.out.println("Your guess is high.");
                    scan.nextLine();
                }
            }
            else {
                System.out.println("you entered and invalid data type!");
                scan.nextLine();
            }
        } while (!valid);
    }
}