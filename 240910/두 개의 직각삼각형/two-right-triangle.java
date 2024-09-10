import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int i = 0; i < n; i++ ) {
            // 왼쪽 삼각형 
            for ( int j = 0; j < n - i; j++ ) {
                System.out.print("*");
            }

            // 공백
            for ( int j = 0; j < ( 2 * i )  ; j++ ) {
                System.out.print(" ");
            }

            // 대칭 삼각형
            for ( int j = 0; j < n - i ; j++ ) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}