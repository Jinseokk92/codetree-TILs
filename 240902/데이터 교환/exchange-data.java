public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp;
        
        // temp=5
        temp = a;
        //a=7
        a = c;
        //c=6
        c = b;
        //b=5
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}