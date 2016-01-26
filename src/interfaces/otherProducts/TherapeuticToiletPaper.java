package interfaces.otherProducts;
import interfaces.food.Food;

//////TALK TO SKYLAR\\\\\\

public class TherapeuticToiletPaper extends Food{
	public TherapeuticToiletPaper() {
		setName("Therapeutic Toilet Paper");
		setCost(1.0);
		setStoreCost(.5);
		setExpiration(3);
		setDesirability(3);
		setQuantity(100);
	}
}