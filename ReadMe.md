# Su-tudy의 과제 ReadMe 🚀

- 수정은 언제든지 좋으니 스터디원분들이 원하시는 만큼 수정해주세요.

### 💡 과제를 하기 전 아래와 같이 해주세요.
1. 과제에 해당하는 프로젝트를 git clone 해주세요.
2. 브랜치를 따서 push 후 진행하시면 됩니다.
3. 커밋은 자신의 브랜치에 원하는데로 진행하시면 됩니다.
4. 과제의 기간은 다음 세션 전 까지입니다.
5. 서로 모르는 부분은 git에 있는 ISSUE를 사용해주세요.


# Su-tudy 2회차 - 타임리프

2022년 6월 1일

참여자 : 김동열, 박현서, 윤성철, 조정빈

2회차 리더 : 박현서

## 2회차 과제  🎉

아래와 같이 만들어주세요.

**요구사항**
- 템플릿 레이아웃, 템플릿 조각을 이용해주세요.
  - 여러 방법이 있으나 최소 html 2개 이상의 파일로 구현해주세요.
- css/myCss.css 파일을 이용해 테이블 글 색상을 변경해주세요.
  - 이 때 `th:classappend`를 이용해주세요.
- `postList` 값으로 다음과 같이 넘어왔습니다.
  - `username`, `title`, `content`
  - 테이블 중에 title이 `안녕하세요2`인 부분을 if문을 사용해 제거하여 주세요.
<img src="./images/2_assignment_view.png">

---

<br>
<br>
<br>
<br>

# Su-tudy 4회차 - HttpServlet

2022년 6월 22일

참여자 : 김동열, 박현서, 윤성철, 조정빈 

4회차 리더 : 박현서

## 4회차 과제  🎉

아래와 같이 만들어주세요.

**요구사항**
- Query String 혹은 form으로 이름, 나이를 받습니다.
- HttpServlet를 상속 받아 회원가입을 진행시켜주세요.
- GenericServlet를 상속받아 회원가입을 진행시켜주세요.
- 회원가입에 필요한 항목은 이름, 나이 입니다.
- 회원가입 성공은 콘솔에 이름, 나이 출력 유무로 구분합니다.

<br>

아래는 콘솔 출력값 입니다.
```
회원 가입이 되었습니다.
회원 이름 : 홍길동
회원 나이 : 20
```
# Su-tudy 5회차 - HttpServlet2

2022년 6월 29일

참여자 : 김동열, 박현서, 윤성철, 조정빈 

5회차 발표자 : 신지민

## 5회차 과제  🎉

아래와 같이 만들어주세요.

**요구사항**
- basic패키지에 있는 lombok_test를 lombok형식으로 맞춰 코드를 간결하게 만들어주세요!!
<br>

아래는 콘솔 출력값 입니다.
```
package gdsc.syu.study.thymeleaf.basic;

public class lombok_test {
    private String username;
    private String userDept;
    private int userID;
    public String getUsername(){
        return username;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public int getUserID() {
        return userID;
    }
}


```
