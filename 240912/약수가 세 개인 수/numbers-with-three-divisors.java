import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for ( int i = start; i <= end; i++ ) {
            // 초기화
            int cnt_ = 0;
            for ( int j = 1; j <= i; j++ ) {
                if ( i % j == 0 ) {
                    cnt_++;
                }
            } 

            if ( cnt_ == 3 ) {
                cnt++;
            }
        }
        System.out.println(cnt);

     }
}