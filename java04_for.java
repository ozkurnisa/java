package java_101;

public class java04_for {
    public static void main(String[] args) {
        int i;

        for(i=0;i<100;i++) {
            System.out.println(i + ". adým");
        }

        for(i=0;i<100;i+=5) {
            System.out.println("i adým deðeri = "+ i );
        }

        for(i=1000;i>=0;i-=5) {
            System.out.println("i adým deðeri = "+ i );
        }

    }
}
