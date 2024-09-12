import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 학생 수
        int n = sc.nextInt();

        // 통과한 학생 수
        int cnt = 0;
        double avg;

        for ( int i = 0; i < n; i++ ) {
            int[] arr = new int[4];
            int sum = 0;
            
            for ( int j = 0; j < 4; j++ ) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            avg = (double)sum / 4;

            if ( avg >= 60 ) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }
        
        System.out.print(cnt);

    }
}