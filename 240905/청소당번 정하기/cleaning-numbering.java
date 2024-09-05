import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 입력 받을 청소일
        int n = sc.nextInt();

        // 2일 3일 12일
        int two = 0;
        int three = 0;
        int twelve = 0;

        for ( int i = 1; i <= n; i++ ) {

            if ( i % 12 == 0 ) {
                twelve++;
            } else if ( i % 3 == 0 ) {
                three++;
            } else if ( i % 2 == 0 ) {
                two++;
            }
        }

        System.out.print( two + " " + three + " " + twelve );


    }
}