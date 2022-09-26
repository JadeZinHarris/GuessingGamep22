import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Howdy, what's your name?");
        System.out.println("(type in your name) ");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        Random ran = new Random();
        int number = ran.nextInt(100);

        System.out.println(name + " I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");

        Random rand = new Random();
        int num = rand.nextInt(100);
        int tries = 0;
        while (true) {

            int guess = input.nextInt();

            tries = tries + 1;

            if (guess < num) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > num) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + tries + " tries!");
                break;
            }
            }
        }
        }

