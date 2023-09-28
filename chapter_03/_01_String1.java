package chapter_03;

import java.sql.SQLOutput;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //29

        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함 관계
        System.out.println(s.contains("Java")); //포함되면 true
        System.out.println(s.contains("C#")); //포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); //위치 정보 > 첫번째 위치가 0이기 때문에 7 반환
        System.out.println(s.indexOf("C#")); //포함되어 있지 않는 경우: -1 반환
        System.out.println(s.indexOf("and")); //처음으로 나오는 위치를 반환해줌
        System.out.println(s.lastIndexOf("and")); //마지막으로 일치하는 위치 반환
        System.out.println(s.startsWith("I Like")); //이 문자열로 시작하는가?
        System.out.println(s.endsWith(".")); //이 문자열로 끝나는가?
}
}
