package java_101;

public class java11_method {

    static void hosgeldinYaz() {
        System.out.println("Methodlara hoþgeldiniz!");
    } //bu method hem deðer döndürmüyor, hem de değer almýyor

    static int topla(int a, int b) {// int türünde deðeri return edecek
        return a+b;
    } //bu method hem deðer döndürür, hem de deðer alýr

    static void isimleHosgeldinYaz(String isim) {
        System.out.println(isim + " hoşgeldin");
    }//değer alıyor ama döndürmüyor

    static String degerAlmadanDegerDondur(){
        return "Bu yazı da method ile yazdırıldı";
    }// deðer almýyor ama deðer döndürüyor


    public static void main(String[] args) {
        // methodlar
        // java projesinde en az bir tane main method bulunmalýdýr
        // sýnýf içerisinde ise
        // istenildiði kadar method oluþturulabilir
        hosgeldinYaz();
        hosgeldinYaz();

        int sonuc;
        sonuc = topla(13,29);
        System.out.println(sonuc);
        System.out.println(topla(67,56));

        isimleHosgeldinYaz("Mahmut");

        System.out.println(degerAlmadanDegerDondur());
    }

}
