import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 0;

        for ( int i = 0; i < 10; i++ ) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                break;
            } 
            n++;
        }

        //n =3일 때 , 0
        // 
        for ( int i = 0; i < n; i++ ) {
            System.out.print( arr[ n - i - 1 ] + " " );
        }
    }
}