package step1;

//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

//출력
// 첫째 줄에 A-B를 출력한다.

import java.util.*;
public class Number6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a - b);
	}
}
