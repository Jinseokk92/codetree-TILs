import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //입력 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //a, b에 대한 조건문
        if ( a % 2 == 0 ) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if ( b % 2 == 0 ) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}