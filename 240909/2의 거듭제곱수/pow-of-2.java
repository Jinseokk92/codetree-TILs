import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prod = 1;
        int x = 0;

        while ( true ) {
            if ( n = prod ) {
                break;
            }

            prod *= 2;
            x++;
        }
        System.out.println(x);
    }
}