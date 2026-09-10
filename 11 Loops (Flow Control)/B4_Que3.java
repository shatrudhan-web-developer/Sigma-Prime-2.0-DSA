//Print sum of n natural numbers :

import java.util.Scanner;

public class B4_Que3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Input from user
        System.out.print("Enter number for print sume n natural number : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        //Print sum of n natural number
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of n natural numbers = " + sum );
    }
}