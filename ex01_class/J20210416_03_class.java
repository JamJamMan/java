package ex01_class;
//객체를 만들어 내기 위한 틀
//클래스
class Dog {
	//속성:필드
	//자동초기화 
	String type="강아지";
	String name ="개똥이";
	int legs = 4;
	int cnt; //걸음수
	//기능:메소드
	void walking() {
		cnt++;
		System.out.println(name + " 걷는다");
	}
	//개똥이 먹는다 출력 메소드
	void eating() {
		String food="사료"; //지역변수
		System.out.println(food +"먹는다");
	}
}
public class J20210416_03_class {
	public static void main(String[] args) {
		Dog d1 =new Dog();
		System.out.println(d1.type);
		System.out.println(d1.legs);
		d1.walking();
		System.out.println(d1.cnt);
	}

}
