public class Datatype {
	public static void main(String[] args) {
		//byte, short, int, long, float, double, char, boolean : 기본 자료형
		//  1	  2		4	 8		4		8	   2      1	
		byte b;
		b = 127;
		//b = 128;
		
		//리터럴
		System.out.println(1); // 컴파일러가 1을 int로 이해
		System.out.println(123.4); // 컴파일러가 123.4를 double로 이해
		
		long lon = 1234567890123456789L;
		float f = 123.4F;
		
		char c = '가'; // A'는 십진수65로 컴퓨터가 이해, 'a'는 십진수97로 이해
		System.out.println(c);
		
		boolean flag  = true;
		flag = false;
		//flag =  1;
		
		// 형변환
		lon = b; // byte -> long
		System.out.println(lon); // 127
		
		lon = (long)f; // float -> long 자동현변환 안되므로 강제 형변환 해야 함
		System.out.println(lon); // 123
		
		lon = c; //char타입은 int이상의 자료형으로 자동 형변환 가능
		System.out.println(lon); // c : 가, lon : 44032 
		short sh;
		//sh = c;
		
		// boolean자료형과는 형변환 불가
		// 
	}

}
