import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //for문 돌면서 홀수면서 3의 배수인 정수만 출력
        for ( int i = 1; i <= N; i++ ) {
            int n = sc.nextInt();
            if ( n % 2 == 1 && n % 3 == 0 ) {
                System.out.println(n);
            }
        } 
    }
}