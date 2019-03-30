package org.sijin.book.chap3;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("feeldyd2@gmail.com");
		req.setPassword("xxxx");
		req.setName("feeldyd2");

		// 회원 등록
		regService.regist(req);
	}
}