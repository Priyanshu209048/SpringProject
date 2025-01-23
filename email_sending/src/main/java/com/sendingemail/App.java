package com.sendingemail;

import java.io.File;
import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class App {
	public static void main(String[] args) {
		System.out.println("Perpare to send message...");
		String message = "Hello, Thanks for connecting with me!";
		String subject = "Confirmation mail";
		String to = "priyanshubaral1@gmail.com";
		String from = "priyanshubaral9562@gmail.com";

		// sendMessage(message, subject, to, from);
		sendAttachment(message, subject, to, from);

	}

	// This method is used to send attachment...
	private static void sendAttachment(String message, String subject, String to, String from) {

		// Variable for gmail
		String host = "smtp.gmail.com";

		// Get the system properties
		Properties properties = System.getProperties();
		System.out.println("Properties" + properties);

		// Setting Important information to properties object
		// Setting host
		properties.put("mail.smtp.host", host); // It uses mail.smtp.host as a key to get the value
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true"); // It is enabled for security purpose (security socket number)
		properties.put("mail.smtp.auth", "true");

		// Step1: Get the session object...
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("priyanshubaral9562@gmail.com", "vfpa xgug rvfo ziwp");
			}

		});

		session.setDebug(true); // If there is any error then we get the debugging facility

		// Step2: Compose the Message(Text, Multimedia, etc)...
		MimeMessage mimeMessage = new MimeMessage(session);
		/*
		 * MimeMessage represents the common attributes of a MIME message for both sent
		 * and received messages. MIME stands for Multipurpose Internet Mail Extensions.
		 * It's an extension of the Simple Mail Transport Protocol (SMTP) email protocol
		 * that allows users to send different types of data files over email.
		 */

		try {

			mimeMessage.setFrom(from);
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); // 1st is what type type of
																							// message and 2nd is used
																							// to sent the address to
																							// email if there is
																							// multiple address then we
																							// use array of this
																							// address.
			mimeMessage.setSubject(subject);

			// Adding attachment...
			//File Path
			String path = "C:\\Users\\Priyanshu Baral\\OneDrive\\Pictures\\Screenshots\\wall.png";
			
			MimeMultipart mimeMultipart = new MimeMultipart();
			//text
			//file
			MimeBodyPart textMime = new MimeBodyPart();
			MimeBodyPart fileMime = new MimeBodyPart();
			MimeBodyPart messageMime = new MimeBodyPart();
			
			String htmlText = "<H1 style=\"color:blue;\">Hello</H1>";
			
			
			try {
				
				textMime.setText(message);
				
				messageMime.setContent(htmlText, "text/html");
				
				File file = new File(path);
				fileMime.attachFile(file);
				
				mimeMultipart.addBodyPart(textMime);
				mimeMultipart.addBodyPart(fileMime);
				mimeMultipart.addBodyPart(messageMime);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			mimeMessage.setContent(mimeMultipart);

			// Step3: Sent the message using Transport class
			Transport.send(mimeMessage);
			System.out.println("Sent Seccessfully.......");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	// This method is used to send email...
	private static void sendMessage(String message, String subject, String to, String from) {

		// Variable for gmail
		String host = "smtp.gmail.com";

		// Get the system properties
		Properties properties = System.getProperties();
		System.out.println("Properties" + properties);

		// Setting Important information to properties object
		// Setting host
		properties.put("mail.smtp.host", host); // It uses mail.smtp.host as a key to get the value
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true"); // It is enabled for security purpose (security socket number)
		properties.put("mail.smtp.auth", "true");

		// Step1: Get the session object...
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("priyanshubaral9562@gmail.com", "vfpa xgug rvfo ziwp");
			}

		});

		session.setDebug(true); // If there is any error then we get the debugging facility

		// Step2: Compose the Message(Text, Multimedia, etc)...
		MimeMessage mimeMessage = new MimeMessage(session);
		/*
		 * MimeMessage represents the common attributes of a MIME message for both sent
		 * and received messages. MIME stands for Multipurpose Internet Mail Extensions.
		 * It's an extension of the Simple Mail Transport Protocol (SMTP) email protocol
		 * that allows users to send different types of data files over email.
		 */

		try {

			mimeMessage.setFrom(from);
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); // 1st is what type type of
																							// message and 2nd is used
																							// to sent the address to
																							// email if there is
																							// multiple address then we
																							// use array of this
																							// address.
			mimeMessage.setSubject(subject);

			// Adding text to message
			mimeMessage.setText(message);

			// Step3: Sent the message using Transport class
			Transport.send(mimeMessage);
			System.out.println("Sent Seccessfully.......");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
