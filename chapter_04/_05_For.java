package chapter_04;

public class _05_For {
    public static void main(String[] args) {
        for (int i=0;i<3;i++) //fori + Enter
            System.out.println("안녕하세요 나코입니다");

        for (int i = 0; i < 10 ; i+=2) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum+=i;
            System.out.println("현재까지의 총합은" + sum);
        }
    }
}
