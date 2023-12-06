package proje;

import java.util.Scanner;

public class vize_final_hesaplama {

    public static void main(String[] args) {
        // . Kullan�c�dan vize ve final notunu al�n�z, notunun harf kar��l���n�(AA-BA-BB��.)
        //if-else if bloklar� kullanarak  yazd�r�n�z

        Scanner scan = new Scanner(System.in);
        int vize_n,final_n;
        double sonuc;

        System.out.println("vize notunu gir:");
        vize_n = scan.nextInt();

        System.out.println("final notunu gir:");
        final_n = scan.nextInt();


        sonuc = (vize_n*0.4+final_n*0.6);
        System.out.println("ders notu:"+sonuc);



        if (sonuc>=90 && sonuc>=100) {
            System.out.println("harf notu AA");
        }
        else if(sonuc>=85 && sonuc<90) {
            System.out.println("harf notu BA");
        }
        else if(sonuc>=75 && sonuc<85) {
            System.out.println("harf notu BB");
        }
        else if(sonuc>=70 && sonuc<75) {
            System.out.println("harf notu CB");
        }
        else if(sonuc>=60 && sonuc<70) {
            System.out.println("harf notu CC");
        }
        else if(sonuc>=55 && sonuc<60) {
            System.out.println("harf notu DC ");
        }
        else if(sonuc>=45 && sonuc<55) {
            System.out.println("harf notu FF");
        }
    }

}
