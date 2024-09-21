# Object

## 1. Object 클래스

---

1. Object 클래스는 모든 클래스의 최고 조상
2. Object 클래스의 경우 묵시적 상속에 해당하여 별도의 명시가 필요하지 않음
3. Object 다형성의 한계 - 객체의 타입에 맞는 다운캐스팅을 필요로 함

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        action(dog);
        action(cat);
    }

    // Object를 사용
    private static void action(Object object) {
        if (object instanceof Dog) {
            ((Dog) object).sound();
        } else if (object instanceof Cat) {
            ((Cat) object).sound();
        }
    }
}

class Dog {
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat {
    void sound() {
        System.out.println("야옹");
    }
}
```

## 2. equals() - 동일성과 동등성

- 동일성 : `==` 연산자를 사용해서 객체의 참조값을 비교
- 동등성 : `equals()`를 사용해서 객체의 논리값을 비교(예시를 든다면 사람의 주민등록번호를 떠올릴 수 있다.)

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        UserV1 u1 = new UserV1("user");
        UserV1 u2 = new UserV1("user");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}

class UserV1 {
    private String name;

    public UserV1(String name) {
        this.name = name;
    }
}
```

- 동일성 측면에서의 비교 : 메모리 상에서 `u1`, `u2`가 가리키는 참조값은 다르기 때문에 `false`
- 동등성 측면에서의 비교 : 논리 값은 같으나 결과를 보면 `false`가 나오게 됨 → 그 이유는 Object 클래스의 `equals()` 메서드를 뜯어보면 알 수 있다.

```java
public boolean equals(Object obj) {
    return (this == obj);
}
```

- Object 클래스에서 기본으로 제공하는 `equals()` 메서드를 보면 기본이 `==` 비교로 참조값을 기준으로 비교를 하고 있다는 것을 알 수 있다.
- 메모리 상에서 `u1`, `u2`가 존재하는 참조값은 다르기 때문에 `false`를 반환하게 되는 것이다.
- 이 `equals()` 메서드를 오버라이딩해서 주소가 아닌 객체 내부 값을 비교하도록 변경하면 된다.

```java
// 예시 코드

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        UserV1 u1 = new UserV1("user");
        UserV1 u2 = new UserV1("user");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}

class UserV1 {
    private String name;

    public UserV1(String name) {
        this.name = name;
    }

    // equals() & hashCode() 메서드를 오버라이딩
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV1 userV1 = (UserV1) object;
        return Objects.equals(name, userV1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
```