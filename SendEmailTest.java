package com.email.demo;

import org.junit.Test;

public class SendEmailTest {

	@Test
	public void sendmail(){
		String[] u ={"571114843@qq.com"};
		String[] p = {"glpsdpp@163.com"};
		String email = SendEmailUtil.sendEmail("这是一封邮件的头", "测试邮件是否已经发出去了", "1047267211@qq.com", "hnyotsbdnaiubahf", u, p, null, null);
		System.out.println(email);
	}
}
