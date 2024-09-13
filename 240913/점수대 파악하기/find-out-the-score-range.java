import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] countArr = new int[11];  // 10점 단위 구간 배열

        // 점수를 입력받아 구간 카운팅
        while (true) {
            int score = sc.nextInt();
            if (score == 0) {
                break;  // 0이 입력되면 종료
            }
            countArr[score / 10]++;  // 10점 단위로 나눠 카운트
        }

        // 점수 구간별 출력
        for (int i = 10; i >= 1; i--) {
            if (i == 10) {
                System.out.println(i + "0 - " + countArr[10]);
            } else {
                System.out.println(i*10 + " - " + countArr[i]);
            }
        }
    }
}