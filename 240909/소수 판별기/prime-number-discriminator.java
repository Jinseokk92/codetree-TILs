import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean valid = false;

        for ( int i = 1; i <= n; i++ ) {
            if ( n % 1 == 0 && n % i == 0 ) {
                valid = true;
            }
        }

        if ( valid == true ) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }
    }
}