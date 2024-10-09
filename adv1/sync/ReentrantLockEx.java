package adv1.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
	private final Lock nonFairLock = new ReentrantLock();	// 비공정 모드 락
	private final Lock fairLock = new ReentrantLock();		// 공정 모드 락

	public void nonPairLockTest() {
		nonFairLock.lock();
		try {
			// 임계 영역
		} finally {
			nonFairLock.unlock();
		}
	}

	public void pairLockTest() {
		fairLock.lock();
		try {
			// 임계 영역
		} finally {
			fairLock.unlock();
		}
	}
}
