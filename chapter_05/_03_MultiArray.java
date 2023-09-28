package chapter_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원 배열
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}};
        System.out.println(seats[1][2]); //B3

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}};
        System.out.println(seats2[0][2]); //A3
        System.out.println(seats2[0][4]); // 에러 발생

        String[][][] marray = {{{},{}},{{},{}}}; //3차원은 잘 사용하지 않음
    }
}

