package interfaces.food;
import interfaces.MerchandiseInterface;

public abstract class Food implements MerchandiseInterface {
	protected String name;
	protected double cost;
	protected double oldCost;
	protected double storeCost;
	protected double oldStoreCost;
	protected int tempCostTime;
	protected int tempStoreCostTime;
	protected int expiration;
	protected int desirability;
	protected int quantity;
	protected boolean expired = false;

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public void changeCost(double cost, int time) {
		oldCost = this.cost;
		this.cost = cost;
		tempCostTime = time;
	}

	public void setStoreCost(double cost) {
		storeCost = cost;
	}

	public double getStoreCost() {
		return storeCost;
	}

	public void changeStoreCost(double cost, int time) {
		oldStoreCost = storeCost;
		storeCost = cost;
		tempStoreCostTime = time;
	}
	
	public void setExpiration(int days) {
		 //TODO Create a time system first
		expiration = days /*+ currentTime*/;
	}

	public int getExpiration() {
		return expiration;
	}

	public void setDesirability(int desirability) {
		if(desirability >= 0 || desirability <= 2) {
			this.desirability = desirability;
		} else {
			System.out.println("Invalid Desirability on " + name);
		}
	}

	public int getDesirability() {
		return desirability;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

}
