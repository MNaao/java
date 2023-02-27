package 복습;

import java.util.Scanner;

public class 입출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// -> 주석 : 컴퓨터가 읽지 못함
		System.out.println("Hello~");
		System.out.println("블라블라");

		System.out.print("이름 : ");
		// 변수 선언 및 초기화
		// 선언
		// 데이터타입 변수명;
		String name;
		
		// 초기화
		name = sc.next();
		
		int num = 20;
		
		System.out.println(name);
		

		
	}
	
}
