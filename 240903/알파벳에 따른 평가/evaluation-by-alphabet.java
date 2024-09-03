import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //입력
        Scanner sc = new Scanner(System.in);
        String value = sc.next();

        // 문자열의 첫 번째에 위치한 문자 가져오기
        char s = value.charAt(0);

        // 조건문
        if ( s == 'S' ) {
            System.out.println("Superior");
        } else if ( s == 'A' ) {
            System.out.println("Excellent");
        } else if ( s == 'B' ) {
            System.out.println("Good");
        } else if ( s == 'C' ) {
            System.out.println("Usually");
        } else if ( s == 'D' ) {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}