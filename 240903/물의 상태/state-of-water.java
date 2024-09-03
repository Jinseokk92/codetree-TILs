import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 조건문
        if ( n > 100 ) {
            System.out.println("vapor");
        } else if ( n < 0 ) {
            System.out.println("ice");
        } else {
            System.out.println("water");
        }
    }
}