//🔥 do-while Loop :

/*
do-while loop ka use kisi statement ya code block ko baar-baar execute karne ke liye hota hai.

Isme code kaam se kaam ek baar zaroor execute hota hai, chahe condition true ho ya false.

📌 Syntax :
    do {
    // Code
    } while(conditaion);
*/

public class D4 {
    public static void main(String args[]) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while(i <= 10);
    }
}