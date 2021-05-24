package ex01_class;
//자동차 클래스(Car)
//속성:name, color, power, speed
//기능:powerToggle, speedUp, speedDown
class Car{
	String name="아이오닉5";
	String color="흰색";
	boolean power;
	int speed;
	void powerToggle() { //파워 토글
		power = !power;
	}
	void speedUp() { //속력 Up : 100초과될수 없다
		if (speed < 100) speed++;
	}
	void speedDown() {//속력 Down : 50미만이 될수 없다
		if (speed>50) speed--;
	}
}

public class J20210416_04_Car {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("파워:" + c1.power);
		System.out.println("속력:" + c1.speed);
		c1.powerToggle();
		System.out.println("파워:" + c1.power);
		for(int i=0; i<200; i++) {
			c1.speedUp();	
		}
		System.out.println("속력:" + c1.speed);
		for(int i=0; i<100; i++) {
			c1.speedDown();	
		}
		System.out.println("속력:" + c1.speed);
		
		
	}

}
