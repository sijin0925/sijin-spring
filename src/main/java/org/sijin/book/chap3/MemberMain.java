package org.sijin.book.chap3;

public class MemberMain {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService(memberDao);

		RegisterRequest req = new RegisterRequest();
		req.setEmail("feeldyd2@naver.com");
		req.setPassword("1234");
		req.setName("김시진");

		regService.regist(req);
	}
}