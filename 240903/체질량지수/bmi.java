import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 입력
        Scanner sc = new Scanner(System.in);
        
        // 키와 몸무게
        int h = sc.nextInt();
        int w = sc.nextInt();

        // BMI 계산식
        int b = (10000 * w) / (h * h);

        System.out.println(b);

        if ( b >= 25 ) {
            System.out.println("Obesity");
        }
        
    }
}