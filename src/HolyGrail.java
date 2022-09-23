import java.util.Objects;
import java.util.Scanner;

/**
 * Simple I/O
 * @version 09.23.2022
 * @author 23benjamin
 */



public class HolyGrail {
    /**
     * Main method of class HolyGrail
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) { // to get everything needed and to store/return variables.
        String name, quest, color;
        Scanner in = new Scanner(System.in);


        System.out.println(" * A chat with the bridge keeper *\n" + "Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        System.out.print("Question 1: What is your name? "); // Gets the username and stores it
        name=in.nextLine();
        if (Objects.equals(name, "Julian Cochran")) { // Easter egg
            System.out.println("Please give me an 100");
        }
        System.out.print("Question 2:What is your quest? "); // Gets the user's answers to see if they are worthy of crossing the bridge
        quest=in.nextLine();
        System.out.print("Question 3:What is your favorite color? "); // Gets/stores user fave color
        color=in.nextLine();

        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");


        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is: " + color);
        System.out.println("* end of program *"); // Returns name, quest, and color to user. This what was asked earlier...


    }
}
