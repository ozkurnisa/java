package java_101;


import java.util.Random;

public class java08_random_array {
    public static void main(String[] args) {
        // 0-100 arasında rastgele sayı 1000 elemanlı dizi olusturalım



        int[] dizi = new int[10000];


        Random r = new Random();
        int adet,toplam;
        adet = toplam = 0;

        for(int i=0;i<dizi.length;i++) {
            dizi[i] = r.nextInt(100);
            System.out.print(dizi[i]+"  ");
            if(dizi[i]%10==0) {
                adet++;
                toplam += dizi[i];
            }
        }

        System.out.println("\n10'a bölünen sayı adedi = "+adet);
        System.out.println("Toplam = "+toplam);
        if(adet>0) {
            float ort = (float)toplam/adet;
            System.out.println("Ortalama = "+ ort);
        }





    }
}
