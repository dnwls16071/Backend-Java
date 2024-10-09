package adv1.sync;

public interface BankAccount {
	boolean withdraw(int amount);	// 출금 여부
	int getBalance();				// 잔액 조회
}
