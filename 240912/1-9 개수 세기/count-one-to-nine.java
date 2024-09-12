import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 1~9까지 사용
        int[] countArr = new int[10];
        // n개의 원소 저장 배열 ( 100 -> n 메모리낭비 줄이기)
        int[] arr = new int[n]; 

        for ( int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }

        // 1부터 9까지 나온 횟수
        for(int i = 1; i <= 9; i++) {
            System.out.println(countArr[i]);
        }
    }
}