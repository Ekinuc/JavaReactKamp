package Abstract;
import Entities.Gamer;

public interface EdevletService {
	void verify(Gamer gamer);
	void verifyName(Gamer gamer);
	void verifyLastName(Gamer gamer);
	void verifyTc(Gamer gamer);
	void verifyYearOfBirth(Gamer gamer);
}
