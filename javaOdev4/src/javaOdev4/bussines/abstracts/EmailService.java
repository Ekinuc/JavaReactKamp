package javaOdev4.bussines.abstracts;

import javaOdev4.entities.concretes.User;

public interface EmailService {
	void send(String message,String to);
}
