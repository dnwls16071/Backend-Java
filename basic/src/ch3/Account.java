package ch3;

public class Account {
	int balance;

	void deposit(int amount) {
		this.balance += amount;
	}

	void withdraw(int amount) {
		if (this.balance < amount) {
			System.out.println("잔액 부족");
			return;
		}
		this.balance -= amount;
	}
}
