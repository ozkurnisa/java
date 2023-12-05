package java_101;
import java.util.Scanner;

public class java03_switch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir seçim yapınız\n"+
                "Kalan bakiye için 1'e basınız\n"+
                "Borç bilgileri için 2'ye basınız\n"+
                "Hesap bilgileri için 3'e basınız\n"+
                "Çıkış için 0'a basınız"
        );
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Kalan miktar 0 tl");
                break;
            case 2:
                System.out.println("Borç miktarı 1000000 tl");
                break;
            case 3:
                System.out.println("Hesap açılış tarihi 02/03/2022");
                break;
            case 0:
                System.out.println("Çıkış");
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz!");
                break;
        }





    }
}
