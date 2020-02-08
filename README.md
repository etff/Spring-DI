# Spring DI

## branch
* feature-field
* feature-setter
* feature-constructor

### field injection

* @Autowired로 주입이 간결함
* 주입은 간결하지만 not referenced한 방식
R1. @Component가 mutable 하기 때문에 NullPointerException으로 부터 안전하지 않음
R2. Runtime에서 순환참조 문제로 예기치 않은 StackOverFlowError가 발생
R3. 의존성이 숨기 때문에 테스트시 의존 관계를 가지는 객체를 생성해 주입할 수 없다 