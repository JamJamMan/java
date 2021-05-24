package basic01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
		// 반복문(for)
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}
		
		//1~10합구하기
//		int s=0;
//		for(int i=1; i<11; i++) {
//			s += i;
//		}
//		System.out.println(s);
		
		//실습)업다운 게임 만들기
		//1)1~100사이의 수중 한개를 램덤추출
		//2)사용자에게 정수 입력받기
		//3) 램덤수와 비교해서 업 또는 다운을 출력
		//4)2~3을 5을 반복
		//5)반복하면서 정답을 입력하면 사용자가 승리
		//  정답을 입력 못하면 컴퓨터 승리
		//1안)
//		int r = (int)(Math.random()*100 +1);
//		//System.out.println(r);
//		Scanner sc = new Scanner(System.in);
//		int a; 
//		boolean win = false; //성공여부(실패했다고 가정)
//		for(int i=0; i<7;i++) {
//			System.out.printf("%d)숫자를 맞춰라:", i+1);
//			if (!sc.hasNextInt()) { //입력한 값이 숫자가 아니면
//				sc.nextLine(); //버퍼 비우기
//				i--;
//				continue; //반복문의 처음으로 다시 돌아가서 계속 진행
//			}
//			a = sc.nextInt();
//			//업/다운/성공
//			if (r>a) 
//				System.out.println("업");
//			else if(r<a) 
//				System.out.println("다운");
//			else {
//				System.out.println("성공");
//				win=true;
//				break;
//			}
//			
//		}
//		if (!win) System.out.println("실패");
		
		//2안)
//		int r = (int)(Math.random()*100 +1);
//		Scanner sc = new Scanner(System.in);
//		int a , cnt=0; //반복횟수
//		
//		boolean win = false; //성공여부(실패했다고 가정)
//		while(true) {
//			System.out.printf("%d)숫자를 맞춰라:", cnt+1);
//			if (!sc.hasNextInt()) { //입력한 값이 숫자가 아니면
//				sc.nextLine(); //버퍼 비우기
//				continue; //반복문의 처음으로 다시 돌아가서 계속 진행
//			}
//			a = sc.nextInt();
//			//업/다운/성공
//			cnt++; 
//			if (r>a) 
//				System.out.println("업");
//			else if(r<a) 
//				System.out.println("다운");
//			else {
//				System.out.println("성공");
//				win=true;
//				break;
//			}
//			if (cnt > 5) break;
//		}
//		if (!win) System.out.println("실패");
		
		//실습)소수 구하기
		//1안)
//		int a=9;
//		boolean b = true; //소수여부
//		for(int i = 2; i<a; i++) {
//			if (a%i==0) {
//				System.out.println(i +" " + "소수가 아닙니다.");
//				b = false;
//				break;
//			}
//			
//		}
//		
//		if (b) {
//			System.out.println("소수입니다.");
//		}
		
		//2안)
//		int a=9,i;
//		for(i = 2; i<a; i++) {
//			if (a%i==0) {
//				System.out.println(i +" " + "소수가 아닙니다.");
//				break;
//			}
//		}
//		if (i==5) {
//			System.out.println("소수입니다.");
//		}
//		
		
		//실습)1~100까지의 수중 소수 구하기
//		boolean b; //소수여부
//		for(int j=2; j<101;j++) { 
//			b = true; //소수라고 가정하고 시작
//			for(int i = 2; i<j; i++) {
//				if (j%i==0) { //나누어 떨어지면 소수가 아님
//					b = false; //소수가 아님
//					break;
//				}
//			}
//			if (b) {
//				System.out.print(j +" ");
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
