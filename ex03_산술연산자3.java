import java.util.Scanner;

public class ex03_산술연산자3 {

	public static void main(String[] args) {
		
		// 변수 num 값 중에서 백의 자리 미만을 버리는 코드 짜보기!
		// num이 456 이라면 400 출력
		

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		int num = sc.nextInt();

		// 나머지 이용
		System.out.println(num - num % 100);
		
		// 몫을 이용
		System.out.println(num / 100 * 100);
		System.out.println(num / 100 + "00");
		
		
	}

}
