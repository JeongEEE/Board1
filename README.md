# 게시판 만들기
- 단순히 게시판을 만들기 보다 사용자에게 보여지는 부분(Front-End)이 서버, DB부분(Back-End)과 어떻게 상호작용을 하는지 이해하는데 중점을 두고 진행하였습니다. 스프링 프레임워크를 선택한 이유는 다양한 기능을 제공하고 개발속도가 빠르며 유지보수가 쉽고 가장 많이 사용되는 프레임워크 입니다.
## 목표
- Back-End 에 대한 이해
- 웹의 가장 기본인 게시판 구현해보기
- 등록, 읽기, 수정, 삭제, 파일업로드, 댓글처리, 로그인/로그아웃 기능 구현
## 개발 환경
- Eclipse
- Bootstrap 4
- Spring 5.0.7 & Maven 2.9
- JDK 1.8
- Oracle Database 11g Express Edition
- MyBatis 3.4.6
- Tomcat 9
## 개발 기간 - 2019/07/01 ~ 08/14
## 게시판 패키지 구조
![JavaMain](./md_resources/c1.PNG)
web.xml로 모든 서블릿과 필터들을 정의합니다. 메이븐은 pom.xml을 통해 각종 필요한 라이브러리를 자동으로 다운받고 관리합니다. root-context.xml은 JSP와 관련이 없는 객체(bean)을 설정합니다.
## 메서드 처리과정
요청 > 컨트롤러 > 서비스 > MyBatis > DB > 컨트롤러(DB 반환)
## 데이터베이스
![DB](./md_resources/d1.PNG)
## 게시글 읽기
게시판 목록 list는 BoardController의 list() 메서드를 이용해서 데이터베이스 테이블 tb1_board에
있는 데이터를 출력합니다. 게시글에 댓글 개수가 표시됩니다. 
![Alt text](./md_resources/board.PNG)
게시글 읽기는 모든 데이터를 readonly로 출력합니다. 게시글의 작성자가 아니면 수정버튼이 보이지 않습니다.
![Alt text](./md_resources/read.PNG)
## 검색
검색은 단일 항목과 다중 항목 검색이 가능합니다.
![Alt text](./md_resources/search.PNG)
![Alt text](./md_resources/search2.PNG)
## 게시글 목록 페이지 처리
게시글 목록은 10개가 넘어가면 다음페이지에 출력됩니다. 현재 페이지 번호에 이벤트 처리를 해줍니다.
![Alt text](./md_resources/page.PNG)
## 게시글 등록
작성자는 로그인한 사용자로 고정되고 파일업로드를 할수 있습니다.
![Alt text](./md_resources/register.PNG)
## 게시글 수정, 삭제
게시글을 작성한 작성자가 수정을 눌러 수정 페이지에서 게시글을 수정, 삭제 할 수 있습니다.
![Alt text](./md_resources/modify.PNG)
## 파일 업로드
게시글 등록시 파일업로드 하면 아래와 같이 게시글 읽기 화면에 출력됩니다.
![Alt text](./md_resources/file.PNG)
## 게시글 댓글, 댓글 수정, 댓글 페이지 처리
댓글은 읽기 화면상에서 별도의 화면 이동없이 처리하기 때문에 Ajax를 이용해서 출력합니다. 댓글에 대한 모든 처리는 모달창을 이용합니다. 댓글 개수가 10개가 넘으면 다음 페이지로 출력됩니다. Ajax로 댓글처리를 하면 게시글 읽기 HTML화면 페이지 갱신 없이 데이터 처리가 가능합니다. 속도가 빠르고 실시간 상호작용이 가능한 장점이 있습니다.
![Alt text](./md_resources/reply.PNG)
![Alt text](./md_resources/replymodify.PNG)
![Alt text](./md_resources/replypage.PNG)
## 로그인 / 로그아웃
게시글 읽기는 자유롭게 할 수 있으나 글쓰기 기능은 로그인해서 사용 가능합니다. 우측 바에서 로그인을 클릭하면 별도의 로그인 페이지에서 로그인 할 수 있습니다. 로그인후 우측 바가 로그아웃으로 변경되며 클릭시 로그아웃 됩니다.
![Alt text](./md_resources/login2.PNG)
![Alt text](./md_resources/login.PNG)
![Alt text](./md_resources/logout.PNG)
