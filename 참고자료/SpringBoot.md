# Spring initialize 사용
https://www.jetbrains.com/help/idea/2016.2/creating-spring-boot-projects.html

# 참고 자료
- Spring Boot Reference
- Youtube 토비 스프링 강의 : https://www.youtube.com/user/tobyilminlee
- 블로그 자료
http://agile.egloos.com/4834009

# Spring Boot Annotation

# 스프링 부트스트랩핑
- @SpringBootApplication : 스프링 컨포넌트 검색과 스프링 부트 자동 구성을 활성화, 이 어노테이션은 유용한 어노테이션 3개를 묶음
- @Configuration : 어노테이션이 붙은 클래스를 스프링 자바 기반 구성 클래스로 지정
- @ComponentScan : 컴포넌트 검색 기능을 활성화 해서 웹 컨트롤러 클래스나 다른 컴포넌트 클래스들을 자동으로 검색하여, 스프링 어플리케이션 컨텍스트에 빈을 등록
- @EnableAutoConfiguration : 스프링 부트 자동 구성이 됨
- 스프링 부트는 복잡한 프로젝트 의존성을 '스타터(starter) 의존성 수십개로 해결함.

# 스프링 부트 어플리케이션 테스트
- 일반적인 스프링 통합 테스트 : @ContextConfiguration 어노테이션 사용
- 스프링부트 : @SpringApplicationConfiguration 사용

# 어플리케이션 프로퍼티 구성
- application.properties 파일
- 없어도 어플리케이션의 영향은 없음
- 예) server.port = 8000 //내장 톰캣 서버 8000번으로 변경
- application.properties 를 로드 하라고 스프링 부트에 명시적으로 요청할 필요가 없음, 스프링 부트가 자동적으로 파일을 로드하고 그 안에든 프로퍼티를 스프링과 애플리케이션 코드를 구성하는데 사용할 수 있게함.


