package ch4;

import java.util.Random;

public class LottoGenerator {
	private final Random random = new Random();
	private int[] array;
	private int count;

	// 1~45 사이의 숫자를 6개 뽑아야 한다.
	public int[] lottoGenerateMethod() {
		array = new int[6];
		count = 0;
		while (count < 6) {
			int rand = random.nextInt(45) + 1;
			
			// 중복 여부 체크
			if (isUnique(rand)) {
				array[count] = rand;
				count++;
			}
		}
		return array;
	}

	// 중복 여부 체크
	private boolean isUnique(int rand) {
		for (int i = 0; i < count; i++) {
			if (array[i] == rand) {
				return false;
			}
		}
		return true;
	}
}
