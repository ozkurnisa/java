package java_101;

import java.util.Scanner;

public class java01_baslangic {



        public static void main(String[] args) {
            System.out.println("Hello world!");
            // Açıklama satırları // yazılır
            /*
             * birden fazla açıklama satırı
             * için /* kullanılır
             * çok satırlı açıklama
             */

            // Java'da bloklar { } başlar biter.
            // Java'da her projede en az bir tane main
            //method bulunmalıdır.

            int a = 5; //integer tamsayı
            float b = (float)2.5; //float kesirli
            float c = 3.5f; //casting

            float d = a + b;
            System.out.println("d değişkeni ="+d);

            int e = (int) (a + b);
            System.out.println("e değişkeni ="+e);

            String isim = "ali";
            System.out.println("java'ya hoşgeldin " + isim);

            boolean durum = false;
            System.out.println(durum);

            //Veri almak
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir sayı giriniz:");
            int g = scan.nextInt();

            System.out.println("Bir sayı daha giriniz:");
            int h = scan.nextInt();

            System.out.println("g + h ="+(g+h));

            System.out.println("İsminizi giriniz:");
            String ad = scan.next(); // next boşluğa kadar okur
            //scan.nextLine(); tüm satırı okur
        }

}
