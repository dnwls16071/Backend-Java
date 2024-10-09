package adv1.sync.v4;

import adv1.sync.BankAccount;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;

public class BankMainV4 {
	public static void main(String[] args) throws InterruptedException {
		BankAccount bankAccount = new BankAccountImplV4(1000);
		Thread thread1 = new Thread(new WithdrawTask(bankAccount, 800));
		Thread thread2 = new Thread(new WithdrawTask(bankAccount, 600));

		thread1.start();
		thread2.start();

		sleep(500);

		log("thread1.state = " + thread1.getState());
		log("thread2.state = " + thread2.getState());
		log("최종 잔액 : " + bankAccount.getBalance());
	}
}
