package java_101;
import java.util.Scanner;

public class java06_fibonacci {
    public static void main(String[] args) {
        // kullanıcının istediği aralıktaki fibo
        int a, b, c, baslangic, bitis;
        a = c = 0;
        b = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değeri:");
        baslangic = scan.nextInt();
        System.out.println("Bitiş değeri:");
        bitis = scan.nextInt();
        int sayac = 1;
        while (c < bitis) {
            c = a + b;
            if (c > baslangic && c < bitis) {
                System.out.println(sayac + ". bulunan Fibo =" + c);
            }
            sayac++; //kaçıncı fibo olduğunu bulmak için ekledik
            a = b;
            b = c;
        }


    }
}
