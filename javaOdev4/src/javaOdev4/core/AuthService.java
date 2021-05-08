package javaOdev4.core;

public interface AuthService {
	void register(int id,String email, String password,String firstname,String lastName);
	void login(String email,String password);
}
