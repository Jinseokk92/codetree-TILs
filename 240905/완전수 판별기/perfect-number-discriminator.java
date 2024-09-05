import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int cnt = 0;

        // n의 약수는 1부터 나누었을 때 나머지가 0이 되는 숫자
        for ( int i = 1; i < n; i++ ) {
            if ( n % i == 0 ) {
                sum += i;
            }
        }

        if ( sum == n ) {
            System.out.println("P");
        } else {
            System.out.println("N");
        }

    
    }
}