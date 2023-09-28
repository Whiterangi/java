package chapter_04;

public class _10_Break {
    public static void main(String[] args) {

        int max = 20;
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다");
            if(i==max){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break; //반복문 탈출
            }
        }
        System.out.println("영업 종료");
    }
}
