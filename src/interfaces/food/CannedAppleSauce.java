package interfaces.food;

public class CannedAppleSauce extends Food{
	public CannedAppleSauce() {
		setName("Canned Apple Sauce");
		setCost(.7);
		setStoreCost(.2);
		setExpiration(365);
		setDesirability(0);
		setQuantity(100);
	}
}