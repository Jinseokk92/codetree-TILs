import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        // A, B, C, D 진료소에 따른 분류번호로 쓸 변수
        int cnt = 0;

        int[] countArr = new int[5];
        
        for ( int i = 0; i < 3; i++ ) {
            // 증상과 체온 
            char s = sc.next().charAt(0);
            int t = sc.nextInt();

            if ( s == 'Y' && t >= 37 ) {
                cnt = 1;
            } else if ( t >= 37 ) {
                cnt = 2;
            } else if ( s == 'Y' ) {
                cnt = 3;
            } else {
                cnt = 4;
            }
            countArr[cnt]++;
        }

        for ( int i = 1; i <= 4; i++ ) {
            System.out.print( countArr[i] + " " );
        }

        if ( countArr[1] >= 2 ) {
            System.out.print("E");
        }
    }
}