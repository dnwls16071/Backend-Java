# 제네릭

## 1. 제네릭

---

- 제네릭은 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능을 말한다.
- 객체 타입을 컴파일 시에 체크하기 때문에 타입 안정성을 높이면서 형변환의 번거로움이 줄어든다.

```java
// 예시 코드

public class Main {
    public static void main(String[] args) {
        Generic<String> sg = new Generic<>();
        sg.setValue("string");
        System.out.println(sg.getValue());

        Generic<Integer> ig = new Generic<>();
        ig.setValue(10);
        System.out.println(ig.getValue());
    }
}

class Generic<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
```

## 2. 제네릭 용어와 관례

---

- 제네릭이란 일반적인, 범용적인이라는 영어 단어 뜻이다.
- 제네릭 타입 → 클래스나 인터페이스를 정의할 때 타입 매개변수를 사용하는 것
- 타입 매개변수 → 제네릭 타입이나 메서드에서 사용되는 변수로, 실제 타입으로 대체된다.
- 타입 매개변수로 사용되는 키워드는 다음과 같다.

  - `<T>` : Type
  - `<K>` : Key
  - `<E>` : Element
  - `<N>` : Number
  - `<V>` : Value

## 3. 제네릭 활용

---

```java
// 예시 코드

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

// ...

public class Main {
    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>();
        Box<Dog> dogBox = new Box<>();

        catBox.setValue(new Cat("cat", 10));
        dogBox.setValue(new Dog("dog", 15));

        System.out.println(catBox.getValue().getName());
        System.out.println(dogBox.getValue().getName());
    }
}
```

## 4. 타입 매개변수 제한

---

- 제네릭 타입을 그대로 사용하게 되면 컴파일 시 문제가 발생한다.
- 왜냐하면 어떤 타입이 들어올지 모르기 때문이다.(`Animal` 타입인지... `Object` 타입인지)
- 따라서 아래와 같이 타입 매개변수를 제한하면 메서드도 사용할 수 있고 타입의 상한과 하한을 결정할 수 있게 된다.

```java
// 예시 코드

public class GenericHospital<T extends Animal> {
    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
    }

    public T bigger(T t1, T t2) {
        if (t1.getSize() > t2.getSize()) {
            return t1;
        } else {
            return t2;
        }
    }
}
```

## 5. 제네릭 메서드

---

- 제네릭 메서드의 핵심은 메서드를 호출하는 시점에 타입을 결정하는 것이다.
- `checkup()` 메서드를 보면 파라미터로 전달되는 값이 타입을 결정하고 `bigger()` 메서드 역시 파라미터로 전달되는 값에 따라 반환 타입이 결정되는 것을 알 수 있다.

```java
// 예시 코드

public class GenericMethod {

    // 제네릭 메서드
    // Animal 클래스 상한
    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
    }

    // 제네릭 메서드
    // Animal 클래스 상한
    public static <T extends Animal> T bigger(T t1, T t2) {
        if (t1.getSize() > t2.getSize()) {
            return t1;
        } else {
            return t2;
        }
    }

    public static void main(String[] args) {

        Dog r1 = bigger(new Dog("dog1", 1), new Dog("dog2", 2));
        Cat r2 = bigger(new Cat("cat1", 1), new Cat("cat2", 2));

        checkup(r1);
        checkup(r2);
    }
}
```

## 6. 와일드 카드

--- 

- 와일드 카드인 `?`는 모든 타입을 다 받을 수 있다.
- `?`에 타입 제한을 명시하지 않을 경우 기본적으로 반환되는 타입은 모든 클래스의 최고 조상인 Object가 된다.
- 상한, 하한에 사용되는 키워드는 `extend`, `super`가 있다.

```java
// 예시 코드

public class WildcardMethod {

    public static void wildCardMethod1(Box<?> box) {
        System.out.println(box.getValue());
    }

    public static void wildCardMethod2(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
    }

    public static <T extends Animal> T wildCardMethod3(Box<? extends T> box) {
        T t = box.getValue();
        return t;
    }

    public static void main(String[] args) {
        Box<Cat> cb = new Box<>();
        Box<Dog> db = new Box<>();

        cb.setValue(new Cat("cat", 10));
        db.setValue(new Dog("dog", 20));

        wildCardMethod1(cb);
        wildCardMethod1(db);

        wildCardMethod2(cb);
        wildCardMethod2(db);

        Cat cat = wildCardMethod3(cb);
        Dog dog = wildCardMethod3(db);
        System.out.println(cat.getName());
        System.out.println(cat.getSize());

        System.out.println(dog.getName());
        System.out.println(dog.getSize());
    }
}
```

## 7. 타입 이레이저

---

- 제네릭은 자바 컴파일 단계에서만 사용되고 컴파일 이후에는 제네릭 정보가 삭제된다.
- 제네릭에 사용된 타입 매개변수가 모두 사라지는 것이다. 컴파일 전후 코드를 비교해보면 이해가 될 것이다.
- `<T>`에 지정한 타입들은 타입 이레이저에 의해 컴파일 이후 지워지게 된다.

```java
// 예시 코드

public class TypeEraser {
    public static void main(String[] args) {
        Generic<Integer> i = new Generic<>();
        i.setValue(100);
        System.out.println(i.getValue());
    }
}

class Generic<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
```