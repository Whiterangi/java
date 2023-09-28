package chapter_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 =false;
        boolean 계란말이 =false;
        boolean 제육볶음 =true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 true (||: or)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true (&&: and)

        System.out.println((5>3)&&(3>1));
        System.out.println((5>3)&&(3<1));
        System.out.println((5>3)||(3<1));

        System.out.println((1<3)&&(3<5)); // 1<3<5는 불가
        System.out.println(1<3&&3<5); // 괄호가 없어도 실행 가능

       //논리 부정 연산자 '!'
        System.out.println(!true); //true이면 false, false이면 true
        System.out.println(!(5==5)); //false

    }
}
