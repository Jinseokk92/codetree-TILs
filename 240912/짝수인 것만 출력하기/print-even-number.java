import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] array = new int[n];
        int[] arr = new int[n];

        int index = 0;

        for ( int i = 0; i < n; i++ ) {
            array[i] = sc.nextInt();
        }

        for ( int i = 0; i < n; i++ ) {
            if ( array[i] % 2 == 0 ) {
                arr[index] = array[i];
                index++;
            }
        }

        for ( int i = 0; i < index; i++ ) {
            System.out.print(arr[i] + " ");
        }
    }
}