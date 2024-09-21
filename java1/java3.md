# String 클래스

## 1. String 클래스 - 불변 객체

---

- String은 클래스이기 때문에 기본형이 아닌 참조형에 해당한다.
- 참조형의 경우 `+`(덧셈 연산자)를 사용할 수 없으나 문자열의 경우 자주 다루기에 특별히 `+` 연산을 제공한다.
- `+` 연산을 사용하여 문자열을 결합하는 것은 매 연산마다 새로운 문자열을 가진 String 타입의 인스턴스가 메모리 상에 생성되므로 가능하면 결합 횟수를 줄이는 것이 좋다.
- 문자열 결합 시 새로운 인스턴스가 생성되어 메모리 상에 존재하는 것은 `System.identityHashCode()` 메서드를 사용해서 확인할 수 있다.

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        String a = "나는";
        String b = " 행복합니다.";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(a + b));
    }
}
```

## 2. String 클래스 - 비교

---

- 앞서 공부했듯이 String 클래스는 참조형이다. 메모리 상에 존재하는 주소값을 가리킨다는 것이다.
- 비교에는 두 가지가 있다. 동일성 측면과 동등성 측면
- 동일성 측면의 비교는 객체의 참조값을 비교하는 것이고 동등성 측면의 비교는 객체의 논리값을 비교하는 것이다.
- `new` 키워드를 사용해 메모리 상에 인스턴스를 생성하는 경우 참조값이 다르다.
- Object 클래스가 제공하는 `equals()` 메서드의 경우 `==` 비교가 기본이나 String 클래스 내부에 정의된 `equals()` 메서드가 오버라이딩 되어 있기 때문에 별도로 작성할 필요가 없는 것이다. 

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        String a = new String("나는");
        String b = new String("나는");

        System.out.println(a == b);         // false(메모리 상에 인스턴스 2개가 존재하게되므로)
        System.out.println(a.equals(b));    // true(객체의 논리값이 서로 같으므로)
    }
}
```

- 위의 경우는 `new` 키워드를 사용한 경우의 예시이다. 아래와 같이 문자열 풀을 이용할 수도 있다.

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        String a = "나는";
        String b = "나는";

        System.out.println(a == b);         // true(문자열 풀에선 객체의 논리값은 하나로 관리된다.)
        System.out.println(a.equals(b));    // true(문자열 풀에선 객체의 참조값 역시 하나로 관리된다.)
    }
}
```

- 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이면서 문자를 만드는 시간도 줄어들기 때문에 성능 최적화를 도모할 수 있다.
- `new` 키워드를 사용하여 인스턴스를 생성할 경우 힙 영역에 새로운 객체가 생성되지만 리터럴의 경우 문자열 풀에 저장된다.
- 리터럴의 경우 같은 내용의 문자열이 이미 풀에 존재한다면 그 참조를 재사용하고 `new` 키워드의 경우는 항상 새로운 객체를 생성한다.


## 3. StringBuilder 클래스

---

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        // append의 반환 타입이 StringBuilder 타입이기에 가능한 메서드 체이닝
        StringBuilder result = stringBuilder.
                append('A').
                append('B').
                append('C').
                append('D').
                append('E').
                append('F');

        System.out.println(result);
    }
}
```

- String - 불변 클래스, 즉, 한 번 생성되면 그 내용을 변경할 수 없다. 문자열에 변화를 주고 싶다면 새로운 불변 객체가 메모리 상에 만들어지면서 메모리와 처리 시간을 더 많이 소모하게 된다.
- StringBuilder - 가변 클래스, 만들어진 객체 안에서 문자열의 변화를 도모할 수 있으며 이 과정에서 새로운 객체를 생성하지 않는다. 하지만 가변 클래스는 참조형으로 공유 참조로 인한 사이드 이펙트를 주의해서 사용해야 한다.

## 4. StringBuilder vs StringBuffer

---

- StringBuilder : 멀티 쓰레드 상황에 안전하지 않지만 동기화 오버헤드가 없어 속도가 빠르다.
- StringBuffer : 내부에 동기화가 되어 있어 멀티 쓰레드 상황에 안전하나 동기화 오버헤드가 있어 속도가 느리다.