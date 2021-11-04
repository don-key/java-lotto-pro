# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


# 1단계 - 학습 테스트 실습
1. String 클래스에 대한 학습 테스트
2. Set Collection에 대한 학습 테스트

### 요구사항 1
- [x] "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
- [x] "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
### 요구사항 2
- [x] "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
### 요구사항 3
- [x] "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
- [x] String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
- [x] JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.

# 2단계 - 문자열 덧셈 계산기
1. 문자열 덧셈 계산기를 통한 TDD/리팩토링 실습

### 기능 요구사항
- [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
  - [x] 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다. (예 : “” => 0, null => 0)
  - [x] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다. (예 : “1”)
  - [x] 숫자 두개를 쉼표(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : “1,2”)
  - [x] 구분자를 쉼표(,) 이외에 콜론(:)을 사용할 수 있다. (예 : “1,2:3” => 6)
- [x] 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- [x] 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
  - [x] 숫자 이외의 값을 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “#$,@,##”)
  - [x] 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3”)

# 3단계 - 로또(자동)

1. 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
2. 로또 1장의 가격은 1000원이다.

### 기능 요구사항 
- [x] 로또를 구매한다. 
  - [x] 구입 금액을 입력한다.
  - [x] 로또를 구매한다. (1장에 1000)
- [ ] 로또를 발급한다.
  - [x] 1 ~ 45 사이의 6개의 숫자를 자동으로 생성한다.
  - [x] 로또 번호를 오름차순 정렬한다.
  - [ ] 로또 번호를 확인한다.
  - [ ] 로또를 여러장 관리한다.
- [ ] 당첨 번호를 입력한다.
  - [ ] 중복없는 6개의 번호를 입력한다.
- [ ] 당첨 결과를 확인한다.
  - [ ] 당첨 된 번호를 확인한다. (각각의 로또 번호와 당첨 번호 일치 확인)
  - [ ] 총 수익률을 계산한다.
- [ ] 당첨 통계를 출력한다.


### 실행 결과
```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```