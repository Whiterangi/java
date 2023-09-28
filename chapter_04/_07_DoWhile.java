package chapter_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move < distance - height){
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리: " + move);
            move+=3;
        }
        System.out.println("도착했습니다.");

        System.out.println("------");

        move = 0;
        height = 25;
        while (move < distance - height){ //조건이 거짓이 되어버림 > 블록이 실행되지 않음
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리: " + move);
            move+=3;
        }
        System.out.println("도착했습니다.");


        System.out.println("------");

        //Do While
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move); //최소 한 번은 실행
            move+=3;
        } while (move < distance -height);
        System.out.println("도착했습니다.");
    }
}
