package project;

import java.util.Scanner;

public class Account1 {
	private double a, b, c, d;
	
	public void add(double credit) { //�Ա��Լ�
		System.out.printf("account1 balance: $%.2f\n", a); // a�� ���� 1�� �ݾ�
		System.out.printf("account2 balance: $%.2f\n\n", b); // b�� ���� 2�� �ݾ�
	}
	
	public void add(double debit) { //����Լ�
		System.out.printf("account1 balance: $%.2f\n", a); // a�� ���� 1�� �ݾ�
		System.out.printf("account2 balance: $%.2f\n\n", b); // b�� ���� 2�� �ݾ�
	}

	public void add(double balance) { //���¿� ���ִ��� �����ִ� �Լ�
		System.out.printf("account1 balance: $%.2f\n", a); // a�� ���� 1�� �ݾ�
		System.out.printf("account2 balance: $%.2f\n\n", b); // b�� ���� 2�� �ݾ�
	}

	}

	public static void main(String[] args) {
		double a = 50.00, b = 0.00;

		Scanner input = new Scanner(System.in);
		System.out.printf("account1 balance: $%.2f\n", a); // a�� ���� 1�� �ݾ�
		System.out.printf("account2 balance: $%.2f\n\n", b); // b�� ���� 2�� �ݾ�
		

		System.out.print("Enter withdrawal amount for account1: "); // c�� ���� 1
																	// �����
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

		System.out.print("Enter withdrawal amount for account2: "); // d�� ���� 2
																	// �����
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