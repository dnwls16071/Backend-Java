# 불변 객체(Immutable Object)

## 기본형(Primitive) vs 참조형(Reference)

- 기본형 : 하나의 값을 절대로 공유하지 않는다.
- 참조형 : 메모리 내에 생성된 객체의 참조값을 통해 여러 변수에서 공유할 수 있다.

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);

        a = b;  // b의 값을 "복사"해서 a에 대입한다.
        System.out.println(a);
        System.out.println(b);
    }
}
```

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test(10);
        Test t2 = t1;

        System.out.println(t1.getNumber());
        System.out.println(t2.getNumber());

        t2.setNumber(20);
        System.out.println(t1.getNumber());
        System.out.println(t2.getNumber());
    }
}

class Test {
    private int number;

    public Test(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
```

- 자바는 항상 값을 복사해서 대입한다는 대전제를 지킨다.
- 코드의 의도로 보면 `t2` 인스턴스의 멤버 변수 `number`를 20으로 변경하는 것으로 보이는데 결과를 보면 `t1`, `t2` 모두 바뀌는 것을 볼 수 있다.
- `t1`, `t2`가 가리키는 참조값은 같기 때문에 멤버 변수의 값을 바꾸게 되면 의도치 않게 다른 인스턴스 역시 값이 바뀌게 되는 것이다.
- 이런 문제를 공유 참조로 인한 사이드 이펙트라 하고 이런 문제를 해결하기 위해 불변 객체라는 개념이 등장했다.

## 불변 객체

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        Immutable i1 = new Immutable(10);
        Immutable i2 = i1;

        System.out.println(i1.getValue());
        System.out.println(i2.getValue());

        // i2.setValue(20); final 키워드가 붙어 setter 사용 불가
        i2 = new Immutable(20);
        System.out.println(i1.getValue());
        System.out.println(i2.getValue());
    }
}

class Immutable {
    // 생성자를 통해서 초기화(한 번만)
    private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
```

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        Immutable i1 = new Immutable(10);
        Immutable result = i1.add(90);

        System.out.println(i1.getValue());
        System.out.println(result.getValue());
    }
}

class Immutable {
    // 생성자를 통해서 초기화(한 번만)
    private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // 메서드의 반환 타입을 불변 객체로 설정
    public Immutable add(int num) {
        return new Immutable(value + num);
    }
}
```

- 문제의 원인은 바로 객체의 직접적인 공유 때문이다.
- 문제를 해결하기 위해 예시 코드와 같이 새로운 불변 객체를 생성하여 객체의 직접적인 공유를 피하도록 할 수 있다.
- 불변 객체로 설계하기 위해 `final` 키워드를 사용했는데 `final` 키워드를 사용하게 되면 생성자를 통한 초기화 한 번만 가능하다.
- `setter`를 사용할 수 없기에 메서드를 사용할 때 반환 타입을 불변 객체로 선언하여 새로운 객체를 메모리 상에 만든다.