package adv1.sync.v4;

import adv1.sync.BankAccount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;


public class BankAccountImplV4 implements BankAccount {

	private int balance;
	private final Lock lock = new ReentrantLock();

	public BankAccountImplV4(int balance) {
		this.balance = balance;
	}

	@Override
	public boolean withdraw(int amount) {
		log("거래 시작 : " + getClass().getSimpleName());
		log("[검증 시작] 출금액 : " + amount + ", 잔액 : " + balance);

		// ReentrantLock 사용
		// lock()을 사용했다면 반드시 unlock()으로 락을 해제해야만 한다.
		lock.lock();

		try {
			if (balance < amount) {
				log("[검증 실패] 출금액 : " + amount + ", 잔액 : " + balance);
				return false;
			}

			log("[검증 완료] 출금액 : " + amount + ", 잔액 : " + balance);
			sleep(1000);    // 출금 소요 시간 :1초
			balance -= amount;
			log("[출금 완료] 출금액 : " + amount + ", 잔액 : " + balance);
			log("거래 종료");
			return true;
		} finally {
			lock.unlock();
		}
	}

	@Override
	public int getBalance() {
		lock.lock();
		try {
			return balance;
		} finally {
			lock.unlock();
		}
	}
}
