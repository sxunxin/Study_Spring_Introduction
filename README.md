# Spring Introduction

인프런 - 김영한, [스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술](https://www.inflearn.com/course/스프링-입문-스프링부트)

## 학습 목표
실제 동작하는 간단한 웹 애플리케이션을 직접 만들어보면서,
스프링 프로젝트 생성부터 웹 MVC, DB 연동까지 스프링 개발의 전체 흐름을 빠르게 익힌다.
특히 DB 접근 기술은 순수 JDBC → JdbcTemplate → JPA → 스프링 데이터 JPA 순서로
직접 구현하며 각 기술의 차이와 발전 과정을 비교한다.

## 다룬 내용
- 스프링 프로젝트 생성 (Gradle, 프로젝트 구조)
- 스프링 부트로 웹 서버 실행
- 스프링 웹 개발 기초 (정적 컨텐츠, MVC, API, Thymeleaf)
- 회원 도메인 개발 (도메인, 리포지토리, 서비스 계층 설계)
- 스프링 빈과 의존관계 (DI, 컴포넌트 스캔, 자바 코드로 직접 등록)
- 웹 MVC 개발 (회원 등록/조회 화면)
- DB 연동
  - H2 데이터베이스 연동 (파일 모드, 내장 웹 콘솔)
  - 순수 JDBC
  - 스프링 JdbcTemplate
  - JPA (EntityManager)
  - 스프링 데이터 JPA
- 테스트 케이스 작성 (`@SpringBootTest`, `@Transactional`)

## 실행 방법

```bash
./gradlew bootRun
```

- 애플리케이션: `http://localhost:8080`
- H2 콘솔: `http://localhost:8080/h2-console`

## 개발 환경
- Java 17
- Spring Boot 4.1.1
- Gradle (io.spring.dependency-management 1.1.7)
- Thymeleaf
- H2 Database
- GitHub Codespaces (VS Code)

## 트러블슈팅 기록
개발 환경이 로컬이 아닌 GitHub Codespaces라 강의와 다르게 겪은 이슈들을 기록

| 이슈 | 원인 | 해결 |
|---|---|---|
| `redirect:/` 사용 시 localhost로 리다이렉트됨 | Codespaces 프록시 헤더를 스프링이 신뢰하지 않음 | `server.forward-headers-strategy=framework` 추가 |
| H2 웹 콘솔 404 | Spring Boot 4에서 H2 콘솔 자동 설정이 별도 모듈로 분리됨 | `spring-boot-h2console` 의존성 추가 |
| H2 콘솔 접속 시 `webAllowOthers` 에러 | Codespaces 프록시를 거치면 원격 접속으로 인식 | `spring.h2.console.settings.web-allow-others=true` 추가 |
