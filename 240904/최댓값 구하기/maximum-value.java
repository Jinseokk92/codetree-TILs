import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a와 b를 비교
            // a와 c를 비교
        if ( a >= b ) {
            if ( a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        // b와 c를 비교
        } else if ( b >= c ) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        
      


    }
}