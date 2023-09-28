package chapter_03;

public class _03_String_Compare {
    public static void main(String[] args) {
        //문자열 비교
        String s1="Java";
        String s2="Python";

        System.out.println(s1.equals(s2)); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python")); //대소문자 비교
        System.out.println(s2.equalsIgnoreCase("python"));//대소문자 비교 없이 내용만 같으면 true

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234"; //다른 곳에 이미 선언되어 있는 1234를 그대로 씀
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //true

        s1 = new String("1234");
        s2 = new String("1234"); //새로 선언
        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1 == s2); //false > 위치가 달라서 (참조 비교)
    }
}
