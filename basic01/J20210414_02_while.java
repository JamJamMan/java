package basic01;

import java.util.Scanner;

public class J20210414_02_while {

	public static void main(String[] args) {
		// 반복문 : while
		
		//원의 넓이를 구하기
		//0을 입력하면 종료
		//Scanner sc = new Scanner(System.in);

		//1안)
		//double r; //반지름
		//while(true) {
//			System.out.print("반지름은?");
//			r = sc.nextDouble();
//			if (r==0) break;
//			System.out.println("넓이는 " + r*r*3.14);
//		}
		//2안)
//		double r = 1; //반지름
//		while(r!=0) {
//			System.out.print("반지름은?");
//			r = sc.nextDouble();
//			System.out.println("넓이는 " + r*r*3.14);
//		}		
		
		//3안)
//		double r; //반지름
//		do{
//			System.out.print("반지름은?");
//			r = sc.nextDouble();
//			System.out.println("넓이는 " + r*r*3.14);
//		}while(r!=0);
		
		//실습) 1~n까지의 수를 더하기
//		int a = 0, s = 0;
//		Scanner sc =new Scanner(System.in);
//		System.out.print("마지막수는?");
//		int n = sc.nextInt();
//		while(true) {
//			a++;
//			if (a>n) break;
//			s += a;
//		}
//		System.out.println(s);
		
		//백준 : 2839번 설탕배달
		//5kg과  3kg의 봉지 몇개가 필요한지
		//  가장 작은수의 봉지구하기
		//15kg : 5kg * 3
		//18kg : 5kg * 3 + 3kg * 1
		//11kg : 5kg * 1 + 3kg * 2
		//7kg : -1
		//1kg : -1
		
		int nKg, count5, count3, rest; //이동할 kg수, 5kg봉지수, 3kg봉지수, 나머지
		//이동해야할 kg수 입력
		System.out.print("배달해야할 설탕의 무게(kg)는?"); 
		Scanner sc = new Scanner(System.in);
		nKg = sc.nextInt();
		count5 = nKg / 5;	//만약 1kg이라면 => 0
		while (true) {
			rest = nKg - (5 * count5);  
			if (rest % 3 == 0) { //나누어 떨어지면 
				count3 = rest / 3;
				System.out.printf("필요한 봉지의 수: %d(5kg) + %d(3kg)", count5, count3);
				break;
			}
			else {
				if (count5 == 0) { //5kg이 0이면 - 할수 없다
					System.out.printf("%d\n", -1);
					break;
				}
				count5 -= 1;  //5kg짜리 봉지수를 1 줄인다
			}
		}		
		
		
		
		
		
		
		
		
		
		

	}

}
