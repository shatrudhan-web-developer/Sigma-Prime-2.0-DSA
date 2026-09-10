public class C4_Que2 {
    public static void main(String args[]) {

        int n = 25062006;

        while(n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit); 
            n = n / 10;
        }
        System.out.println();
    }
}
