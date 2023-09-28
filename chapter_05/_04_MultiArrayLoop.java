package chapter_05;

public class _04_MultiArrayLoop{
    public static void main(String[] args) {
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}};

        for (int i = 0; i < 3; i++) { //세로 크기
            for (int j = 0; j < 5; j++) {//가로 크기
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}};
        for (int i = 0; i < seats2.length; i++) { //중괄호의 개수가 몇개인가?
            for (int j = 0; j < seats2[i].length; j++) { //seats2[세로]의 길이
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        String[][] seats3 = new String[10][15];
        String[] eng ={"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + ( j + 1);
            }
        }

        seats3[7][8] = "__" ; //표 선점

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
