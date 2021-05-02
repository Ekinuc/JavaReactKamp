package Concrete;
import Abstract.EdevletService;
import Entities.Gamer;

public class EdevletManager implements EdevletService{

	@Override
	public void verifyName(Gamer gamer) {
		System.out.println("("+gamer.getFirstName()+")" + " first name verifyed.");
		
	}

	@Override
	public void verifyLastName(Gamer gamer) {
		System.out.println("("+gamer.getLastName()+")" + " last name verifyed");
		
	}

	@Override
	public void verifyTc(Gamer gamer) {
		System.out.println("("+gamer.getTcNo()+")" + " Tc verifyed");
		
	}

	@Override
	public void verifyYearOfBirth(Gamer gamer) {
		System.out.println("("+ gamer.getYearOfBirth()+")" + " year of birth verifyed");
		
	}

	@Override
	public void verify(Gamer gamer) {
		verifyName(gamer);
		verifyLastName(gamer);
		verifyTc(gamer);
		verifyYearOfBirth(gamer);
	}

}
