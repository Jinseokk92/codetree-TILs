import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[100];

        arr[0] = 1;
        arr[1] = n;
        //이미 두 번째 항까지 위에 초기화 되어있으니까 1
        // 배열의 개수
        int cnt = 1;

        for ( int i = 2; i < arr.length; i++ ) {
            arr[i] = arr[i - 1] + arr[i - 2];
            cnt ++;

            if (arr[i] > 100) {
                break;
            }
        }

        //100을 초과한 항까지 출력하니 부등호 포함
        for ( int i = 0; i <= cnt; i++ ) {
            System.out.print(arr[i] + " ");
        }
    }
}