import java.util.ArrayList;
import java.util.Random;

public class randomliste {


	public static void main(String[] args) {
		// Bir liste tanımlayarak içini 0-50 arasında rastgele üretilmiş 100 sayı ile doldurunuz?


		ArrayList<Integer> list = new ArrayList<>();

		Random r = new Random();

		for (int i=0;i<50;i++)list.add(r.nextInt(100));

		System.out.println(list);


	}

}
