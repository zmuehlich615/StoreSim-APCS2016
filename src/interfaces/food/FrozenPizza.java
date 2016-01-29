package interfaces.food;

public class FrozenPizza extends Food {
	public FrozenPizza() {
		setName("Frozen Pizza");
		setCost(4.00);
		setStoreCost(2.00);
		setQuantity(15);
		setExpiration(30);
		setDesirability(3);
	}
}