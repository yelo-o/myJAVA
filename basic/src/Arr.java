import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		String []subject = {"국어", "영어", "수학"}; // 생성 + 선언 + 값 대입
//		subject = {"K", "E", "M"}; // 배열 재초기화 안됨
//		subject = new String[] {"KOR", "ENG", "MATH"};

		/*
//		String []subject = new String[3];
//		subject[0] = "국어"; subject[1]= "영어"; subject[2] = "수학";
		
		
//		String []subject = new String[3];
		// 배열 초기화
//		int size = scoreArr.length;
		
		int [][]studentArr;
		studentArr = new int[5][3];
		
		int []scoreArr = new int[3];
		for(int count=0;count<5;count++) {
			System.out.println(count+1 + " 번째 학생");
			studentArr[count] = scoreArr;
			for(int i=0;i<3;i++) {
				System.out.println(subject[i]+ " 점수 : ");
				scoreArr[i] = Integer.parseInt(sc.nextLine());
			}
			int totalScore = 0;
			int size = studentArr[count].length;
			for(int i=0;i<size;i++) {
				totalScore += scoreArr[i];
			}
			System.out.println("총점 : " + totalScore);
			System.out.println("평균 : " + (float)totalScore/size);
			// 정수/실수 또는 실수/정수 의 값은 모두 실수이다.
		}
		

		int [][]studentArr;
		studentArr = new int[5][3];
		for(int studentCnt=0; studentCnt<5; studentCnt++) {
			int size = studentArr[studentCnt].length;
			// 입력 받기
			for(int i=0; i<size; i++) {
				System.out.print(subject[i]+"점수:");
				//scoreArr[i] = Integer.parseInt(sc.nextLine());
				studentArr[studentCnt][i] = Integer.parseInt(sc.nextLine());
			}
			// 입력 받은 값 더하기
			int totalScore = 0;//총점
			for(int i=0; i<size; i++) {
				totalScore += studentArr[studentCnt][i];//scoreArr[i]; // totalScore = totalScore+scoreArr[i];
			}
			System.out.println("총점:" + totalScore);
			System.out.println("평균:" + (float)totalScore/size);
		}
		// 과목별 평균
		System.out.println("과목별평균");
		int sizeStudent = studentArr.length; // 학생 수
		int sizeSubject = studentArr[0].length; // 과목 수
		int sum = 0;
		for(int j=0;j<sizeSubject;j++) {
			for(int i=0;i<sizeStudent;i++) {
				sum += studentArr[i][j];
			}
			System.out.println(subject[j] + "의 평균 : " + (float)sum/sizeStudent);
		}
		
		String[] zodiacArr = {"원숭이" , "닭", "개", "돼지", "쥐", "소" ,"호랑이", "토끼", "용", "뱀", "말", "양"};
		System.out.print("출생년도를 입력하세요:");
		int birthYear = Integer.parseInt(sc.nextLine());
		System.out.println(zodiacArr[birthYear%zodiacArr.length] + "띠 입니다");
		 */
		
		// 아래는 삭제 해도 무방
		// 국어, 영어, 수학 3가지 과목 있음
		// 학생은 5명
		// 
		
		String []subject = {"국어", "영어", "수학"}; // 생성 + 선언 + 값 대입
		int subjectSize = subject.length; // 3
		int [][]studentArr; //학생수 5, 과목수 3
		studentArr = new int[5][subjectSize]; // 5
		int studentSize = studentArr.length;
		
		// 학생별로 과목별 점수 입력받기
		for(int i=0;i<studentSize;i++) {
			int sum = 0;
			for(int j=0;j<subjectSize;j++) {
				System.out.println(subject[j]+ " 점수를 입력하세요 : ");
				studentArr[i][j] = Integer.parseInt(sc.nextLine());
				sum += studentArr[i][j];
			}
				System.out.println("합 : " + sum );
				System.out.println("평균 : " + sum/subjectSize);
		}
		
		// 과목별 평균 구하기
		System.out.println("<과목별 평균>");
		int sum = 0;
		for(int i=0;i<subjectSize;i++) {
			for(int j=0;j<studentSize;j++) {
				sum += studentArr[j][i];
			}
			System.out.println(subject[i] + " 평균 : " + sum/studentSize);
		}
		
		
		// 
		
		
		
		
		

	}

}