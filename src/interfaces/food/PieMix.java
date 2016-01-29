package interfaces.food;

public class PieMix extends Food {
	public void PieMix() {
		setDesirability(1);
		setCost(2.00);
		setStoreCost(4.00);
		setQuantity(15);
		setExpiration(186);
		setName("Pie Mix");
	}
}