import java.util.Scanner;

/**
 * This is a program that takes user input, and spits out cool names/numbers for the user
 * @ 10/03/2022
 * @author 23benjamin
 */

public class SimpleIOMath { // to get everything needed and to store/return variables.

    /**
     *Take input from the user
     */
    private String name;
    private int age;
    private int favNumber;




    public void promptUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("* Sit yourself down, take a seat *\n" + // Get the user input
                "* All you gotta do is repeat after me *");

        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        age= in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = in.nextInt();
    }

    /**
     * Prints the info user entered and a few more things
     */
    public void printInfo() { // write out dialogue and return cool information
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age+1));
        System.out.println("The first prime factor of " + age + " is " + smallestPrimeFactor(age));
        System.out.println("Your favorite number squared is: " + (int)(Math.pow(favNumber, 2)));
        System.out.println("* end of program *");
    }

    private boolean isPrime(int num) { // find out if the number is prime
        for (int i = 2; i <= (int)(Math.sqrt(num)); i++) {
            if(num% i== 0)
                return false;

        }
        return true;
    }
    private int smallestPrimeFactor(int num) { // finds what the smallest prime number of the user input is
        for (int i = 2; i < num; i++)
            if (isPrime(i)) {
                if (num % i==0)
                    return i;
            }
        return num;
    }

    /**
     * Main method for class SimpleIOMath
     * @param args command-line arguments, if needed
     */
    public static void main(String[] args) { //calls everything
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();
        System.out.println("My favorite AP Comp Sci teacher is Ani.");

    }
}

