# Wrapper 클래스

## 1. 래퍼 클래스

---

- 기본형의 한계를 극복하기 위해 도입
- 기본형의 한계라 함은 Null 값을 가지지 않는다는 것, 그리고 객체처럼 다루지 않는다는 것이다.
- 래퍼 클래스는 Null 값을 가지면서 기본형 값을 객체로 다룰 수 있다.
- 자바가 제공하는 래퍼 클래스는 불변이며 객체의 참조값을 비교하는 `equals()` 메서드로 비교를 해야 한다.

| 기본형|래퍼클래스|
|----|-----|
| boolean | Boolean |
| char | Character |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |

## 2. 래퍼 클래스 - 오토 박싱 & 언박싱

---

- JDK 1.5 이전에는 기본형과 참조형 간 연산이 불가능했기 때문에 래퍼 클래스로 기본형을 객체로 만들어서 연산을 해야 했다.
- 그러나 이제는 기본형과 참조형 간의 연산이 가능하다.

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 5;

        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a + b);
        System.out.println(a - b);
    }
}
```