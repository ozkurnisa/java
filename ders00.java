package javaproje;
import java.util.Scanner;

public class ders00 {

	public static void main(String[] args) {
		// A��klama sat�rlar� // yaz�l�r
		/*
		 * birden fazla a��klama sat�r�
		 * i�in /* kullan�l�r
		 * �ok sat�rl� a��klama
		 */
		
	// Java'da bloklar { } ba�lar biter.	
	// Java'da her projede en az bir tane main
		//method bulunmal�d�r.
		
		int a = 5; //integer tamsay�
		float b = (float)2.5; //float kesirli
		float c = 3.5f; //casting
		
		float d = a + b;
		System.out.println("d de�i�keni ="+d);
		
		int e = (int) (a + b);
		System.out.println("e de�i�keni ="+e);
		
		String isim = "ali";
		System.out.println("java'ya ho�geldin " + isim);

		boolean durum = false;
		System.out.println(durum);
		
		//Veri almak
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz:");
		int g = scan.nextInt();
		
		System.out.println("Bir say� daha giriniz:");
		int h = scan.nextInt();
		
		System.out.println("g + h ="+(g+h));
		
		System.out.println("�sminizi giriniz:");
		String ad = scan.next(); // next bo�lu�a kadar okur
		//scan.nextLine(); //t�m sat�r� okur
	}

}
