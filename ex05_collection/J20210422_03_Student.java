package ex05_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//학생클래스
//필드:번호(int no), 이름(String name), 전화번호(String tel)
class Student{
	private int no;
	private String name;
	private String tel;
	public Student() {}
	public Student(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}
}

public class J20210422_03_Student {
	public static void main(String[] args) {
//		Student std1 = new Student(1, "이선희", "010-9999-9999" );
//		Student std2 = new Student(2, "BTS", "010-8888-8888" );
//		Student std3 = new Student(3, "최민식", "010-7777-7777" );
//		
//		//ArrayList에 저장
//		List<Student> arrStd = new ArrayList<>();
//		arrStd.add(std1);
//		arrStd.add(std2);
//		arrStd.add(std3);
//		System.out.println(arrStd);
//		
//		for(int i=0; i < arrStd.size() ; i++) {
//			//System.out.println(arrStd.get(i));
//			Student s = arrStd.get(i);
//			System.out.println(s.getNo() +" " + s.getName()+" "+s.getTel());
//		}
//		
//		for(Student s : arrStd) {
//			System.out.println(s.getNo() +" " + s.getName()+" "+s.getTel());
//		}
		
		//Map에저장 (Key:no, Value:Student)
//		Student std1 = new Student(2, "이선희", "010-9999-9999" );
//		Student std2 = new Student(5, "BTS", "010-8888-8888" );
//		Student std3 = new Student(6, "최민식", "010-7777-7777" );
//		
//		Map<Integer, Student> hmap = new HashMap<>();
//		hmap.put(std1.getNo(), std1);
//		hmap.put(std2.getNo(), std2);
//		hmap.put(std3.getNo(), std3);
//		System.out.println(hmap);
		
//		Student s = hmap.get(5);
//		System.out.println(s.getNo() +" " + s.getName() +" " + s.getTel());

		//Set:중복되지 않는 데이터들, 순서가 없다				
//		Set<Integer> ks = hmap.keySet();
//		System.out.println(ks);
//		for(int k : ks) {
//			System.out.println(k);
//		}

//		Iterator<Integer> it =ks.iterator();
//		while(it.hasNext()) {
//			int key = it.next();
//			System.out.println(key);
//			Student s = hmap.get(key);
//			System.out.println(s.getNo() +" " + s.getName() +" " + s.getTel());
//		}
		
		//실습) 
		//result : "success"
		//data : ArrayList<Student>
		Student std1 = new Student(2, "이선희", "010-9999-9999" );
		Student std2 = new Student(5, "BTS", "010-8888-8888" );
		Student std3 = new Student(6, "최민식", "010-7777-7777" );		
		Map<String, Object> hmap = new HashMap<>();
		hmap.put("result", "success");
		//System.out.println(hmap);

		List<Student> slist = new ArrayList<Student>();
		slist.add(std1);
		slist.add(std2);
		slist.add(std3);
		//System.out.println(slist);
		
		hmap.put("data", slist);
		System.out.println(hmap);
		
		String result = (String) hmap.get("result"); //다운캐스팅
		//만약 result가 success라면 학생정보 출력
		//아니면 에러 출력
		if (result.equals("success")) {
			System.out.println("성공");
			List<Student> stdlist = (List<Student>) hmap.get("data");
			System.out.println(stdlist);
			for(Student s : stdlist) {
				System.out.println(s);
				System.out.println(s.getNo() +" " + s.getName() +" " + s.getTel());
			}
		}else {
			System.out.println("에러");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
