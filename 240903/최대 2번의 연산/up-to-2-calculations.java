import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //조건문
        if ( a % 2 == 0 ) {
            a /= 2;
            
        } 

        if ( a % 2 == 1 ) {
            a = ( a + 1 ) / 2;
            
        }

        System.out.println(a);
    
    }
}