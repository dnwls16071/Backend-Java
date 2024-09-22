# 중첩 클래스, 내부 클래스

## 1. 중첩 클래스 분류

---

- static : 정적 중첩 클래스
- non-static : 내부 클래스, 익명 클래스, 지역 클래스
- 내부 클래스의 경우 안에 있는 클래스 바깥 클래스의 구성 요소가 된다.
- 정적 중첩 클래스의 안에 있는 클래스는 바깥의 클래스와는 별개의 클래스다.

## 2. 정적 중첩 클래스 

---

- 내부 클래스를 포함한 모든 중첩 클래스는 특정 클래스가 다른 하나의 클래스 안에서만 사용되거나, 둘이 아주 긴밀한 연관관계를 가지는 경우에만 사용해야 한다.
- 외부의 여러 클래스가 특정 중첩 클래스를 사용하게 된다면 중첩 클래스로 만들면 된다.
- 데이터베이스와 직접적으로 연계되는 엔티티와의 분리를 위해 사용하는 데이터 전달용 객체(DTO)에 정적 중첩 클래스를 사용할 수 있다.
- 정적 중첩 클래스를 사용함으로써 논리적 그룹화가 가능해진다. 패키지를 열었을 때, 다른 곳에서 사용될 필요가 없는 중첩 클래스가 외부에 노출되지 않는다는 장점도 있다.
- 또 캡슐화도 가능해진다. 중첩 클래스는 바깥 클래스의 `private` 멤버에 접근할 수 있다.

```java
// 예시 코드

public class RefactorNetwork {
    
    public void sendMessage(String text) {
        RefactorNetworkMessage rnm = new RefactorNetworkMessage(text);
        rnm.print();
    }

    // 정적 중첩 클래스
    static class RefactorNetworkMessage {

        private String content;

        public RefactorNetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
```

## 3. 내부 클래스

---

- 내부 클래스는 바깥 클래스의 인스턴스를 구성하는 요소가 된다.
- 따라서 내부 클래스 인스턴스만을 별도로 생성할 수 없고 바깥 클래스의 인스턴스가 먼저 생성되어야 한다.
- 개념적으로 보면 바깥 클래스의 인스턴스 내부에 내부 클래스의 인스턴스가 생성된다고 보면 된다.
- 내부 클래스 내부에 선언된 메서드의 지역 변수에 접근 가능, 내부 클래스의 멤버에 접근하려면 `this`를 사용, 바깥 클래스의 멤버에 접근하려면 바깥 클래스 명을 직접 사용해야한다.

```java
// 예시 코드

public class RefactorCar {

    private String model;
    private int level;
    private Engine engine;

    public RefactorCar(String model, int level) {
        this.model = model;
        this.level = level;
        this.engine = new Engine();
    }

    public void engineStart() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    class Engine {

        // 바깥 클래스의 멤버에 접근할 수 있어 getter를 필요로 하지 않음
        public void start() {
            System.out.println("충전 레벨 확인 : " + level);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
```

## 4. 지역 클래스

---

- 지역 클래스는 내부 클래스의 종류 중 하나이다.
- 지역 클래스도 내부 클래스에 속하므로 바깥 클래스의 인스턴스 멤버에 접근할 수 있다.
- 지역 클래스는 지역 변수와 같이 코드 블럭 안에서 정의된다.
- 지역 클래스가 접근하는 지역변수 값을 변경할 수 없다.

```java
// 예시 코드

public class LocalClass {

    private int outInstanceValue = 3;

    // 메서드 내부에 선언된 지역 클래스
    public void process(int parameter) {

        // 메서드 내부에 선언된 멤버에 대해서 접근 제어자를 사용할 수 없다.
        int localValue = 2;

        class Local {
            private int value = 1;

            public void testMethod() {
                System.out.println(value);
                System.out.println(localValue);
                System.out.println(outInstanceValue);
                System.out.println(parameter);
            }
        }

        Local local = new Local();
        local.testMethod();
    }
}
```

## 5. 익명 클래스

---

- 익명 클래스는 클래스 본문을 정의함과 동시에 생성한다.
- 익명 클래스는 단 한 번만 인스턴스를 생성할 수 있다.
- 하지만 여러 번 생성이 필요한 경우라면 익명 클래스를 사용할 수 없다.

```java
// 예시 코드

public class AnonymousClass {

    private int outInstanceValue = 3;

    // 메서드 내부에 선언된 지역 클래스
    public void process(int parameter) {

        // 메서드 내부에 선언된 멤버에 대해서 접근 제어자를 사용할 수 없다.
        int localValue = 2;
        
        Printer printer = new Printer() {

            private int value = 1;

            @Override
            public void testMethod() {
                System.out.println(value);
                System.out.println(localValue);
                System.out.println(outInstanceValue);
                System.out.println(parameter);
            }
        };

        printer.testMethod();
    }
}
```