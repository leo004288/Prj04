package ex01;

import java.util.Scanner;
// 번호 이름 국어 영어 수학
// num  name kor  eng  mat
// 1,안유진,80,50,-30
// 2,카리나,70,70,70
// 3,장원영,100,100,100
// 4,닝닝,70,90,0

// 계산
// tot   = kor + eng + mat
// avg   = tot / 3.0
// grade = 

// 출력
// 번호 이름 국어 영어 수학 총점 평균 등급
// num  name kor  eng  mat  tot  avg  grade

public class TestFun01 {
//	지역변수: local vairable - {}안에서만 적용
//	전역변수: global - class에 전역변수 위치에서 만든 변수 / 모두 적용
	static int    num;
	static String name;
	static int    kor;
	static int    eng;
	static int    mat;
	
	static int    tot;
	static double avg;
	static char   grade;
	
	public static void main(String[] args) {
		// IPO : Input, Process, Output
		input();
		process();
		output();	
	} //

	private static void input() {
//		System.out.println("input");
		Scanner in = new Scanner(System.in);
		
		System.out.println("입력:번호,이름,국어,영어,수학");
		String line  = in.nextLine();  // "1,안유진,90,80,90"
		String [] li = line.trim().split(",");
		num 		 = Integer.parseInt( li[0].trim() ); // "1" 
		name		 = li[1].trim();                     // "안유진"
		kor 		 = Integer.parseInt( li[2].trim() ); // "90" 
		eng 		 = Integer.parseInt( li[3].trim() ); // "80" 
		mat 		 = Integer.parseInt( li[4].trim() ); // "90" 	
	} //

	private static void process() {
//		System.out.println("process");
//		              0   1   2   3   4   5   6   7   8   9   10
		char [] g = {'F','f','f','f','f','f','D','C','B','A','A',};
		
		tot   = kor + eng + mat;
	    avg   = tot / 3.0;
    	grade = g [ (int)avg / 10 ]; 
	} //

	private static void output() {
//		System.out.println("output");
		System.out.println("번호 이름 총점 평균 등급");
		System.out.printf("%3d %s %3d %.2f %c\n",
				           num, name, tot, avg, grade);
	} //

	
	
	
	
	
	
	
	
	
	
} //
