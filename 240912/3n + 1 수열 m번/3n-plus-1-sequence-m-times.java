import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for ( int i = 0; i < m; i++ ) {
            int n = sc.nextInt();
        int cnt = 0;
            //짝수
            //홀수
            //1이 되기 전까지 반복
            while ( n != 1 ) {
                if ( n % 2 == 0 ) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                cnt ++;
            } 
                System.out.println(cnt);

            
        }
    }
}