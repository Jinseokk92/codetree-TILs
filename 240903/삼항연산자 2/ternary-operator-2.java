import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //삼항연산자
        String result = ( a == 1 ) ? "t" : "f";
        System.out.println(result);
    }
}