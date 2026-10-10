# IT_review_site

하드웨어·소프트웨어 리뷰와 자유 게시판을 제공하는 Java/Spring MVC 웹 프로젝트의 구현 기록입니다.

## 프로젝트 살펴보기

- [spring-project](spring-project): Maven WAR 웹 프로젝트
- [pom.xml](spring-project/pom.xml): 빌드와 라이브러리 설정
- [src/main](spring-project/src/main): Java 코드·리소스·웹 화면
- [sqldeveloper](sqldeveloper): 데이터베이스 관련 자료

Eclipse에서 `spring-project`를 가져와 기존 Tomcat·Oracle 환경에 맞춰 설정합니다. 아래 기능과 설계 선택은 개발 당시 기록입니다.

## 개발환경 
- 개발언어 : Java
- 프레임워크 : Spring
- Was : Tomcat
- DBMS : Oracle
- IDE : Eclipse EE

## 사이트 기능
- 하드웨어, 소프트웨어, 자유, 기타 게시판
- 로그인, 회원가입
- 댓글, 조회수, 추천기능


## DB
- 게시판마다 다른 테이블에 저장
- Table에서 카테고리를 설정해도 되지만 개발당시 빠른 개발을 위해서 나누어서 저장하였다
- 다시 만든다면 테이블에 카테고리 컬럼을 주어서 나누도록 만들면 더 깔끔할것 같다.




