package chapter_05;

public class _01_02_Array {
    public static void main(String[] args) {
        //배열 선언
        //String[] coffees = new String[4]; //크기가 4인 String 배열, String coffees[]도 가능.
        /*coffees[0] = "아메리카노"; // 0부터 시작
        coffees[1]= "카페 모카";
        coffees[2]= "라떼";
        coffees[3]= "카푸치노";
         */

        //String[] coffees = new String[] {"아메리카노", "카페 모카", "라떼", "카푸치노"};
        String[] coffees = {"아메리카노", "카페 모카", "라떼", "카푸치노"};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------------");

        coffees[2] = "에스프레소"; //배열 값 변경

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------------");

        //enhanced for (for-each) 반복문
        for (String coffee : coffees){ //coffees라는 배열의 값들을 순회해서 String coffe에 받아서 사용
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------------");
        //배열의 길이 이용
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

    }
}
