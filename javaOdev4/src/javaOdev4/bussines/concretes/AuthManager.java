package javaOdev4.bussines.concretes;

import javaOdev4.bussines.abstracts.EmailService;
import javaOdev4.bussines.abstracts.UserService;
import javaOdev4.bussines.abstracts.UserValidationService;
import javaOdev4.core.AuthService;
import javaOdev4.core.Utils.BussinesRules;
import javaOdev4.entities.concretes.User;

public class AuthManager implements AuthService{
	
	UserService userService;
	UserValidationService userValidationService;
	EmailService emailService;
	
	

	public AuthManager(UserService userService, UserValidationService userValidationService,
			EmailService emailService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
		this.emailService = emailService;
	}

	@Override
	public void register(int id, String email, String password, String firstname, String lastName) {
		User userToRegister = new User(id, email, password, firstname, lastName, false);
		if (!userValidationService.validate(userToRegister)) {
			System.out.println("Validate iþlemi baþarýsýz. Lütfen tüm alanlarý girdiðinizden emin olun");
			return;
			
		
		}
		if (!BussinesRules.run(CheckEmail(email))) {
			System.out.println("Kayýt olma iþlemi baþarýsýz. Bu email ile bir baþka üye mevcut.");
			return;
		}
		System.out.println("Baþarýyla kayýt olundu. Üyeliðinizi doðrulamak için lütfen e-posta adresinizi kontrol ediniz.");
		emailService.send("Deneme doðrulama mesajýdýr. Doðrulamak için kodlama.io/........ adresine gidin.", userToRegister.getEmail());
		userToRegister.setVerified(true); 
		userService.add(userToRegister);
	}

	@Override
	public void login(String email, String password) {
		if(!BussinesRules.run(checkIfAllFieldsFilled(email, password))) {
			System.out.println("Giriþ baþarýsýz. Inputlar doðru doldurulmadý.");
			return;
		}
		
		User userToLogin = userService.getByEmailAndPassword(email, password);
		
		if(userToLogin == null) {
			System.out.println("Giriþ baþarýsýz. E-posta adresiniz veya þifreniz yanlýþ.");
			return;
		}
		
		if(!checkIfUserVerified(userToLogin)) {
			System.out.println("Giriþ baþarýsýz. Üyeliðinizi doðrulamadýnýz.");
			return;
		}
		System.out.println("Giriþ baþarýlý. Hoþgeldiniz : " + userToLogin.getFirstName() + " " + userToLogin.getLastName());		
	}
	
	public boolean CheckEmail(String email) {
		return userService.getByEmail(email) ==null;
	}
	private boolean checkIfUserVerified(User user) {
		return user.isVerified();
	}
	private boolean checkIfAllFieldsFilled(String email,String password) {
		if(email.length()<=0 || password.length() <=0) {
			return false;
		}
		return true;
	}

}
