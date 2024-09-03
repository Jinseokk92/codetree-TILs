import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //입력
        Scanner sc = new Scanner(System.in);
        int attNum = sc.nextInt();

        //조건문
        if ( attNum == 1 ) {
            System.out.println("John");
        } else if ( attNum == 2 ) {
            System.out.println("Tom");
        } else if ( attNum == 3 ) {
            System.out.println("Paul");
        } else {
            System.out.println("Vacancy");
        }
    }
}