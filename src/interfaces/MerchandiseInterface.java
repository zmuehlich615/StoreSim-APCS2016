package interfaces;
public interface MerchandiseInterface {
	/**
	 * Set the cost of the item to the customer
	 */
	void setCost(double cost);

	/**
	 * Get the cost of the item to the customer
	 * 
	 * @return int value cost
	 */
	double getCost();

	/**
	 * Temporarily change the cost of the item to the customer
	 */
	void changeCost(double cost, int time);

	/**
	 * Set the cost of the item to the store
	 */
	void setStoreCost(double cost);

	/**
	 * Get the cost of the item to the store
	 * 
	 * @return int value storeCost
	 */
	double getStoreCost();

	/**
	 * Change the cost of the item to the store
	 */
	void changeStoreCost(double cost, int time);

	/**
	 * Set the date the item will expire based on day from now.
	 */
	void setExpiration(int days);

	/**
	 * Get the date the item will expire
	 * 
	 * @return int item expiration
	 */
	int getExpiration();

	/**
	 * Set the level of desirability of an item 0 = Low, 2 = High
	 */
	void setDesirability(int desirability);

	/**
	 * Get the level of desirability of an item 0 = Low, 2 = High
	 * 
	 * @return int value desirability
	 */
	int getDesirability();

	/**
	 * Set the name of an item
	 */
	void setName(String name);

	/**
	 * Get the name of an item
	 * 
	 * @return String item name
	 */
	String getName();

	/**
	 * Set the amount of stock you have of an item
	 */
	void setQuantity(int quantity);

	/**
	 * Get the amount of stock you have of an item
	 * 
	 * @return int item quantity
	 */
	int getQuantity();
}