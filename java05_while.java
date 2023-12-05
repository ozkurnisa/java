package java_101;
import java.util.Scanner;

public class java05_while {

    public static void main(String[] args) {
        //while
        //do-while döngüleri
        int sayac = 0;

        while (sayac<10) {
            System.out.println(sayac + ". adım");
            sayac++;
        }

        //en az bir adım atar
        int sayac2 = 11;
        do {
            System.out.println(sayac2+" sayac2 değeri");
            //sayac2++;
        } while (sayac2<10);

        int sifre = 1234;
        int pass = 0;
        Scanner scan = new Scanner(System.in);




        while(sifre != pass)
        {
            System.out.print("Şifreyi giriniz:");
            pass = scan.nextInt();
            if(sifre==pass) break; //tek satır olduğu için {} blok açmadım
            else System.out.println("Yanlış şifre!");
        }

    }
}
