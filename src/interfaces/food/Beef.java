package interfaces.food;

public class Beef extends Food {
	public Beef() {
		setDesirability(2);
		setExpiration(14);
		setName("Beef");
		setCost(3.99);
		setStoreCost(1.50);
		setQuantity(50);
	}
}