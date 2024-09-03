import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //입력
        Scanner sc = new Scanner(System.in);

        //A점수
        int a_math = sc.nextInt();
        int a_eng = sc.nextInt();

        //B점수
        int b_math = sc.nextInt();
        int b_eng = sc.nextInt();

        if ( a_math > b_math && a_eng > b_eng ) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}