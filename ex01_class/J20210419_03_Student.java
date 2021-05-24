package ex01_class;

import java.util.Arrays;

//학생클래스
//필드:반(group),이름(name),점수(score배열), 합계(sum)
//메소드:합계계산(sumCal), 평균을 계산해서 반환(avgCal)
class Student{
	String group = "자바반";
	String name = "홍길동";
	int[] score = new int[3];
	int sum;
	//합계구하기
	//method의 overloading
	//call_by_value
	void sumCal(int a, int b, int c) { //합계
		sum=0;
		score[0] =a; score[1] = b; score[2] = c;
		sum = a+b+c;
	}
	//call_by_reference
	void sumCal(int[] score) {  //합계
		sum=0;
		this.score = score; //얇은복사
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
	}
	//평균구하기
	double avgCal() {
		double avg = (double)sum/score.length;
		return (double)Math.round(avg * 100) / 100;
	}
}

public class J20210419_03_Student {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sumCal(79,89,88);
		System.out.println(Arrays.toString(s1.score));
		System.out.println("합계:" + s1.sum);
		
		int[] score = new int[] {89,90,99};
		s1.sumCal(score);
		System.out.println(Arrays.toString(s1.score));
		System.out.println("합계:" + s1.sum);
		System.out.println("평균:" + s1.avgCal());
		
		System.out.println(Arrays.toString(s1.score));
	}

}
