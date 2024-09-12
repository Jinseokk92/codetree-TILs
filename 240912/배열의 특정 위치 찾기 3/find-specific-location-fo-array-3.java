import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        int sum = 0;
        //0이 저장되어있는 임시 변수 
        int k = 0;

        for ( int i = 0; i < 100; i++ ) {
            arr[i] = sc.nextInt();

            if ( arr[i] == 0 ) {
                k = i;
                break;
            }
        } 


        sum = arr[k - 3] + arr[k - 2] + arr[k - 1];
        System.out.print( sum );
        
    }
}