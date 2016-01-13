
public interface MerchandiseInterface {
	
	/**
	 * Get the cost of the item to the customer
	 * @return int value cost
	 */
	int getCost();
	
	/**
	 * Change the cost of the item to the customer
	 */
	void changeCost(int cost);
	
	/**
	 * Get the cost of the item to the store
	 * @return int value storeCost
	 */
	int getStoreCost();
	
	/**
	 * Change the cost of the item to the store
	 */
	void changeStoreCost(int cost);
	
	/**
	 * Get the date the item will expire
	 * @return int item expiration
	 */
	int getExpiration();
	
	/**
	 * Set the level of desirability of an item
	 * 0 = Low, 2 = High
	 */
	void setDesirability(int desirability);
	
	/**
	 * Get the level of desirability of an item
	 * 0 = Low, 2 = High
	 * @return int value desirability
	 */
	int getDesirability();
	
	/**
	 * Set the name of an item
	 */
	void setName(String name);
	
	/**
	 * Get the name of an item
	 * @return String item name
	 */
	String getName();
	
	/**
	 * Set the amount of stock you have of an item
	 */
	void setQuantity(int quantity);
	
	/**
	 * Get the amount of stock you have of an item
	 * @return int item quantity
	 */
	int getQuantity();
}