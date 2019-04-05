package org.sijin.book.chap3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingSpring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);

		RegisterRequest req = new RegisterRequest();
		req.setEmail("feeldyd2@gmail.com");
		req.setPassword("xxxx");
		req.setName("feeldyd2");

		regService.regist(req);
	}
}