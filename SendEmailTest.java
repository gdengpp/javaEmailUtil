package com.email.demo;

import org.junit.Test;

public class SendEmailTest {

	@Test
	public void sendmail(){
		String[] u ={"571114843@qq.com"};
		String[] p = {"glpsdpp@163.com"};
		String email = SendEmailUtil.sendEmail("����һ���ʼ���ͷ", "�����ʼ��Ƿ��Ѿ�����ȥ��", "1047267211@qq.com", "hnyotsbdnaiubahf", u, p, null, null);
		System.out.println(email);
	}
}
