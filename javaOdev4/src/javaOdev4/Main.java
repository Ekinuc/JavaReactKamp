package javaOdev4;

import javaOdev4.bussines.abstracts.UserService;
import javaOdev4.bussines.concretes.AuthManager;
import javaOdev4.bussines.concretes.EmailManager;
import javaOdev4.bussines.concretes.UserManager;
import javaOdev4.bussines.concretes.UserValidatonManager;
import javaOdev4.core.AuthService;
import javaOdev4.core.GoogleAuthManagerAdapter;
import javaOdev4.core.Utils.BussinesRules;
import javaOdev4.dataAccess.concretes.UserInMemoryDao;
import javaOdev4.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new UserInMemoryDao());
		AuthService authService = new AuthManager(userService, new UserValidatonManager(), new EmailManager());
		authService.register(1, "ekinucc2004@gmail.com", "123456789", "Ekin", "Uç");
		authService.login("ekinucc2004@gmail.com", "123456789");
		authService.register(2, "ekinucc2004gmail.com", "123456789", "Ekin", "Uç");//Bu email ile Başka bir üye mevcut
		
		
		
		AuthService googleAuthService = new GoogleAuthManagerAdapter();
		googleAuthService.register(6, "drksmy26@gmail.com", "1567ekin5215", "Ekin", "Uç");
		googleAuthService.login("drksmy26@gmail.com", "1567ekin5215");
		
		

	}

}
