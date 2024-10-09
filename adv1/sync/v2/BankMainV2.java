package adv1.sync.v2;

import sync.BankAccount;

import static adv1.util.Logger.log;

public class BankMainV2 {
	public static void main(String[] args) throws InterruptedException {
		BankAccount bankAccount = new BankAccountImplV2(1000);
		Thread thread1 = new Thread(new WithdrawTask(bankAccount, 800));
		Thread thread2 = new Thread(new WithdrawTask(bankAccount, 600));

		thread1.start();
		thread1.join();

		thread2.start();
		thread2.join();

		log("최종 잔액 : " + bankAccount.getBalance());
	}
}
