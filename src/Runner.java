import interfaces.food.CannedAppleSauce;
import interfaces.food.CannedApples;
import interfaces.food.Food;

public class Runner {

	static CannedApples ca = new CannedApples();
	static CannedAppleSauce cas = new CannedAppleSauce();

	static Food list[] = { ca, cas };

	public static void main(String[] args) {

		for (Food f : list) {
			System.out.println("Name: " + f.getName());
			System.out.println("Cost: " + f.getCost());
			System.out.println("Quantity: " + f.getQuantity());
			System.out.println("Expiration: " + f.getExpiration());
			System.out.println("\n\n");
		}

	}
}
