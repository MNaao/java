import java.util.Scanner;

public class ex11_삼항연산자2 {

	public static void main(String[] args) {
		
		// 정수를 입력받아서(num)
		// 홀수인지 짝수인지 판별하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println(num % 2 == 1 ? "홀수" : "짝수");
		
		
		sc.close();
	}

}
