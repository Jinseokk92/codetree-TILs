import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] arr = new int[10];

        //초기화
        arr[0] = a;
        arr[1] = b;

        int cnt = 1;

        for ( int i = 2; i < arr.length; i++  ) {
            arr[i] = arr[i - 1] + 2 * arr[i - 2];
            cnt++;
        }

        for (int j = 0; j <= cnt; j++) {
            System.out.print(arr[j] + " ");
        } 
        
    }
}