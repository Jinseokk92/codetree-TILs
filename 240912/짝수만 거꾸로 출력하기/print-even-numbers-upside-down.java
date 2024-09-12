import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for ( int i = 0; i < n; i++ ) {
          arr[i] = sc.nextInt();
          // 2 4 5 7 8 10
          for (int j = 0; j < n; j++) {
            System.out.print( arr[n - j - 1] + " " );
          }

        }
    }
}