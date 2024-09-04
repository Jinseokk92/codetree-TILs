import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print( a / b + "." );

        // 소수 첫째자리 진입
        a %= b;

        for ( int i = 0; i < 20; i++ ) {
            // a를 b로 나눈 나머지에서 10을 곱한 후 다음 자릿수의 몫을 구함
            a *= 10;
            System.out.print( a / b );

            a %= b;    
            
        }
        
    }
}