/*
 * 학기: 2024년 2학기
 * 과목: Java 프로그래밍
 * 과제: J1
 * 소속: IT융합자율학부
 * 이름: 정윤선
 * 학번: 202314015
 */

import java.util.Scanner;

public class J1_2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("2자리의 정수 입력(10~99)>>");
		int num = scanner.nextInt();
		if (num > 9 && num <100)	
			if (num / 10 == num % 10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			}
			else { 
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
			}
		else
			System.out.println("10부터 99 사이의 정수를 입력하세요.");
		scanner.close();
	}
}
