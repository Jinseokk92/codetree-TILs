import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // a가 중앙값
    // c < a < b, b < a < c
    if ( (a > b && a < c) || (a > c && a < b) ) {
        System.out.println(a);
    }  
    // b가 중앙값
    // a < b < c, c < b < a
    else if ( (b > a && b < c) || (b > c && b < a) ) {
        System.out.println(b);
    }  
    // c가 중앙값
    // a < c < b, b < c < a
    else {
        System.out.println(c);
    }

    }
}