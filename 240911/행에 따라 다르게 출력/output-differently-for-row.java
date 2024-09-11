import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                //짝수
                if ( i % 2 == 0 ) {
                    System.out.print( cnt + " " );
                    cnt++;

                //홀수 => 이전 행 마지막번호보다 +2
                } else {
                    cnt +=2;
                    System.out.print( cnt + " " );
                }
               
            }


            System.out.println();
            
        }
    }
}