# 게시판 만들기
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
댓글은 읽기 화면상에서 별도의 화면 이동없이 처리하기 때문에 Ajax를 이용해서 출력합니다. 댓글에 대한 모든 처리는 모달창을 이용합니다. 댓글 개수가 10개가 넘으면 다음 페이지로 출력됩니다.
![Alt text](./md_resources/reply.PNG)
![Alt text](./md_resources/replymodify.PNG)
![Alt text](./md_resources/replypage.PNG)
## 로그인 / 로그아웃
게시글 읽기는 자유롭게 할 수 있으나 글쓰기 기능은 로그인해서 사용 가능합니다. 우측 바에서 로그인을 클릭하면 별도의 로그인 페이지에서 로그인 할 수 있습니다. 로그인후 우측 바가 로그아웃으로 변경되며 클릭시 로그아웃 됩니다.
![Alt text](./md_resources/login2.PNG)
![Alt text](./md_resources/login.PNG)
![Alt text](./md_resources/logout.PNG)
