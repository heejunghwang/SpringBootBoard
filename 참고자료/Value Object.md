* 참조객체(reference object)의 경우 문제점 - 시스템이 복잡해질 수록 디버깅 힘들어짐 (별칭문제)
- new Instance로 바꾸어주면 문제가 생겨지지 않는다.
- 사용하지 않는 객체의 경우, gc에 의해서 알아서 제거됨
- reference object->value object로 변환

* Value Object
https://dzone.com/articles/martin-fowler-examines-value-objects?edition=240483&utm_source=Daily%20Digest&utm_medium=email&utm_campaign=dd%202016-11-15

* 참조 문제
http://martinfowler.com/bliki/AliasingBug.html