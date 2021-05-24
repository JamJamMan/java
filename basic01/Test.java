package basic01;

import java.io.UnsupportedEncodingException;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// 한글 길이 테스트
		String c ="가";
		System.out.println(c.length()); //문자열의 길이
		System.out.println(c.getBytes("utf-8").length); //utf-8
		System.out.println(c.getBytes("euc-kr").length);
		
	}

}
