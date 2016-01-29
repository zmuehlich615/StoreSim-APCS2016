package interfaces.food;

public class Coffee extends Food {
	public Coffee() {
		setName("Coffee");
		setCost(2.50);
		setStoreCost(5.00);
		setQuantity(12);
		setExpiration(360);
		setDesirability(2);
	}
}