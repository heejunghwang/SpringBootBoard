# Private Method 테스트 방법
- 스프링 프레임워크에서는 invoke method를 사용하여 테스트할 수 있음
- 메소드 : ReflectionTestUtils.invokeMethod()
- 사용법 : ReflectionTestUtils.invokeMethod(TestClazz, "createTest", "input data");
- 참고 링크 : http://stackoverflow.com/questions/34571/how-to-test-a-class-that-has-private-methods-fields-or-inner-classes

# Given When Then
- 테스트를 표시하는 스타일
- given : 어떤 시나리오를 하기 전에 하는 행동. 테스트의 사전 조건
- when : 명시한 행동
- then : 명시한 행동에 대한 결과
- 참고 링크 : http://martinfowler.com/bliki/GivenWhenThen.html