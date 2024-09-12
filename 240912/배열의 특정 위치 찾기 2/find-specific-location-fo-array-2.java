import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for ( int i = 0; i < 10; i++ ) {
            arr[i] = sc.nextInt();
        }

        //홀수
        int sumOdd = 0;
        for ( int j = 0; j < 10; j += 2 ) {
            sumOdd += arr[j];
        }

        //짝수
        // arr[1], arr[3], arr[5]
        int sumEven = 0;
        for ( int j = 0; j < 10; j++ ) {
            if ( (j + 1) % 2 == 0 ) {
                sumEven += arr[j];
            }
        }

        int result = 0;
        if ( sumOdd > sumEven ) {
            result = sumOdd - sumEven;
            System.out.print(result);
        } else {
            result = sumEven - sumOdd;
            System.out.print(result);
        }
    }
}