package SimplePizza;

public class DeluxPizza extends pizza{
	DeluxPizza(boolean veg){
		super(veg);
		if(veg) {
			this.price=550;
		}
		else {
			this.price=650;
		}
		this.basePizzaPrice=this.price;
		this.isExtraCheeseAdded=true;
		this.isExtraToppingsAdded=true;
	}
	public void addExtraCheese() {
		
	}
	public void addExtraToppings() {
	}
	public void basePizzaPrice() {
		
		
	}
}
