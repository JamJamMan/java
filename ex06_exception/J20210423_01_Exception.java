package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210423_01_Exception {

	public static void main(String[] args)  {
		//예외 처리
		//JVM이 해당하는 예외의 객체를 생성
		
//		Scanner sc = new Scanner(System.in);
		
//		int a =10,b = 0;
		
//		b = sc.nextInt();
//		System.out.println(a/b);
		
//		while (true) {
//			System.out.print("나눌수를 입력?");
//			try { //예외발생 가능성 문장
//				b = sc.nextInt();
//				System.out.println(a/b);
//				break;
//			}catch(InputMismatchException e) {
//				System.out.println("숫자를 입력해 주세요");
//				sc.nextLine(); //버퍼 비우기
//				e.printStackTrace(); //예외발생된 지점 추적 출력
//			}catch(ArithmeticException e) {
//				System.out.println("0으로 나눌수 없습니다.");
//				e.printStackTrace();
//			}catch(Exception e) { //모든 예외를 처리:마지막에 처리
//				System.out.println("예외발생");
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.println("프로그램 정상종료");
		
		//실습)정수를 입력받고 해당하는 index의 값 출력
//		Scanner sc = new Scanner(System.in);
//		int[] arr = {10,20,30};
//		try {
//			System.out.print("정수를 입력:");
//			int a = sc.nextInt();
//			System.out.println(arr[a-1]);
//		}catch (InputMismatchException e) {
//			System.out.println("정수를 입력");
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("1~3 사이의 수를 입력하세요");
//		} catch (Exception e) {
//			System.out.println("예외발생");
//			e.printStackTrace();
//		}
		
		
		//예외의 종류 
		//1)체크예외 : RuntimeException을 상속하지 않은 예외
		// 네트워크나 db나 파일 등 외부와 연결되는 것들
		
		//2)언체크예외 : RuntimeException을 상속한 예외
		File file = new File("sample.txt");
		System.out.println(file);

		try {
			Scanner sc = new Scanner(file);
			System.out.println("파일을 읽기 성공");
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) { //체크예외
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		

	}

}
