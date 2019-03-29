package org.sijin.jdbc.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap02.xml");
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g1.greet());
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g2.greet());
		System.out.println(g1 == g2);
		ctx.close();
	}
}