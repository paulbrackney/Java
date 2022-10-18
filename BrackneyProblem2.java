import java.util.Scanner;

public class BrackneyProblem2 {
    
    public static void main(String[] args){

    System.out.println("Enter a positive number n to generate the list of primes between 1 and n. The sum of these primes will also be output.");

    Scanner scnr = new Scanner(System.in);
    int n = scnr.nextInt();

    System.out.print("List of primes: ");
    int i;
    int count;
    int sum = 0;
    for (i = 1; i <= n; i++){
        count = 0;
        int j;
        for(j = 1; j < i; j++){
            if(i%j == 0){
                count++;
            }
        }
        if(count == 1){
            System.out.print(i + ", ");
            sum += i;
        }
    }
    System.out.println();
    System.out.print("The sum of these primes is " + sum + ".");
    }

}