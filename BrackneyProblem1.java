import java.util.Scanner;
import java.util.*;

public class BrackneyProblem1 {
    public static void main(String[] args){
        System.out.println("Please enter an integer number corresponding to a duration expressed in minutes:");
        Scanner scnr = new Scanner(System.in);
        int input = scnr.nextInt();
        System.out.println("You entered " + input + " minutes.");

        int hours;
        hours = input/(60);
        int minutes = input%60;

        System.out.println(input + " minutes is equal to " + hours + " hours, " + minutes + " minutes");
    }
}
