public class Operator {
	public static void main(String[] args) {
		int a,b,c;
		//산술연산자 +, -, *, /, %(모듈러연산자)
		a = 3;
		b = 5;
		c = a + b;
		System.out.println(c); // 8
		System.out.println(a-b); // -2
		System.out.println(a/b); // 0
		System.out.println(b/a); // 1
		System.out.println(a%b); // 3
		System.out.println(b%a); // 2
		
		System.out.println(a+b*c); // * 연산 먼저 처리 43
		System.out.println(a+b-c); // 연산우선순위가 같은 경우에는 왼쪽에서 오른쪽으로 연산처리 : 0
		
		//System.out.println(a/0); // ArithmeticException 예외발생. 프로그램 자동 종료됨
		
		short sa, sb, sc; // short 타입은 연산을 수행할 수 없다.
		sa = 3;
		sb = 5;
		sc = (short)(sa+sb); // sa, sb값이 int로 자동형변환
							// short타입인 sc에 대입되려면 sa+sb결과가 short타입으로 강제형변환 필요
		System.out.println(sc); // 8
		
		//비교연산자 >, <, >=, <=, ==, != 
		a = 3;
		b = 5;
		System.out.println(a>b); // false
		System.out.println(a<b); // true
		System.out.println(a==b); // false
		System.out.println(a!=b); // true
		
		//대입연산자 =, +=, -=, *=, /=, %= <- 연산우선순위 가장 낮음
		a = 3;
		a += 1; // a값에 1을 증가하여 a에 대입  a = a +1;와 같음
		System.out.println(a); // 4
		
		a -= 2; // a값에 2감소하여 a에 대입 a = a -2;
		a *= 3;
		a /= 4;
		a %= 5;
		
		//단항연산자(증감연산자) ++, -- <- 연산우선순위 가장 높음
		a = 3;
		a++;
		
		byte by; // -128~127
		by = 127;
		by = (byte)(by + 1); // -128 (Maximum + 1 -> minimum으로 돌아감)
		System.out.println(by);
		
		by = 127;
		by += 1;
		System.out.println(by);

		by = 127;
		by++;
		System.out.println(by);
		
		//삼항연산자 ? :
		a = 3;
		String result = a % 2 == 0 ? "짝수":"홀수";
		System.out.println(result); // 홀수

		//논리연산자 &, |, &&, ||, !
		a = 3;
		b = 5;
		System.out.println(a < b & a % 2 == 1); // true
		System.out.println(a > b & a % 2 == 1); // false
		System.out.println(a < b & a % 2 == 0); // false
		System.out.println(a > b & a % 2 == 0); // false
		
		// && 좌측이 거짓인 경우 오른쪽에 대한 연산은 수행하지 않음 (결과는 같음)
		System.out.println(a < b && a % 2 == 1); // true
		System.out.println(a > b && a % 2 == 1); // false
		System.out.println(a < b && a % 2 == 0); // false
		System.out.println(a > b && a % 2 == 0); // false
		
		
		System.out.println(a < b | a % 2 == 1); // true
		System.out.println(a > b | a % 2 == 1); // true 
		System.out.println(a < b | a % 2 == 0); // true
		System.out.println(a > b | a % 2 == 0); // false
		
		// && 좌측이 거짓인 경우 오른쪽에 대한 연산은 수행하지 않음 (결과는 같음)
		System.out.println(a < b || a % 2 == 1); // true
		System.out.println(a > b || a % 2 == 1); // true
		System.out.println(a < b || a % 2 == 0); // true
		System.out.println(a > b || a % 2 == 0); // false

		System.out.println(!(a < b)); // false

		//연산우선순위높이기 : ( )
		//비트연산자 <- 자바 계열에서는 비트연산자를 많이 쓰지 않음
		a = 1;
		b = 0;
		System.out.println(a & b); // int이상의 숫자를 연산하도록 쓰이는 경우 -> 비트연산
		System.out.println(a | b);  // int | int
		System.out.println(a<b & a%2==1); // boolean & boolean -> 논리연산
		System.out.println(a<b | a%2==1); // boolean | boolean -> 논리연산
	}
}
