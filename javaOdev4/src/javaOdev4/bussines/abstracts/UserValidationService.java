package javaOdev4.bussines.abstracts;

import javaOdev4.entities.concretes.User;

public interface UserValidationService {
	boolean validate(User user);
}
