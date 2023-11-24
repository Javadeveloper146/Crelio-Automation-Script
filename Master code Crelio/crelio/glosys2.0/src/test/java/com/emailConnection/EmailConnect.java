package com.emailConnection;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailConnect {

	public void emailIntegration() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");

		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("javadeveloper@stemzglobal.com", "Joy@47092%"));
		email.setSSLOnConnect(true);
		email.setFrom("javadeveloper@stemzglobal.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("javadeveloper@stemzglobal.com");
		email.send();
	}
}
