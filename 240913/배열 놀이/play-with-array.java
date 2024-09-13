import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for ( int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }

        for ( int j = 0; j < q; j++ ) {
            int qType = sc.nextInt();

            // 질의 1, 질의 2, 질의 3
            if ( qType == 1 ) {
                // a번 째 원소 
                int a = sc.nextInt();
                System.out.println(arr[a - 1]);

            } else if ( qType == 2 ) {
                int b = sc.nextInt();
                int idx = -1;
                
                // n개의 원소 중 b인 원소를 찾고, 몇 번째인지 출력
                for ( int k = 0; k < n; k++ ) {
                    if ( arr[k] == b ) {
                        idx = k;
                        break;
                    }
                }

                System.out.println(idx + 1);
            } else {
                // s번째~e번째 원소까지 공백으로 구분해서 출력
                int s = sc.nextInt();
                int e = sc.nextInt();

                // 1 2 3 4 => m=1-1; m<4; m++
                for ( int m = s - 1; m < e; m++ ) {
                    System.out.print( arr[m] + " " );
                }   
                System.out.println();
            }
            
        }

        
    }
}