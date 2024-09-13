import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 나머지가 몇 번 나왔는지 카운트할 배열 선언
        int[] countArr = new int[b];
        // 나머지 횟수의 제곱들의 합
        int sum = 0;

        while ( a > 1 ) {
            int remainder = a % b;
            countArr[remainder]++;
            a =  a / b; 
        }

        for ( int i = 0; i < b; i++ ) {
            sum += countArr[i] * countArr[i];
        }

        System.out.print(sum);
    }
}