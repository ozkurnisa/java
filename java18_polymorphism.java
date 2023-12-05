package java_101;


class Hayvan{
    void ses() {
        System.out.println("Bu method ilgili hayvanýn çýkardýðý sesi belirtecek");
    }
}

class Kedi extends Hayvan{
    void ses() {
        System.out.println("miyav");
    }
}

class Kopek extends Hayvan{
    void ses() {
        System.out.println("hav hav");
    }
}

class Kurbaga extends Hayvan{
    void ses() {
        System.out.println("vrak vrak");
    }
}

class HayvanSesi extends Hayvan{
    void ses(Hayvan h) { //polymorphism
        h.ses();
    }
}

public class java18_polymorphism {
    public static void main(String[] args) {
        // Polymorphism - Çok biçimlilik
        Kedi kedi = new Kedi();
        //kedi.ses();

        Kopek kopek = new Kopek();
        //kopek.ses();

        Kurbaga kurbaga = new Kurbaga();
        //kurbaga.ses();

        HayvanSesi hs = new HayvanSesi();
        hs.ses();
        hs.ses(kedi);
        hs.ses(kurbaga);

    }

}



