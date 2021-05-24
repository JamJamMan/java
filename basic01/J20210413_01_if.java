package basic01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210413_01_if {

	public static void main(String[] args) {
		//조건문 : if
		//두수를 입력받아 큰수를 출력
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("두수를 입력?");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if (a>b) {
//			System.out.println(a);
//			System.out.println("a가 더 큽니다.");
//		}
//		else {
//			System.out.println(b);
//			System.out.println("b가 더 큽니다.");
//		}
		
		//등급출력(절대평가)
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("점수는?");
//		int score = sc.nextInt();
//		if (score>=90)
//			System.out.println("A등급");
//		else if (score>=80)
//			System.out.println("B등급");
//		else if (score>=70)
//			System.out.println("C등급");
//		else if (score>=60)
//			System.out.println("D등급");
//		else 
//			System.out.println("F등급");
		
		//실습)등급을 상대평가로
//		int tot, grade;
//		
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("전체인원수?");
//		tot = sc.nextInt();
//		System.out.print("등수?");
//		grade = sc.nextInt();
//		
//		if (grade <= tot*0.15)
//			System.out.println("A등급");
//		else if (grade < tot*0.35)
//			System.out.println("B등급");
//		else if (grade < tot*0.50)
//			System.out.println("C등급");
//		else
//			System.out.println("F등급");
		
		//실습)화씨(F) <=> 섭씨(C) 로 바꾸기
		//공식 : (1)화씨온도를 섭씨온도로
		//		     섭씨온도 = (화씨온도 − 32) × 5/9 
		//		 (2)섭씨온도를 화씨온도로
		//		     화씨온도 = 섭씨온도 × 9/5 + 32  
		//온도 : 10 C 또는 100 F		
		
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("온도는?");
//		int t = sc.nextInt();
//		String s = sc.next();
//		System.out.println(t +" " + s);
//		
//		//문자열 비교시 equals 메소드를 이용하여 비교
//		if (s.equals("C")) { //섭씨온도라면
//			System.out.println("화씨온도: " + (t * (double)9 / 5 + 32));
//		}else if (s.equals("F")) { //화씨온도라면
//			System.out.println("섭씨온도: " + ((t - 32) * (double)5 / 9));
//		}else { //그외
//			System.out.println("잘못된 온도");
//		}
		
		//실습)계산기
		//입력값 : 10 - 20
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("계산식은?");
//		try {
//			int a = sc.nextInt();
//			String sign = sc.next();
//			int b = sc.nextInt();
//			System.out.println(a+sign+b);
//			if (sign.equals("+")) 
//				System.out.println("결과:" + (a+b));
//			
//		}catch (InputMismatchException e) {
//			System.out.println("숫자를 입력해 주세요");
//		}catch(Exception e){
//			System.out.println("예외발생");
//		}
		
		//2)계산기(입력값 확인)
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("숫자값은?");
//		System.out.println("숫자?" + sc.hasNextInt());
//		
//		//코드인스펙션(규율) : ==로 true,false 비교 하지 않는다
//		if (!sc.hasNextInt()) {//숫자가 아니라면
//			System.out.println("잘못된 숫자");
//		}else {
//			int a = sc.nextInt();
//			System.out.println(a);
//			
//		}
		
		//실습)아이디 / 패스워드 체크
//		String myid = "java";
//		String mypw = "1111";
//		
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("아이디는?");
//		String id = sc.next();
//		
//		if (id.equals(myid)) {
//			System.out.print("비밀번호는?");
//			String pw = sc.next();
//			if (pw.equals(mypw)) 
//				System.out.println("로그인 성공");
//			else 
//				System.out.println("비밀번호 불일치");
//			
//		}else 
//			System.out.println("아이디가 불일치");
		
		
		//실습)년을 입력받고 윤년 체크하기
		//윤년의 조건
		//1)4의 배수이면 윤년
		//2)그러나 100의 배수이면 윤년이 아니다
		//3)400의 배수이면 윤년
//		int year = 400;
//		//1안
//		if (year%4==0) {
//			if (year%100==0)
//				if (year%400==0)
//					System.out.println("윤년");
//				else
//					System.out.println("윤년이 아니다");
//			else
//				System.out.println("윤년");
//				
//		}else {
//			System.out.println("윤년이 아니다");
//		}
//		//2안)
//		if (year%4==0 && year%4!=100 || year%400==0) {
//			System.out.println("윤년");
//		}else {
//			System.out.println("윤년이 아니다");
//		}
		
		//실습)전기사용요금계산
//		double won;
//		int use=401; //사용량
//		double eleUse1 = 88.3; //1단계 전력량 요금
//		double eleUse2 = 182.9; //2단계 전력량 요금
//		double eleUse3 = 275.6; //3단계 전력량 요금
//		int base;//기본요금
//		if (use <= 200) { //1단계
//			base = 910;
//			won = base + use * eleUse1 ;
//		}
//		else if (use <= 400) { //2단계
//			base = 1600 ;		
//			won = base + (200*eleUse1) + ((use-200)*eleUse2) ;
//		}
//		else{ //3단계
//			base = 7300;
//			won = base + (200*eleUse1) + (200*eleUse2) + ((use-400)*eleUse3) ;
//		}
//		System.out.println(won);
//		System.out.println(Math.floor(won)); //버림
//		System.out.println(Math.ceil(won)); //올림
//		System.out.println(Math.round(won)); //반올림
//		
//		System.out.println("사용요금:" + Math.floor(won));
		
		//무작위의 수 추출
		// 0<= 랜덤값 <1 
		//r * (end-start+1)+start 
		
//		double r = Math.random(); 
//		System.out.println(r); 
//		System.out.println((int)(r*(6-1+1)+1));  //1~6
//		System.out.println((int)(r *(10-5+1) + 5)) ; //5 ~ 10
//		System.out.println((int)(r *(20-11+1) + 11 )) ; //11 ~ 20
		 
		
		//주사위 게임
		int a = (int)(Math.random() * 6 + 1); 
		int b = (int)(Math.random() * 6 + 1);
		System.out.println("A:" + a);
		System.out.println("B:" + b);
		System.out.println("===========");
		
		if (a>b)
			System.out.println("A승");
		else if (b>a)
			System.out.println("B승");
		else
			System.out.println("무승부");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
