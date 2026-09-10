//🔥 reverse the given number :

public class C4_Que3 {
    public static void main(String args[]) {

        int n = 60026052;
        int rev = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}