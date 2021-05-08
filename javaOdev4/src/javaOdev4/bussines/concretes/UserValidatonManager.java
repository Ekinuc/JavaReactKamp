package javaOdev4.bussines.concretes;

import java.util.regex.Pattern;

import javaOdev4.bussines.abstracts.UserValidationService;
import javaOdev4.dataAccess.concretes.UserInMemoryDao;
import javaOdev4.entities.concretes.User;

public class UserValidatonManager implements UserValidationService{

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		    
	
	@Override
	public boolean validate(User user) {
		boolean result = isAllFieldsFilled(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword()) &&
			isEmailFormatValid(user.getEmail());
		if (result == true) {
			UserInMemoryDao userInMemoryDao = new UserInMemoryDao();
			userInMemoryDao.add(user);
		}
				
		return result;
		
		
		        
	}

	private boolean isEmailFormatValid(String email) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(email).find();
	}
	
	private boolean isPasswordLengthValid(String password) {
		if(password.length() > 6) {
			System.out.println("Parola Geçerli");
			return true;
		}else {
			System.out.println("Parola 6 karakter üzeri olmasý gerekiyor");
			return false;
		 }
	}
	private boolean isFirstNameLengthValid(String firstName) {
		return firstName.length() > 2;
	}
	private boolean isLastNameLengthValid(String lastName) {
		return lastName.length() > 2;
	}
	private boolean isAllFieldsFilled(String firstName,String lastName,String email, String password) {
		if(firstName.length() <= 0 || lastName.length() <= 0 || email.length() <= 0 || password.length() <= 0) {
			return false;
		}return true;
	}
}


