import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        int current = n;

        for ( int i = 1; i <= n; i++ ) {
            int division = current / i;

            if ( division <= 1 ) {
                cnt++;
                break;
            } 
            
            current = division;
            cnt++;
        }
        
        System.out.println(cnt);
    }
}