import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //과목 수
        int n = sc.nextInt();

        double sum = 0;
        int cnt = 0;
        double grd;

        double[] arr = new double[n];

        for ( int i = 0; i < n; i++ ) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
            cnt++;
        }
        
        double avg = (double) sum / cnt;
        System.out.printf( "%.1f", avg  );
        System.out.println();

        if ( avg >= 4.0 ) {
            System.out.println("Perfect");
        } else if ( avg >= 3.0 ) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}