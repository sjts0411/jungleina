package project;


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