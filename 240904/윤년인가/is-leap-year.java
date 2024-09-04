import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        // 윤년 vs 평년
        // 예외: 100의 배수고, 400으로 나누어 떨어지지않을 때는 평년
        if ( y % 4 == 0 ) {
            if ( y % 100 == 0 ) {
                if ( y % 400 == 0 ) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("true");
            }
        } else {
            System.out.println("false");
        }
    }
}