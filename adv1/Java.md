# 자바 고급편 (1)

## 멀티태스킹(MultiTasking) vs 멀티프로세싱(MultiProcessing)

<details>
   <summary> 정리 (📖 Click)</summary>
<br />

* 멀티태스킹
  * 운영체제 소프트웨어의 관점
  * 단일 CPU가 여러 작업을 동시에 수행하는 것처럼 보이게 하는 것
  * 소프트웨어 기반으로 CPU 시간을 분할하여 각 작업에 할당한다.

* 멀티프로세싱
  * 하드웨어 장비의 관점 
  * 여러 CPU를 사용하여 동시에 여러 작업을 수행하는 것

-----------------------
</details>

## 프로세스와 쓰레드

<details>
   <summary> 정리 (📖 Click)</summary>
<br />

* 프로세스
  * 실행 중인 프로그램
  * 각 프로세스는 독립적인 메모리 공간을 보유하며 운영체제에서 별도의 작업 단위로 분리해서 관리된다.
  * 각 프로세스는 별도의 메모리 공간을 가지기 때문에 서로 간섭하지 않는다.
  * 프로세스는 서로 격리되어 관리되기 때문에 하나의 프로세스가 충돌해도 다른 프로세스에는 영향을 미치지 않는다.
  * 특정 프로세스에 심각한 문제가 발생하면 해당 프로세스만 종료되고 다른 프로세스에 영향을 주지 않는다.

![img.png](img.png)

* 프로세스 구성
  * 코드 : 실행할 프로그램의 코드가 저장되는 부분
  * 힙 : 동적으로 할당되는 메모리 영역
  * 스택 : 메서드 호출 시 생성되는 지역 변수와 반환 주소가 저장되는 영역
  * 데이터 : 전역 변수 및 정적 변수가 저장되는 부분

* 쓰레드
  * 프로세스는 하나 이상의 쓰레드를 반드시 포함한다.
  * 모든 쓰레드는 프로세스 내의 코드, 데이터, 힙을 공유한다.
  * 각 쓰레드는 개별 스택을 가지고 있다.

* 단일 쓰레드 vs 멀티 쓰레드
  * 단일 쓰레드 : 한 프로세스 내에 하나의 쓰레드만 존재
  * 멀티 쓰레드 : 한 프로세스 내에 여러 쓰레드가 존재

-----------------------
</details>

## 컨텍스트 스위칭

<details>
   <summary> 정리 (📖 Click)</summary>
<br />

* 현재 작업하는 문맥을 변경하는 것
  * 예를 들어, 쓰레드 A와 쓰레드 B가 있다고 가정하자.
  * 쓰레드 A를 잠시 멈추고 쓰레드 B를 실행하고자 할 때, 쓰레드 B의 작업이 끝나고 쓰레드 A로 그냥 돌아갈 수 없다.
  * CPU에서 쓰레드를 실행하는데, 쓰레드 A의 코드가 어디까지 수행되었는지 위치를 찾아야 한다.
  * 또한 쓰레드 A에서 계산하던 변수들의 값을 다시 CPU로 불러들여야 한다.
  * 이런 과정을 컨텍스트 스위칭이라고 한다.

* 컨텍스트 스위칭 시 걸리는 시간은 아주 짧으나 쓰레드가 매우 많아지게 된다면 이 비용이 커질 수 있다.
<p>

* CPU 바운드 작업 vs I/O 바운드 작업
  * CPU 바운드 작업
    * CPU의 연산 능력을 많이 요구하는 작업
    * 이러한 작업은 주로 계산, 데이터 처리, 알고리즘 실행 등 CPU 처리 속도가 작업 완료 시간을 결정하는 경우
  * I/O 바운드 작업
    * 디스크, 네트워크, 파일 시스템 등과 같은 입출력(I/O) 작업을 많이 요구하는 작업
    * 이런 작업은 I/O 작업이 완료될 때까지 대기 시간이 많이 발생하며, CPU는 상대적으로 유휴 상태에 있는 경우가 많다.
    * 데이터베이스 쿼리 처리, 파일 읽기/쓰기, 네트워크 통신, 사용자 입력 처리

-----------------------
</details>

## 쓰레드

<details>
   <summary> 정리 (📖 Click)</summary>
<br />

* 쓰레드 간 실행 순서는 보장되지 않는다.
* `start()` vs `run()`

![img_1.png](img_1.png)

* **실행 결과를 보면 새로 생성한 쓰레드가 `run()`을 실행하는 것이 아니라 `main` 쓰레드가 `run()`을 실행하는 것을 볼 수 있다.**
* 자바를 처음 실행하면 `main` 쓰레드가 `main()` 메서드를 호출하면서 시작한다.
* `main` 쓰레드가 HelloThread에 있는 `run()`이라는 메서드를 호출한다.
* `main` 쓰레드가 `run()` 메서드를 실행했기 때문에 `main` 쓰레드가 사용하는 스택 위에 `run()` 스택 프레임이 올라간다.
* 결론 : `start()` 메서드를 호출해야지 `run()` 메서드를 호출하면 안 된다.

-----------------------
</details>

## 데몬 쓰레드

<details>
   <summary> 정리 (📖 Click)</summary>
<br />

* 백그라운드에서 보조적인 작업을 수행하는 쓰레드
* 모든 사용자 쓰레드가 종료되면 데몬 쓰레드는 자동으로 종료된다.
* JVM은 데몬 쓰레드의 실행 완료를 기다리지 않고 종료된다. 데몬 쓰레드가 아닌 모든 쓰레드가 종료되면 자바 프로그램도 종료된다.

```java
package thread;

public class DaemonThreadMain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": Main 쓰레드 실행");

		DaemonThread daemonThread = new DaemonThread();
		daemonThread.setDaemon(true);	// 데몬 쓰레드 여부
		daemonThread.start();

		System.out.println(Thread.currentThread().getName() + ": Main 쓰레드 종료");
	}

	static class DaemonThread extends Thread {

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + ": 데몬 쓰레드 실행");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println(Thread.currentThread().getName() + ": 데몬 쓰레드 종료");
		}
	}
}
```

* 위와 같이 `setDaemon()`를 `true`로 지정하여 데몬 쓰레드로 만들면 Main 쓰레드가 데몬 쓰레드를 기다리지 않는다.
* 하지만 `false`로 지정하면 데몬 쓰레드가 아닌 사용자 쓰레드가 되므로 Main 쓰레드는 모든 쓰레드가 끝날 때까지 기다리게 된다.

-----------------------
</details>

## 쓰레드 생성 - Thread 상속, Runnable 인터페이스 구현

<details>
   <summary> 정리 (📖 Click)</summary>
<br />

* 쓰레드를 사용하는 방법으로는 두 가지 방법이 있다.
  * Thread 클래스를 상속받기
  * Runnable 인터페이스를 구현하기
* 위와 같은 두 가지 방법이 존재하지만 쓰레드를 생성할 때는 Thread 클래스를 상속하는 방법보다 Runnable 인터페이스를 구현하는 방식이 더 나은 선택이다.

<p>

* Thread 클래스 상속 방식
  * 장점
    * 간단한 구현 : Thread 클래스를 상속받아 `run()` 메서드만 재정의하면 된다.
  * 단점
    * 상속의 제한 : 자바는 단일 상속만을 허용(다이아몬드 문제 때문에)하므로 이미 다른 클래스를 상속받고 있는 경우 Thread 클래스를 상속받기 어렵다.
    * 유연성 부족 : 인터페이스를 사용하는 방법에 비해 유연성이 떨어진다.

* Runnable 인터페이스 구현 방식
  * 장점
    * 상속의 자유로움 : Runnable 인터페이스 방식은 다른 클래스를 상속받아도 문제없이 구현할 수 있다.
    * 코드의 분리 : 쓰레드와 실행할 작업을 분리하여 코드 가독성을 높일 수 있다.
    * 여러 쓰레드가 동일한 Runnable 객체를 공유할 수 있어 자원 관리를 효율적으로 할 수 있다.
  * 단점
    * 코드가 약간 복잡해질 수 있다. Runnable 객체를 생성하고 Thread에 전달해야 한다.

```java
package thread;

public class HelloRunnableMain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": start");

		HelloRunnable hello = new HelloRunnable();  // Runnable 객체 생성
		Thread thread = new Thread(hello);          // Thread에 전달
		thread.start();

		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
```

-----------------------
</details>

##  Runnable을 만드는 다양한 방법

<details>
   <summary> 정리 (📖 Click)</summary>
<br />

* 정적 중첩 클래스

```java
static class InnerRunnable implements Runnable {
    @Override
    public void run() {
       log("run()");
    }
}
```

* 익명 클래스

```java
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        log("run()");
    }
};
```

* 람다식 형태

```java
Runnable runnable = () -> log("run()");
```

-----------------------
</details>

## 문제와 풀이

<details>
   <summary> 정리 (📖 Click)</summary>
<br />

#### 1. Thread 클래스를 상속받은 CounterThread 쓰레드 클래스를 만들고 1부터 5까지 숫자를 1초 간격으로 출력해야 한다.

-----------------------
</details>

```java
package thread.qa;

import static util.Logger.log;

public class Question01 {
    public static void main(String[] args) {
        CounterThread thread = new CounterThread();
        thread.start();
    }

    static class CounterThread extends Thread {

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
                try {
                  Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
```
#### 2. CounterRunnable 이름의 클래스를 만들자. 이 클래스는 Runnable 인터페이스를 구현해야 한다. 기능은 위의 문제와 동일하다.

```java
package thread.qa;

import static util.Logger.log;

public class Question02 {
    public static void main(String[] args) {
        CounterRunnable runnable = new CounterRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
  
    static class CounterRunnable implements Runnable {
  
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
                try {
                  Thread.sleep(1000);
                } catch (InterruptedException e) {
                  throw new RuntimeException(e);
                }
            }
        }
    }
}
```
#### 3. 익명 클래스를 사용해 구현

```java
package thread.qa;

import static util.Logger.log;

public class Question03 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
    
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    log("value: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
		
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
```


<details>
   <summary> 정리 (📖 Click)</summary>
<br />


-----------------------
</details>



<details>
   <summary> 정리 (📖 Click)</summary>
<br />


-----------------------
</details>



<details>
   <summary> 정리 (📖 Click)</summary>
<br />


-----------------------
</details>



<details>
   <summary> 정리 (📖 Click)</summary>
<br />


-----------------------
</details>



<details>
   <summary> 정리 (📖 Click)</summary>
<br />


-----------------------
</details>



<details>
   <summary> 정리 (📖 Click)</summary>
<br />


-----------------------
</details>



<details>
   <summary> 정리 (📖 Click)</summary>
<br />


-----------------------
</details>



<details>
   <summary> 정리 (📖 Click)</summary>
<br />


-----------------------
</details>



<details>
   <summary> 정리 (📖 Click)</summary>
<br />


-----------------------
</details>
