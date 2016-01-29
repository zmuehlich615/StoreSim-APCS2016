package org.millardps.StoreSim;

import interfaces.food.Food;


public class Beef extends Food{
	public Beef(){
		setDesirability(2);
		setExpiration(14);
		setName("Beef");
		setCost(3.99);
		setStoreCost(1.50);
		setQuantity(50);
		}
}

//