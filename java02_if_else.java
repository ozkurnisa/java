package java_101;

public class java02_if_else {
    public static void main(String[] args) {


        int a, b, c;
        a = 4;
        b = 5;
        c = 7;

        if (a > b) {
            System.out.println("A sayisi B sayisindan büyüktür");
        } else if (b > a) {
            System.out.println("B sayisi A sayisindan büyüktür");
        } else {
            System.out.println("eşit");
        }

        //üç sayıdan en büyüğünü bulalım
        if (a >= b && a >= c) {
            if (a == b) {
                System.out.println("A = B en büyük");
            } else if (a == c) {
                System.out.println("A = C en büyük");
            } else {
                System.out.println("A en büyük");
            }

        } else if (b >= a && b >= c) {
            if (a == b) {
                System.out.println("A = B en büyük");
            } else if (b == c) {
                System.out.println("B = C en büyük");
            } else {
                System.out.println("B en büyük");
            }

        } else {
            if (a == c) {
                System.out.println("A = C en büyük");
            } else if (b == c) {
                System.out.println("B = C en büyük");
            } else {
                System.out.println("C en büyük");
            }


        }
    }
}
