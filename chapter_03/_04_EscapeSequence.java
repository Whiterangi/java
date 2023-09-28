package chapter_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        System.out.println("자바가\n너무\n재밌어요\n"); // \n: 줄바꿈

        System.out.println("해물파전\t9000원"); // \t: 키보드에서의 tab(    )와 같은 기능

        System.out.println("C:\\Program Files\\Java"); // \\: \를 출력

        System.out.println("단비가 \"냐옹\"이라고 했어요"); // \": "가 출력
        System.out.println("단비가 \'뭘봐?\' 라는 표정을 지었어요."); // \': 작은 따옴표
        System.out.println("단비가 '뭘봐?' 라는 표정을 지었어요.");

        char c = '\'';
        System.out.println(c);
    }
}
