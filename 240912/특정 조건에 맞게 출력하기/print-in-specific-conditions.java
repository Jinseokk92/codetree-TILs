import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] newArr = new int[100];

        int k = 0;

        for ( int i = 0; i < 100; i++ ) {
            arr[i] = sc.nextInt();

            if ( arr[i] == 0 ) {
                k = i;
                break;
            }

            if (arr[i] % 2 == 0) {
                newArr[i] = arr[i] / 2;
            } else {
                newArr[i] = arr[i] + 3;
            }
        }

        for ( int i = 0; i < k; i++ ) {
            System.out.print(newArr[i] + " ");
        }

        

    }
}