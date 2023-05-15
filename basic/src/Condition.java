
public class Condition {
	public static void main(String[] args) {
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		/*
		// if
		if(true) {};
		System.out.print("년도를 입력하세요: ");
		int year = Integer.parseInt(sc.nextLine()); // String->int로 변환메서드 : int value = Interger.parseInt(String);
		if(year%2==0) {
			System.out.println("짝수해입니다.");
		}
		
		System.out.print("시간을 입력하세요: ");
		int hour = Integer.parseInt(sc.nextLine());
		// if else
		if(hour < 12) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		//if elseif
		
		System.out.print("월을 입력하세요: ");
		int month = Integer.parseInt(sc.nextLine());;
		//1분기: 1~3
		//2분기: 4~6
		//3분기: 7~9
		//4분기: 10~12
		if(month>=1 && month <= 3) {
			System.out.println("1분기");
		}else if(month <= 6){
			System.out.println("2분기");
		}else if(month <= 9) {
			System.out.println("3분기");
		}else if(month <= 12) {
			System.out.println("4분기");
		}else {
			System.out.println("월이 잘못되었습니다");
		}
		
		
		System.out.println("점수를 입력하세요: ");
		int score = Integer.parseInt(sc.nextLine());
		// 100~90점인 경우 A
		// 89~80점인 경우 B
		// 79~70점인 경우 C
		// 69~60점인 경우 D
		// 60점 미만인 경우 F
		if(score> 100) {
			System.out.println("잘못 입력하셨습니다.");
		}else if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		*/
		
		//임의의 수(난수)
		Math.random();
//		for(int i=0;i<10;i++) {
//			// Math.random() 의 반환타입 : double 타입 0.0 <= Math.random() < 1.0
//			int r = (int)(Math.random()*3)+1;
//			System.out.println(r);
//		}
		System.out.println("가위바위보");
		System.out.println("가위-1, 바위-2, 보-3을 입력하세요");
		int u = Integer.parseInt(sc.nextLine());
		int r = (int) (Math.random()*3)+1; // 1<= r < 4
		
		System.out.println("당신: " + u + ", 기계: " + r);
		if(u == r) {
			System.out.println("비겼습니다");
		}else if(u<1 || u>3) {
			System.out.println("잘못 입력하셨습니다");
		}else if(r%3 < u) {
			System.out.println("이김");
		}else {
			System.out.println("짐");
		}
		
		/*
		if(u == r) {
			System.out.println("비겼습니다");
		}else if(u == 1){ // 사용자가 가위를 냈을 때
			if(r == 2) {
				System.out.println("당신은 졌습니다");
			}else if(r == 3) {
				System.out.println("당신은 이겼습니다");
			}
		}else if(u == 2){ // 사용자가 바위를 냈을 때
			if(r == 3) {
				System.out.println("당신은 졌습니다");
			}else if(r == 1) {
				System.out.println("당신은 이겼습니다");
			}
		}else if(u == 3){ // 사용자가 보를 냈을 때
			if(r == 1) {
				System.out.println("당신은 졌습니다");
			}else if(r == 2) {
				System.out.println("당신은 이겼습니다");
			}
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		*/
		
		//switch
		
	}

}
