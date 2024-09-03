import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 입력받은 수 중 최소값
        // a <= b, a <= c
        if ( a <= b && a <= c ) {
            System.out.println(a);
        } else
        // b <= a, b <= c
        if ( b <= a && b <= c ) {
            System.out.println(b);
        } else
        // c <= a, c <= b 
        if ( c <= a && c <= b ) {
            System.out.println(c);
        }

    }
}