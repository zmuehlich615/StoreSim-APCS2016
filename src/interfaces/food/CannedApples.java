package interfaces.food;

public class CannedApples extends Food{
	public CannedApples() {
		setName("Canned Apples");
		setCost(.5);
		setStoreCost(.1);
		setExpiration(365);
		setDesirability(0);
		setQuantity(100);
	}
}