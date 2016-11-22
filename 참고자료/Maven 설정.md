# dependency 설정
1. Spring Boot Web Starter 설정
  * Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container
  * RESTful을 포함한 웹을 만들고, Spring MVC를 사용하는 어플리케이션을 만들기 위한 Starter. 기본 내장 Container로 Tomcat 사용
   ~~~
   <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
    ~~~

2. JPA 설정
  * Starter for using Spring Data JPA with Hibernate
  * Hibernate와 함께 Spring Data JPA를 사용하기 위한 Starter
   ~~~
    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
    ~~~

3. Spring Boot Developer Tools
  * 민감한 속성 기본(예를 들어 템플릿 캐시를 비활성화), 애플리케이션 자동 재시작, LiveReload 지원, 원격 개발 지원, 재시작 동안 HTTP session 영속화 등-->
  * 참고자료 : https://www.youtube.com/watch?v=A70NMxV13TI
  
    ~~~
  	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<optional>true</optional>
		</dependency>
    ~~~
    
    
4.  Spring Boot Test Starter
  * Starter for testing Spring Boot applications with libraries including JUnit, Hamcrest and Mockito
  
    ~~~
    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
    ~~~
    
5. lombok 설정
    ~~~
    <dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
		</dependency>
    ~~~
    
6. log 설정
  ~~~
    <dependency>
			<groupId>net.chandol</groupId>
			<artifactId>logjdbc</artifactId>
			<version>0.1.3</version>
		</dependency>
  ~~~

7. h2 설정
  ~~~
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
  ~~~


# 플러그인 설정
1. Spring Boot Maven plugin
  * It allows you to package executable jar or war archives and run an application “in-place”.
  * 실행가능한 jar나 war 파일 만들어 줌
  ~~~
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <configuration>
                <fork>true</fork>
            </configuration>
        </plugin>
  ~~~
  
  # Maven Scope
  - **compile** : 기본 scope이다. 만약 dependency에 아무것도 입력하지 않았다면 기본적으로 입력되는 scope이다. 이 옵션은 프로젝트의 모든 classpath에 추가된다(테스트 중이건 런타임 중이건 상관없이).
  - **provided** : 이 옵션은 compile과 매우 비슷하지만, 실행시 의존관계를 제공하는 JDK나 Web Container(tomcat 같은)에 대해서 적용된다.  예를 들어 Java Enterprise Edition Web application을 개발할때 Servlet API나 Java EE API들은 "provided" scope로 지정해야한다. 왜냐하면 Servlet API같은 경우는 Servlet Container 자체에서 지원해 주기 때문에(Tomcat 같은 경우는 ${tomcat home directory}/lib 디렉토리에 있는 Servlet 라이브러리를 사용) 컴파일시 또는 테스트시에는 필요하지만 실행시에는 필요하지 않기 때문이다.
  - **runtime** : 컴파일 시에는 필요하지 않지만 실행시에 사용되는 경우 사용한다. 이 옵션은 런타임, 테스트 시 classpath에 추가 되지만, 컴파일시에는 추가 되지 않는다.
  - **test** : 일반적인 경우에는 필요하지 않고 테스트시에만 필요한 경우 사용한다.
  - **system** : 해당 jar를 포함해야 한다고 명시적으로 입력 하는 것을 제외하고는 provided와 유사하다. 선언된 artifact들은 항상 사용가능하지만 Maven의 central repository에서 찾아서 가져오는 것은 아니다.
  - **import** : Maven 2.0.9 이상의 버전에서 지원하는 scope로서, 이 scope는 <dependencyManagement> 섹션에서 pom의 의존관계에 대해 사용된다. 지정된 pom이 해당 pom의 <dependencyManagement> 영역에 있는 의존관계로 대체됨을 뜻한다.
