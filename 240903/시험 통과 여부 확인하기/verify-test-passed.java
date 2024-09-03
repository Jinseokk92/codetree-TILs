import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 점수가 80이상이면 pass, otherwise "O more score"
        if ( n >= 80 ) {
            System.out.println("pass");
        } else {
            System.out.println( (100-n) + " more score" );
        }
    }
}