import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // a와 b를 비교
    if ( a > b ) {
      // a > b > c
      if ( b > c ) {
        System.out.println(b);
      // b < c < a  
      } else if ( a > c ) {
        System.out.println(c);
      // c > a > b
      } else {
        System.out.println(a);
      }
      // c < a < b
    } else if ( a > c ) {
        System.out.println(a);
      // a < c < b
    } else if ( b > c ) {
        System.out.println(c);
    }

    }
}