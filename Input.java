import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // getInput is a variable, can be also just scanner
        Scanner getInput = new Scanner(System.in);

        // Asking what the user's name is
        System.out.println("Hi there, what's your name? ");

        // Getting input
        String name = getInput.nextLine();

        // Output the input
        System.out.println("Hi there " + name + ", nice to meet you!");

    }
}