import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for ( int i = 1; i < 10; i++ ) {
            for ( int j = b; j >= a; j--  ) {
                // 짝수일 때만 for문 수행
                if ( j % 2 == 0 ) {
                    System.out.print( j + " * " + i + " = " + ( i * j ) );
                    if ( j != a ) {
                        System.out.print(" / ");
                    }
                }
            }
            System.out.println();
        }
    }
}