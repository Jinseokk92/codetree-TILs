import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 문자 c
        String value = sc.next();
        char c = value.charAt(0);

        // 실수 a, b
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(c);
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f", b);
    }
}