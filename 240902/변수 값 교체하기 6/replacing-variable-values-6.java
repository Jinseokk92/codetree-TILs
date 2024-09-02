public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 2;
        int b = 5;
        int temp;

        //temp = 2
        temp = a;
        //a=5
        a = b;
        //b=2
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}