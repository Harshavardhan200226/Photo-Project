 package com.foodorder;

	import java.util.Scanner;

	public class pizza {
	    protected int price;
	    private Boolean veg;
	    protected int extraCheesePrice = 100;
	    protected int extraToppingsPrice = 150;
	    protected int backPackPrice = 20;
	    protected int basePizzaPrice; // Fixed naming consistency
	    
	    protected boolean isExtraCheeseAdded = false;
	    protected boolean isExtraToppingsAdded = false;
	    private boolean isOptedForTakeAway = false;
	    
	    Scanner sin = new Scanner(System.in);

	    public pizza(Boolean veg) {
	        this.veg = veg;
	        if (this.veg) {
	            this.price = 300;
	        } else {
	            this.price = 400;
	        }
	        this.basePizzaPrice = this.price;
	    }

	    public void addExtraCheese() {
	        System.out.println("Extra cheese(y/n)? =>");
	        char ch = sin.next().charAt(0);
	        if (ch == 'y') {
	            isExtraCheeseAdded = true;
	            this.price += extraCheesePrice;
	        }
	    }

	    public void addExtraToppings() {
	        System.out.println("Extra toppings(y/n)? =>"); // Fixed prompt text
	        char ch = sin.next().charAt(0);
	        if (ch == 'y') {
	            isExtraToppingsAdded = true;
	            this.price += extraToppingsPrice;
	        }
	    }

	    public void takeAway() {
	        System.out.println("Want TakeAway(y/n)? =>");
	        char ch = Character.toLowerCase(sin.next().charAt(0));
	        if (ch == 'y') {
	            isOptedForTakeAway = true;
	            this.price += backPackPrice;
	        }
	    }

	    public void getBill() {
	        String bill = "";
	        System.out.println("\n--- Final Bill ---");
	        System.out.println("Base Pizza: " + basePizzaPrice);
	        if (isExtraCheeseAdded) {
	            bill += "Extra Cheese: " + extraCheesePrice + "\n";
	        }
	        if (isExtraToppingsAdded) {
	            bill += "Extra Toppings: " + extraToppingsPrice + "\n";
	        }
	        if (isOptedForTakeAway) {
	            bill += "Take away: " + backPackPrice + "\n";
	        }
	        bill += "Total Amount: " + this.price + "\n";
	        System.out.print(bill);
	        System.out.println("Thank you!!! Visit Again.......");
	        System.out.println("----------------------------");
	    }
	}
