## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

<hr>

### 0. 학습 테스트 실습

- 요구사항 및 기능 정리: String 클래스
  1. ',' 을 매개변수로 한 split() 메서드를 문자열 "1,2" 에 사용하면 1과 2로 분리된다.
  2. ',' 을 매개변수로 한 split() 메서드를 문자열 "1" 을 에 사용하면 1만 포함하는 배열이 된다.
  3. 문자열 "(1,2)" 에 subString() 메서드를 사용하면 ()가 제거된 "1,2"를 얻을 수 있다.
  4. 문자열 "abc"에 charAt() 메서드를 사용하면 특정 위치의 문자를 찾을 수 있다.
     - 특정 위치의 문자를 찾을 때 위치 값이 문자열이 가진 범위를 벗어나면 StringIndexOutOfBoundsException 예외가 발생한다.
  5. Junit 의 @DisplayName 을 사용해 테스트의 의도를 밝힌다.


- 요구사항 및 기능 정리: Set 컬렉션
  1. size 메서드로 Set 의 크기를 확인한다.
  2. contains 메서드로  1, 2, 3의 값이 존재하는지 확인한다.
  3. Junit 의 ParameterizedTest 를 사용해 중복 코드를 제거한다.
  4. 입력 값에 따라 결과 값이 다른 경우에도 성립하는 테스트를 구현한다.
     - 예를 들어, 입력 값이 1, 2, 3, 4, 5 일 때의 contains 메서드 결과를 하나의 단일 테스트로 만든다.
