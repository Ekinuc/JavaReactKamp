package javaOdev4.bussines.concretes;

import javaOdev4.bussines.abstracts.EmailService;
import javaOdev4.entities.concretes.User;

public class EmailManager implements EmailService {


	@Override
	public void send(String message, String to) {
		System.out.println("E-posta Manager : " + message + " mesajý " + to + " adresine gönderildi.");		
	}
}