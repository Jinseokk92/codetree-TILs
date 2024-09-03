import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        //입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //113 이상이면 1, 그 외에는 0
        if ( a >= 113 ) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}