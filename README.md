### 객체지향언어
	객체를 기반으로하여 클래스의 재사용성을 높이는 언어

### 플랫폼
	어플리케이션이 실행될 수 있는 환경

### 자바 플랫폼의 종류
	- JAVA SE : UI 자바어플리케이션, Network 자바어플리케이션 등이 실행될 수 있는 환경
	- JAVA EE : 기업형 자바 어플리케이션이 실행될 수 있는 환경
	- JAVA ME : 마이크로카드 등등..
	
### 자바 플랫폼의 구조
	- JDK = JRE(JVM + API) + 여러응용프로그램(javac, java...)
	
### 플랫폼에 독립적이다.
<p align="center">
  <img src="https://github.com/yelo-o/myJAVA/assets/64743180/5aac2737-362a-4f36-9cb3-f1ce56798f3c">
</p>

## `23.05.16(화)

### ArithmeticException 발생
	0으로 나누는 경우 발생

### switch
	break가 나올 때까지 하단의 케이스 계속 반복

### 반복문
	- continue : 즉시, 반복문 상단의 증감치로 이동
	- break : 즉시 반복문 종료
### 반복문 1) A,B,C...Z 까지 반복하는 반복문 작성
	// 문자를 유니코드로 변환하면 int 타입의 숫자로 변환
	for(int i=65;i<91;i++) {
		if(i>65) {
			System.out.print(",");
		}
		System.out.print((char)i);
	}
	System.out.println();
	
### 반복문 2) 피보나치 수열
	// 피보나치 수열 : 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
	int bb = 1; // 전전수
	int b = 0; // 전수
	int current = 1; // 현재수
	for(int i=0;i<20;i++) {
		if(i>0) {
			System.out.print(",");
		}
		System.out.print(current);
		bb = b;
		b = current;
		current = bb+b;
	}
	
### 반복문 탈출 1 - 
	// 구구단 :2단~5단까지 *1~*9까지 출력하시오
	// 8의 배수는 출력하지 않는다
	// 25 이상인 경우 더 이상 출력하지 않는다
	out: for(int dan=2;dan<6;dan++) {
		in: for(int i=1;i<10;i++) {
			if(dan*i >= 25) {
				break out;
			}
			if(dan*i%8==0) {
				continue;
			}
			if(i>1) {
				System.out.print(",");
			}
			System.out.print(dan*i);
		}
		System.out.println();
	}

### 반복문 탈출2 - 변수조정
	for(int dan=2;dan<6;dan++) {
		for(int i=1;i<10;i++) {
			if(dan*i >= 25) {
				dan = 100;
				break;
			}
			if(dan*i%8==0) {
				continue;
			}
			if(i>1) {
				System.out.print(",");
			}
			System.out.print(dan*i);
		}
		System.out.println();
	}

### 자동 import
	Ctrl + Shift + O

### do while문
- while : 조건 비교 먼저
- do while : 일단 진행 한번 하고 while문의 조건을 비교

### 배열(Array)
- 정의 : 동일 자료형의 데이터 묶음

### 배열 사용 예시
	int []scoreArr; // 배열 선언
	scoreArr = new int[3]; // 배열 생성
	scoreArr[0] = 10;
	scoreArr[1] = 8;
	scoreArr[2] = 5;
	int totalScore = 0;
	for (int i=0;i<2;i++){
		totalScore += scoreArr[i];
	}
	System.out.println(totalScore);




