package step1;

// 문제
// (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

// 출력
// 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

import java.util.*;
public class Number13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		String one = String.valueOf(String.valueOf(b).charAt(2));
		String two = String.valueOf(String.valueOf(b).charAt(1));
		String three = String.valueOf(String.valueOf(b).charAt(0));
		System.out.println(a * Integer.parseInt(one));
		System.out.println(a * Integer.parseInt(two));
		System.out.println(a * Integer.parseInt(three));
		System.out.println(a * b);
	}
}
