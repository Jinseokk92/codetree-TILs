import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a = 2, b = 13
        for ( int i = a; i <= b; ) {
            System.out.print( i + " " );
            if ( i % 2 == 1 ) {
                i *= 2;
            } else {
                i += 3;
            }
        }
    }
}