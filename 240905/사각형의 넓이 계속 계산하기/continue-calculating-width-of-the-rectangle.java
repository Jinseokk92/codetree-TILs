import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int area;

        while ( true ) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            char c = sc.next().charAt(0);

            area = w * h;
            
            System.out.println(area);

            if ( c == 'C' ) {
                break;
            }
        } 
    }
}