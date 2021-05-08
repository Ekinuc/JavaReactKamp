package javaOdev4.bussines.abstracts;

import java.util.List;

import javaOdev4.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	void verifyUser(int id);
	User get(int id);
	User getByEmail(String email);
	User getByEmailAndPassword(String email,String Password);
	List<User> getAll();
}
