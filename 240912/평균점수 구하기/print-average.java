import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 8;
        double sum = 0;

        double[] arr = new double[cnt];

        for ( int i = 0; i < cnt; i++ ) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double avg = sum / cnt;

        System.out.printf( "%.1f", avg );
    }
}