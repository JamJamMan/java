package ex12_inner;
//인터페이스 객체 생성 안됨
interface School{
	void namePrint();
}
class HighSchool implements School{

	@Override
	public void namePrint() {
		System.out.println("국제 고등학교");
	}
	
}

public class J20210507_03_interfae_anoy {
	public static void main(String[] args) {
		new HighSchool(); //가능
		
		
		//익명클래스 생성 :
		//School인터페이스를 상속을 받은 객체 생성
		School high = new School() {
			@Override
			public void namePrint() {
				System.out.println("국제 고등학교");
			}
		};
		
		high.namePrint();
	}

}
