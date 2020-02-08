# Spring DI

## branch
* feature-field
* feature-setter
* feature-constructor

### constructor injection

* pivotal에서 권장하는 DI 방식
* 생성자 주입을 통한 순환참조를 방지
* final을 이용하여 Immutalble한 객체를 생성할 수 있음
* field와 달리 의존성이 추가될 때마다 파라미터를 추가해 주어야 하는데 롬복을 이용하면 이러한 번거로움이 해결됨 
* 테스트 코드 작성이 용