package project;


public class Account1 {
	private double a, b, c, d;
		
	public void add(double credit) { //입금함수
		System.out.printf("account1 balance: $%.2f\n", a); // a는 계좌 1의 금액
		System.out.printf("account2 balance: $%.2f\n\n", b); // b는 계좌 2의 금액
	}
	
	public void add(double debit) { //출금함수
		System.out.printf("account1 balance: $%.2f\n", a); // a는 계좌 1의 금액
		System.out.printf("account2 balance: $%.2f\n\n", b); // b는 계좌 2의 금액
	}

	public void add(double balance) { //계좌에 얼마있는지 보여주는 함수
		System.out.printf("account1 balance: $%.2f\n", a); // a는 계좌 1의 금액
		System.out.printf("account2 balance: $%.2f\n\n", b); // b는 계좌 2의 금액
	}
	}