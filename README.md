# Spring DI

## branch
* feature-field
* feature-setter
* feature-constructor

### setter injection

* 수정자 주입 방식
* spring 3.x에서 추천한 방식. 하지만 문제는 있음
  - R1. 낮은 결합도 방식이지만 여전히 runtime에서 NullPointerException이 발생