public abstract class Food implements MerchandiseInterface {
	protected int cost;
	protected int storeCost;
	protected int expiration;
	protected int desirability;

	
	public int getCost() {
		return cost;
	}

	
	public int getStoreCost() {
		return storeCost;
	}

	
	public int getExpiration() {
		return expiration;
	}

	
	public void setDesirability(int d) {
		desirability = d;
	}

	
	public int getDesirability() {
		return desirability;
	}

	
	public void setName() {
		// TODO Auto-generated method stub

	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setQuantity() {
		// TODO Auto-generated method stub

	}

	
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}
}
