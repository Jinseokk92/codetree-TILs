import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        //입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //둘 중 최대값
        int maxNum = a > b ? a : b;
        System.out.println(maxNum);
    }
}