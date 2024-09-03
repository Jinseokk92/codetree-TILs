import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        // 입력받을 정수 a, b
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 사칙연산 수행
        
        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a / b );
        System.out.println( a % b );
    }
}