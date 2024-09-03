import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        // A의 수학, 영어점수
        int aMath = sc.nextInt();
        int aEng = sc.nextInt();

        // B의 수학, 영어점수
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        if ( aMath > bMath || (aMath == bMath && aEng > bEng) ) {
            System.out.println("A");
        } else {
            System.out.println("B");   
        }
    }
}