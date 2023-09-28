package chapter_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print(" ");
            } // 공백 찍기
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            } //별 찍기
            System.out.println();
        }
    }
}
