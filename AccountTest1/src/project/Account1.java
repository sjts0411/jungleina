package project;

import java.util.Scanner;

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

	public static void main(String[] args) {
		double a = 50.00, b = 0.00;

		Scanner input = new Scanner(System.in);
		System.out.printf("account1 balance: $%.2f\n", a); // a는 계좌 1의 금액
		System.out.printf("account2 balance: $%.2f\n\n", b); // b는 계좌 2의 금액
		

		System.out.print("Enter withdrawal amount for account1: "); // c는 계좌 1
																	// 출금임
		double c = input.nextDouble();

		a = a - c;
		if (a - c <= 0) {
			System.out.printf("subtracting %.2f from account1 balance\n", a);
			System.out.printf("account1 balance: $%.2f\n", a);
			System.out.printf("account2 balance: $%.2f\n\n", b);
		} else {
			System.out.printf("Debit amount exceeded account balance.\n");
			a = a + c;
			System.out.printf("account1 balance: $%.2f\n", a);
			System.out.printf("account2 balance: $%.2f\n\n", b);
		}

		System.out.print("Enter withdrawal amount for account2: "); // d는 계좌 2
																	// 출금임
		double d = input.nextDouble();

		b = b - d;
		if (a - d <= 0) {
			System.out.printf("subtracting %.2f from account1 balance\n", a);
			System.out.printf("account1 balance: $%.2f\n", a);
			System.out.printf("account2 balance: $%.2f\n\n", b);
		} else {
			System.out.printf("Debit amount exceeded account balance.\n");
			b = b + d;
			System.out.printf("account1 balance: $%.2f\n", a);
			System.out.printf("account2 balance: $%.2f\n", b);
		}

	}
}