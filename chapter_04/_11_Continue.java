package chapter_04;

public class _11_Continue {
    public static void main(String[] args) {
        int max = 20; //최대 판매 수량
        int sold = 0; // 현재 판매 수량
        int noShow = 17;
        for (int i = 1 ; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            if(i==noShow)
            {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; //다음 반복으로 넘어감, sold는 증가 안 됨.
            }

            sold++;
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; //반복문 탈출
            }

        }
    }
}
