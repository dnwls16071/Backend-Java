package adv1.sync.v1;

import sync.BankAccount;

import static adv1.util.Logger.log;

public class BankMainV1 {
	public static void main(String[] args) throws InterruptedException {
		BankAccount bankAccount = new BankAccountImplV1(1000);
		Thread thread1 = new Thread(new WithdrawTask(bankAccount, 500));
		Thread thread2 = new Thread(new WithdrawTask(bankAccount, 500));

		thread1.start();
		thread1.join();

		thread2.start();
		thread2.join();

		log("최종 잔액 : " + bankAccount.getBalance());
	}
}
