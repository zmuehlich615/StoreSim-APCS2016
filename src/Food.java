public abstract class Food implements MerchandiseInterface {
	protected String name;
	protected double cost;
	protected double oldCost;
	protected double storeCost;
	protected int tempCostTime;
	protected int expiration;
	protected int desirability;
	protected int quantity;
	protected boolean expired = false;

	public void setCost(double c) {
		cost = c;
	}

	public double getCost() {
		return cost;
	}

	public void changeCost(double c, int t) {
		oldCost = cost;
		cost = c;
		tempCostTime = t;
	}

	public void setStoreCost(double c) {
		storeCost = c;
	}

	public double getStoreCost() {
		return storeCost;
	}
	
	public void setExpiration(int days) {
		 //TODO Create a time system first
		expiration = days /*+ currentTime*/;
	}

	public int getExpiration() {
		return expiration;
	}

	public void setDesirability(int d) {
		if(d >= 0 || d <= 2) {
			desirability = d;
		} else {
			System.out.println("Invalid Desirability on " + name);
		}
	}

	public int getDesirability() {
		return desirability;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setQuantity(int q) {
		quantity = q;
	}

	public int getQuantity() {
		return quantity;
	}

}
