package adv1.sync.v5;

import adv1.sync.BankAccount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;


public class BankAccountImplV5 implements BankAccount {

	private int balance;
	private final Lock lock = new ReentrantLock();

	public BankAccountImplV5(int balance) {
		this.balance = balance;
	}

	@Override
	public boolean withdraw(int amount) {
		log("거래 시작 : " + getClass().getSimpleName());
		log("[검증 시작] 출금액 : " + amount + ", 잔액 : " + balance);

		// ReentrantLock 사용
		// lock()을 사용했다면 반드시 unlock()으로 락을 해제해야만 한다.
		// 락을 획득할 수 없다면? → 다른 쓰레드가 락을 획득하고 이미 작업을 수행 중
		if (!lock.tryLock()) {
			log("[진입 실패] : 이미 처리 중인 작업이 존재합니다.");
			return false;
		}

		try {
			log("[검증 시작] 출금액 : " + amount + ", 잔액 : " + balance);
			if (balance < amount) {
				log("[검증 실패] 출금액 : " + amount + ", 잔액 : " + balance);
				return false;
			}

			log("[검증 완료] 출금액 : " + amount + ", 잔액 : " + balance);
			sleep(1000);    // 출금 소요 시간 :1초
			balance -= amount;
			log("[출금 완료] 출금액 : " + amount + ", 잔액 : " + balance);
		} finally {
			lock.unlock();
		}
		log("거래 종료");
		return true;
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
