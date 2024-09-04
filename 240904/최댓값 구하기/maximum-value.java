import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a가 최대값
        if ( a > b && c < a ) {
            System.out.println(a);
        }
        // b가 최대값
        if ( b > a && c < b ) {
            System.out.println(b);
        }
        // c가 최대값
        if ( c > a && b < c ) {
            System.out.println(c);
        }
    }
}