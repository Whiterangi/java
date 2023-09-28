package chapter_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIf
        int hour = 12;
        if(hour < 15)
            System.out.println("아이스 아메리카노");
        else if (hour <17) {
            System.out.println("망고 주스");
        }
        else
            System.out.println("딸기 에이드");
    }
}