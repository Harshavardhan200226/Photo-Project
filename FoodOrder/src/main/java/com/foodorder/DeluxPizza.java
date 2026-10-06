package com.foodorder;

public class DeluxPizza extends pizza {

    public DeluxPizza(Boolean veg) {
        super(veg);
        if(veg) {
            this.price = 550;
        } else {
            this.price = 650;
        }
        this.basePizzaPrice = this.price;
        this.isExtraCheeseAdded = true;
        this.isExtraToppingsAdded = true;
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }
}
