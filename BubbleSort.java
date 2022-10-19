import java.util.*;

public class BubbleSort {
    public static void main(String[] args){

        //initialize array A and set inital values
        int[] A = new int[5];
        A[0] = 15;
        A[1] = 35;
        A[2] = 26;
        A[3] = 30;
        A[4] = 8;

        //print original values to the console
        System.out.print("Original value of A is: [");
        for (int i = 0; i < 4; i++){
            System.out.print(A[i] + ",");
        }
        System.out.println(A[4] + "]");

        //perform the bubble sort
        int end = A.length - 1;
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int j = 0; j < end; j++){
                if (A[j] > A[j+1]){
                    //swap elements
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    flag = true;
                }
            }
            end--;
        }

        //print new values to the console 
        System.out.print("New value of A is: [");
        for (int i = 0; i < 4; i++){
            System.out.print(A[i] + ",");
        }
        System.out.println(A[4] + "]");
    }

        
}