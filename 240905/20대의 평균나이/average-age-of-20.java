import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double avg = 0;
        int cnt = 0;
        int sum = 0;

        while ( true ) {
            int n = sc.nextInt();
            
            //System.out.println(n);
            sum += n;
            cnt ++;

            if ( n < 20 || n >= 30 ) {
                break;
            }
        }

        if ( cnt > 0 ) {
            avg = (double) sum / cnt; 
        }

        System.out.printf( "%.2f", avg );
    
    }
}