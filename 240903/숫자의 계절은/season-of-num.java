import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        // 3 4 5 봄 => Spring
        // 6 7 8 여름 => Summer
        // 9 10 11 가을 => Fall
        // 12 1 2 겨울 => Winter

        if ( m >= 3 && m <= 5 ) {
            System.out.println("Spring");
        } else if ( m >= 6 && m <= 8 ) {
            System.out.println("Summer");
        } else if ( m >= 9 && m <= 11 ) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
    }
}