package chapter_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "강준영";
        int hour = 15;

        System.out.println(name + "님 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; //String은 "", char는 ''
        name = "안기준"; // 값을 업데이트
        System.out.println(name + "님의 평균 점수는 " + score +"점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f =3.14123456789F; //3.14는 double 값이기 때문에 뒤에 f나 F를 입력
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; //정수 큰 수는 long을 사용
        l=1_000_000_000_000L; //언더바로 구분 가능
        System.out.println(l);
    }
}