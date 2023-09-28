package chapter_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 While - 횟수가 정해져 있지 않을 때
        int distance =25;
        int move = 0;
        while (move<distance){ //어떤 조건이 참일 동안 계속해서 반복
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리는 " + move);
            move+=3;
        }
        System.out.println("도착하였습니다");

        //무한루프 주의
    }
}
