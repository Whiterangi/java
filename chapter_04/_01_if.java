package chapter_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 15;
        if (hour < 14) {
            System.out.println("아이스 아메리카노");
            System.out.println("커피 주문 완료");
        } //if문 내에서 하나의 문장을 실행할 경우에는 {} 생략 가능
        else
            System.out.println("초코라떼");
        System.out.println("커피 주문 완료");

        //오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour =10 ;
        boolean morningCoffee = false;
        if((hour < 14) && (morningCoffee == false)) // == if((hour < 14) && !morningCoffee)
            System.out.println("아이스아메리카노");

        System.out.println("커피 주문 완료");
    }
}
