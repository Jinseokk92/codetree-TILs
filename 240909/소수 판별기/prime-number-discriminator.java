import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean valid = true;

        for ( int i = 2; i < n; i++ ) {
            if ( n % i == 0 ) {
                valid = false;
            }
        }

        if ( valid == true ) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }
    }
}