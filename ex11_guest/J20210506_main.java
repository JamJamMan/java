package ex11_guest;

import java.util.List;
import java.util.Scanner;

public class J20210506_main {

	public static void main(String[] args) {
		//1. 방명록 작성
		//2. 방명록 수정
		//3. 방명록 삭제
		//4. 방명록 조회
		//9. 종료
		
		Scanner sc = new Scanner(System.in);
		GuestDAO gdao = new GuestDAOImpl();		
		
		int no;
		while(true) {
			System.out.print("번호는?");
			no = sc.nextInt();
			if (no==1) {
				GuestDTO gdto = new GuestDTO("홍길동", "hong@gamil.com", "1111", "가입인사");
				int cnt = gdao.insert(gdto);
				System.out.println(cnt +"건 추가");	
				
			}else if (no==2) {
				GuestDTO gdto = new GuestDTO(3, "이순신", "lee@gamil.com", "2222", "가입인사");
				int cnt = gdao.update(gdto);
				System.out.println(cnt +"건 수정");		
				
			}else if (no==9) {
				DBConn.dbClose();
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
		}
		


		
	}

}
