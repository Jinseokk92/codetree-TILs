import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요. 
    Scanner sc = new Scanner(System.in);

    // A진료소로 갈 때 마다 ++
    int aCount = 0;
    int n = 3;

    // 총 세 명씩 검사를 받음
    for (int i = 0; i < n; i++ ) {
        String cond_ = sc.next();
        char cond = cond_.charAt(0);
        int temp = sc.nextInt();

        if ( cond == 'Y' && temp >= 37 ) {
            aCount++;
        }
    }

    if ( aCount >= 2 ) {
        System.out.println("E");
    } else {
        System.out.println("N");
    }
    

    }
}