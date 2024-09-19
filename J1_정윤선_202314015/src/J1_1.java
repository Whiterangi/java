/*
 * 학기: 2024년 2학기
 * 과목: Java 프로그래밍
 * 과제: J1
 * 소속: IT융합자율학부
 * 이름: 정윤선
 * 학번: 202314015
 */

import java.util.Scanner;

public class J1_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위:원)>>");
		int won = scanner.nextInt();
		double dollar = won/1100;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		scanner.close();
	}
}
