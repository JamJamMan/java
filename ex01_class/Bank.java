package ex01_class;
//은행클래스:Bank
//필드:은행명(bankname), 계좌번호(bankno), 잔액(balance)
//생성자, 게터, 세터
public class Bank {
	// 필드
	private String bankname;
	private String bankno;
	private int balance;

	// 생성자:오버로딩
	public Bank(String bankname, String bankno) {
		this.bankname = bankname;
		this.bankno = bankno;
	}

	public Bank(String bankname, String bankno, int balance) {
		this.bankname = bankname;
		this.bankno = bankno;
		this.balance = balance;
	}

	// 세터/게터
	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankno() {
		return bankno;
	}

	public int getBalance() {
		return balance;
	}
	
	//입금메소드
	void input(int money) {
		balance += money;
	}
	
	//출금메소드
	int output(int money) {
		if (balance-money < 0 ) {
			return -1; //출금 안됨
		}
		balance -= money;
		return 0; //출금 됨
	}
	
	//어노테이션
	//오버라이딩:부모클래스의 메소드를 재정의
	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
	}
	
}

