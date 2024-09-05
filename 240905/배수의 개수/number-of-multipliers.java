import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        // 3의 배수와 5의 배수 개수
        int threeCnt = 0;
        int fiveCnt = 0;

        for ( int i = 0; i < 10; i++ ) {
        // 10개의 숫자 중 입력받은 값들
        int num = sc.nextInt();
            if ( num % 3 == 0 ) {
                threeCnt++;
            }  
            
            if ( num % 5 == 0 ) {
                fiveCnt++;
            }
        }

        System.out.print( threeCnt + " " + fiveCnt );
    }
}