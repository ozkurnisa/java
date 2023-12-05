package java_101;


import javax.swing.JFrame;

class Cokgenler{
    int kenar_sayisi;
    int yukseklik;
    int taban;
    public String tur;

    int alan() {
        return ((taban*yukseklik)/2)*kenar_sayisi;
    }
}

class Ucgen extends Cokgenler{ //üçgen sınıfı extends ifadesi ile çokgen sınıfından miras alır.
    int aci_a,aci_b,aci_c;

    //cokgenden miras aldığı alan() methodunu iptal ediyoruz
    // bu olaya override denir.
    int alan() {
        return (taban*yukseklik)/2;
    }
}

class Dikucgen extends Ucgen{

}

//varolan sınıflardan da miras alınabilir
class UI extends JFrame{

}

public class java17_inheritance {

    public static void main(String[] args) {
        // Inheritance - Miras alma - Kalıtım
        Ucgen u = new Ucgen(); //ucgen sınıfı extend edilen cokgen sınıfından tüm attributleri alabilir
        u.kenar_sayisi=5;
        u.aci_a = 72; //kendi içindeki attribute
        u.alan();

        Dikucgen du = new Dikucgen(); // ucgen sınıfından miras alır
        //ucgen sınıfı da cokgen sınıfından miras alır
        du.alan();

        UI f = new UI();// javanın sınıfı olan JFrame sınıfından miras aldık.
        f.getBackground();


    }
}
