import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //최소값
        if ( a <= b && a <= c ) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
        
        if ( a == b && b == c && a == c ) {
            System.out.print(" 1");
        } else {
            System.out.print(" 0");
        }
    }
}