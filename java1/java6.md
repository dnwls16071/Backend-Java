# 날짜와 시간

## 1. 날짜와 시간 라이브러리

---

- 참고: https://docs.oracle.com/javase/tutorial/datetime/iso/overview.html
- LocalDate, LocalTime, LocalDateTime : 세계 시간대를 고려하지 않아 타임존이 적용되지 않는다.
- ZonedDateTime, OffsetDateTime : 시간대를 고려한 날짜와 시간을 표현
- Instant : 시간의 한 지점
- Period, Duration : 시간의 간격
- 모든 날짜 클래스는 불변이다. 변경이 필요하다면 반환 타입을 날짜 클래스로 선언해야 한다.

## 2. LocalDateTime, LocalDate, LocalTime

---

```java
// 예시 코드

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2024, 9, 22);

        System.out.println(ld1);
        System.out.println(ld2);

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2024, 9, 22, 11, 55);

        System.out.println(ldt1);
        System.out.println(ldt2);

        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(12, 0);

        System.out.println(lt1);
        System.out.println(lt2);
    }
}
```

## 3. ZonedDateTime, OffsetDateTime

---

- ZonedDateTime은 구체적인 지역 시간대를 나타내길 원할 때, OffsetDateTime은 UTC와의 시간 차이만을 나타내길 원할 때 사용한다.

```java
// 예시 코드

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1);

        // 지원 가능한 ZoneId 목록 확인
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        LocalDateTime ldt = LocalDateTime.of(2024, 9, 22, 12, 30, 0);
        ZonedDateTime zdt2 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime zdt3 = ZonedDateTime.of(ldt, ZoneId.of("America/Los_Angeles"));
        ZonedDateTime zdt4 = ZonedDateTime.of(ldt, ZoneId.of("Europe/Paris"));

        System.out.println(zdt2);
        System.out.println(zdt3);
        System.out.println(zdt4);

        OffsetDateTime odt1 = OffsetDateTime.now();
        System.out.println(odt1);
    }
}
```

## 4. Instant

---

- Instant 내부에는 초 데이터(나노초, 초)만 포함되어 있다.

```java
// 예시 코드

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant i = Instant.now();
        System.out.println(i);
    }
}
```

## 5. Duration, Period

---

- Period, Duration 모두 시간 사이의 간격을 나타낸다.
- Period가 좀 더 큰 범주의 시간 사이 간격을 나타내고, Duration은 작은 범주의 시간 사이 간격을 나타낸다.
- Period는 년/월/일, Duration은 시/분/초 간격을 나타낸다.

```java
// 예시 코드

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Period p1 = Period.ofDays(1);

        LocalDate ld1 = LocalDate.of(2024, 9, 22);
        LocalDate plusLd1 = ld1.plus(p1);
        System.out.println(plusLd1);

        Duration d1 = Duration.ofMinutes(30);

        LocalDateTime ldt1 = LocalDateTime.of(2024, 9, 22, 12, 30, 0);
        LocalDateTime plusLd2 = ldt1.plus(d1);
        System.out.println(plusLd2);
    }
}
```

## 6. 날짜와 시간 인터페이스

---

- 특정 시점의 시간

  - TemporalAccessor : 날짜 인터페이스
  - Temporal : 날짜 인터페이스


- 시간의 간격

  - TemporalAmount : 시간 인터페이스


- 시간의 단위와 시간 필드

  - TemporalUnit 인터페이스 : 날짜와 시간을 측정하는 단위
  - ChronoUnit 구현체 : 열거형으로 구현

    
```java
// 예시 코드

import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        ChronoUnit[] chronoUnits = ChronoUnit.values();
        for (ChronoUnit value : chronoUnits) {
            System.out.println(value);
        }

        System.out.println("============================");

        ChronoField[] chronoFields = ChronoField.values();
        for (ChronoField value : chronoFields) {
            System.out.println(value);
        }
    }
}
```

## 7. 날짜와 시간 문자열 파싱과 포맷팅

---

- 참고: https://docs.oracle.com/javase/8/docs/api/

```java
// 예시 코드

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 9, 22, 12, 30, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String result = ldt.format(formatter);
        System.out.println(result); // 2024년 09월 22일 12시 30분 00초
    }
}
```