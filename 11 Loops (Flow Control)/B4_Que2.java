//Print number 1 to n :

import java.util.Scanner;

public class B4_Que2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter number from print counting : ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}