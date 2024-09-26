# HTTP 

## 1. Content-Type 헤더 종류

---

- Content-Type 헤더 종류

  - application/json : TEXT, XML, JSON 데이터 전송 시 사용
  - application/x-www-form-urlencoded : Form의 내용을 HTTP 메시지 바디를 통해 전송
  - multipart/form-data : 파일 업로드와 같은 바이너리 데이터 전송 시 사용

## 2. HTTP API 설계(URI 설계)

---

- 문서(document)

  - 단일 개념(파일 하나, 객체 인스턴스, 데이터베이스 row)


- 컬렉션(collection)

  - 서버가 관리하는 리소스 디렉터리
  - 서버가 리소스의 URI를 생성하고 관리


- 스토어(store)

  - 클라이언트가 관리하는 자원 저장소
  - 클라이언트가 리소스 URI를 알고 관리


- 컨트롤러(controller), 컨트롤 URI

  - 문서, 컬렉션, 스토어로 해결하기 어려운 추가 프로세스 실행
  - 동사를 직접 사용(edit / delete / create ...)