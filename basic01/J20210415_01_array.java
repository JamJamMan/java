package basic01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class J20210415_01_array {

	public static void main(String[] args) {
		// 배열
//		int cnt=5; 
//		int[] arr; //선언은 stack에
//		//배열은 heap에 생성
//		//자바는 동적배열
//		arr = new int[cnt]; //객체생성해서 주소를 arr에 대입 
//		arr[0] = 10;
//		System.out.println(arr[0]);
//		//arr[5] = 100; //5번index는 없다//에러
		
		//선언하고 객체 생성
//		int[] arr = new int[5];
//		//1~5값을 대입
////		arr[0] = 1; arr[1] = 2;	arr[2] = 3;	arr[3] = 4;	arr[4] = 5;
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (i+1)*10;
//		}
//		
//		for(int i=0; i< arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//선언과 초기화:반드시 사이즈 생략
		//int[] arr = new int[] {10,20,30};
//		/int[] arr = {10,20,30};
//		for(int i=0;i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		//for~each문
//		for(int a: arr) {
//			System.out.println(a);
//		}
//		//Arrsys 클래스 이용 문자열 출력
//		System.out.println(Arrays.toString(arr)); //오버로딩
//		System.out.println(arr.toString()); //오버라이딩
//		System.out.println(arr); //println메소드는 toString() 실행
		
		//실습)3학생의 점수를 입력 받아서 배열에 대입하고 합계,평균
		
//		int[] score = new int[3] ;
//		int sum = 0;
//		
//		//score[0] = 100; score[1] = 88; score[2] = 89;
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<score.length; i++) {
//			System.out.printf("%d)점수는?", i+1);
//			score[i] =sc.nextInt();
//		}
//		System.out.println("=================");
//		
//		for(int s:score) {
//			sum += s;
//		}
//		System.out.println("합계 = " + sum + "점");
//		System.out.printf("평균 = %.2f 점", (double)sum/3); 
		
		//문자열 배열
		//String[] arr = new String[] {"java", "python", "c"} ;
//		String[] arr = {"java", "python", "c"} ;
//		System.out.println(arr);
//		for(String s:arr) {
//			System.out.println(s);
//		}
		
		//실습)좋아하는 칼라3개를 입력받아 배열에 저장하고 출력
//		String[] arr = new String[3];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<arr.length; i++) {
//			System.out.print("칼라는?");
//			arr[i] = sc.nextLine();
//		}
//		System.out.println("★★★★★★★★★★★★★★★★★");
//		for(String s:arr) {
//			System.out.println(s);
//		}
		
		//실습)피보나치수열 n개 구하기
		//0,1,1,2,3,5,8,13,......
		//0,1, i-2 + i-1,  ... 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수열갯수는?");
//		int n = sc.nextInt();
//		int[] fibo = new int[n]; 
//		fibo[0] = 0; fibo[1] =1;
//		
//		for(int i=2; i< n; i++)
//			fibo[i] = fibo[i-2] +fibo[i-1];
//
//		for(int f:fibo) {
//			System.out.println(f);
//		}
		
		//실습)시험 채점 프로그램
//		int[] right =  {1,3,4,2,1};
//		int[] answer = {2,3,4,1,1};
//		
//		int score=0;
//		for(int i=0; i<right.length; i++) {
//			if (right[i] == answer[i]) {
//				System.out.println(i+1 + "맞음");
//				score += 100/right.length;
//			}
//		}
//		System.out.println("점수:" + score);
		
		//실습)최대값(최솟값) 출력
		//1안
//		int[] arr= {4,6,7,2,5};
//		int max = arr[0];
//		for (int i=1; i<arr.length; i++) {
//			if (arr[i] > max) max = arr[i];
//		}
//		System.out.println("가장큰값:" + max);
		//2안
//		int[] arr= {4,6,7,2,5};
//		int max = 0; //범위 안의 가장 작은값을 초기값으로
//		for (int i=0; i<arr.length; i++) {
//			if (arr[i] > max) max = arr[i];
//		}
//		System.out.println("가장큰값:" + max);
//
//		

		//배열의 복사
		//얇은 복사 : 주소만 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = src;
//		System.out.println(src);
//		System.out.println(dest);
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("desc:" + Arrays.toString(dest));
//		System.out.println("-------------------");
//		src[1] = 20; dest[3] = 40;
//		System.out.println("src:"+ Arrays.toString(src));
//		System.out.println("desc:" +Arrays.toString(dest));
		
		//깊은복사 : 값을 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[6];
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("desc:" + Arrays.toString(dest));
//		for(int i=0; i<src.length;i++) {
//			dest[i] = src[i];
//		}
//		dest[5] = 6;
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("desc:" + Arrays.toString(dest));
//		src = dest;
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("desc:" + Arrays.toString(dest));
		
		
		//프레임워크를 이용한 데이터 추가
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);
		
		//배열의 깊은 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = {0,0,0,0,0};
//		
//		System.arraycopy(src, 2, dest,0, 3);
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("desc:" + Arrays.toString(dest));
		
		
		
		//실습)선택정렬
//		//{2,4,5,6,7};(오름차순정렬)
//		//{7,6,5,4,2};(내림차순정렬)
//		int[] sortArr = {4,6,7,9,1};
//		
//		for (int j=0; j<sortArr.length-1; j++) {
//			int min = sortArr[j];
//			int minIndex=j; //가장작은 값의 index
//			for(int i=j+1; i< sortArr.length; i++) {
//				if (sortArr[i] < min ) {
//					min = sortArr[i];
//					minIndex = i;
//				}
//			}
//			System.out.println(min);
//			System.out.println(minIndex);
//			//두수를 바꾸기
//			sortArr[minIndex]=sortArr[j];
//			sortArr[j] = min;
//			System.out.println(Arrays.toString(sortArr));
//		}
		
//		
//		
//		//실습)로또번호 맞춘 갯수 출력
//		int[] no = {9, 12, 21, 25, 33, 42};
//		//로또번호 6를 만들기
		//1)Math.random()*100 +1;
		//2)Random() 
//		int[] lotto ;
		
		//int의 범위
		System.out.println("Max: "+Integer.MAX_VALUE); 
		System.out.println("Min:" +  Integer.MIN_VALUE);
		
		int[] no = new int[6];
		Random rd = new Random();
		
		for(int i=0; i<no.length; i++) {
			boolean b = false; //기존에 존재 하지 않는다
			int r = rd.nextInt(10)+1;
			//기존에 번호가 등록되어 있다면
			for(int j=0; j<i;j++) {
				if (no[j]==r) {
					i--;
					b = true; //존재 한다
					break;
				}
			}
			if (!b) no[i] = r;  //존재하지 않는다면 넣는다
		}
		
		Arrays.sort(no); //오름차순 정렬
		System.out.println(Arrays.toString(no));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
