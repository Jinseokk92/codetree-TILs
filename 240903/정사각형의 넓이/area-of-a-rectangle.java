import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 정사각형의 넓이 공식
        int square = n * n;

        System.out.println(square);

        if ( n < 5 ) System.out.println("tiny");
    }
}