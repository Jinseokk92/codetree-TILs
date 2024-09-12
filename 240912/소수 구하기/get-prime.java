import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int i = 1; i <= n; i++ ) {
            if ( i == 1 ) continue;
            // 들어오는 값을 소수라 가정
            boolean isPrime =  true;
            for ( int j = 2; j < i; j++) {
                if ( i % j == 0 ) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.print( i + " " );
            }
        }
    }
}