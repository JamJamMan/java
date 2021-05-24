package ex12_inner;
interface Item{
	void namePrint(String itemname);
}
//class ItemImpl implements Item{
//
//	@Override
//	public void namePrint(String itemname) {
//		System.out.println(itemname);
//	}
//	
//}
public class J20210507_04_item {
	public static void main(String[] args) {
//		ItemImpl item = new ItemImpl();
//		item.namePrint("새우깡");
		//item인터페이스를 상속받는 객체 생성
		Item item = new Item() {
			@Override
			public void namePrint(String itemname) {
				System.out.println(itemname);
			}
		};
		
		item.namePrint("새우깡");
		

	}

}
