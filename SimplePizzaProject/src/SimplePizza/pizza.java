package SimplePizza;
import java.util.*;
public class pizza {
	Scanner sin=new Scanner(System.in);
	protected String name;
	protected long number;
	protected String address;
	protected String token;
    protected int price;
    private boolean veg;
    private boolean nonveg;
    protected int extraCheesePrice=100;
    protected int extraToppingsPrice=150;
    protected int backPackPrice=20;
    protected int basePizzaPrice;
    protected boolean isExtraCheeseAdded=false;
    protected boolean isExtraToppingsAdded=false;
    protected boolean isOptedTakeAway=false;
    pizza(String name, int number, String address){
    	this.name=name;
    	this.number=number;
    	this.address=address;
    }
    pizza(boolean veg){
    	this.veg=veg;
    	if(this.veg) {
    		System.out.println("From 1 -10");
    		System.out.println("Enter your token's number:");
    		int ch=sin.nextInt();
    		switch(ch) {
    		case 1:
    			boolean paneer = false;
				this.veg=paneer;
				System.out.println("You order Paneer Veg pizza");
				System.out.println("This order is for you");
				break;
    		case 2:
    			boolean paneermix=false;
    			this.veg=paneermix;
    			System.out.println("You order Paneer veg mix pizza");
    			System.out.println("This order is for you");
    			break;
    		case 3:
    			boolean Fullveggies=false;
    			this.veg=Fullveggies;
    			System.out.println("You order FullVeggies pizza");
    			System.out.println("This order is for you");
    			break;
    		case 4:
    			boolean schezwan=false;
    			this.veg=schezwan;
    			System.out.println("You order schezwan pizza");
    			System.out.println("This order is for you");
    			break;
    		case 5:
    			boolean Paneercheesemix=false;
    			this.veg=Paneercheesemix;
    			System.out.println("You order Paneercheesemix pizza");
    			System.out.println("This order is for you");
    			break;
    		case 6:
    			boolean doublepaneer=false;
    			this.veg=doublepaneer;
    			System.out.println("You order double paneer pizza");
    			System.out.println("This order is for you");
    			break;
    		case 7:
    			boolean doublepaneercheese=false;
    			this.veg=doublepaneercheese;
    			System.out.println("You order double paneer cheese pizza");
    			System.out.println("This order is for you");
    			break;
    		case 8:
    			boolean doublepaneerveg=false;
    			this.veg=doublepaneerveg;
    			System.out.println("You order double paneer veg pizza");
    			System.out.println("This order is for you");
    			break;
    		case 9:
    			boolean doublepaneercheesemix=false;
    			this.veg=doublepaneercheesemix;
    			System.out.println("You order double paneer cheese mix pizza");
    			System.out.println("This order is for you");
    			break;
    		case 10:
    			boolean doublepaneercheesevegmix=false;
    			this.veg=doublepaneercheesevegmix;
    			System.out.println("You order double paneer cheese veg mix pizza");
    			System.out.println("This order is for you");
    			break;
    		default:
    			System.out.println("Invalid choice");
    			break;
    			
    		}
    		
    		this.price=300;
    	}
    	else if(this.nonveg) {
    		System.out.println("From 1 -10");
    		System.out.println("Enter your token's number:");
    		int ch=sin.nextInt();
    		switch(ch) {
    		case 1:
    			boolean chickenpaneer = false;
				this.veg=chickenpaneer;
				System.out.println("You order non veg Paneer Veg pizza");
				System.out.println("This order is for you");
				break;
    		case 2:
    			boolean chickenpaneermix=false;
    			this.veg=chickenpaneermix;
    			System.out.println("You order chicken Paneer veg mix pizza");
    			System.out.println("This order is for you");
    			break;
    		case 3:
    			boolean chickenveggies=false;
    			this.veg=chickenveggies;
    			System.out.println("You order chicken Veggies pizza");
    			System.out.println("This order is for you");
    			break;
    		case 4:
    			boolean chickenschezwan=false;
    			this.veg=chickenschezwan;
    			System.out.println("You order chicken schezwan pizza");
    			System.out.println("This order is for you");
    			break;
    		case 5:
    			boolean chickenPaneercheesemix=false;
    			this.veg=chickenPaneercheesemix;
    			System.out.println("You order chickenPaneercheesemix pizza");
    			System.out.println("This order is for you");
    			break;
    		case 6:
    			boolean chickendoublepaneer=false;
    			this.veg=chickendoublepaneer;
    			System.out.println("You order chickendouble paneer pizza");
    			System.out.println("This order is for you");
    			break;
    		case 7:
    			boolean chickendoublepaneercheese=false;
    			this.veg=chickendoublepaneercheese;
    			System.out.println("You order chicken double paneer cheese pizza");
    			System.out.println("This order is for you");
    			break;
    		case 8:
    			boolean chickendoublepaneerveg=false;
    			this.veg=chickendoublepaneerveg;
    			System.out.println("You order chicken double paneer veg pizza");
    			System.out.println("This order is for you");
    			break;
    		case 9:
    			boolean chickendoublepaneercheesemix=false;
    			this.veg=chickendoublepaneercheesemix;
    			System.out.println("You order  chicken double paneer cheese mix pizza");
    			System.out.println("This order is for you");
    			break;
    		case 10:
    			boolean chickendoublepaneercheesevegmix=false;
    			this.veg=chickendoublepaneercheesevegmix;
    			System.out.println("You order chicken double paneer cheese veg mix pizza");
    			System.out.println("This order is for you");
    			break;
    		default:
    			System.out.println("Invalid choice");
    			break;
    		}
    			this.price=400;
    	}
    	this.basePizzaPrice=price;
    }
    public void addExtraCheese() {
    		System.out.println("Extra Cheese:(y/n)?=>");
    		char ch=sin.next().charAt(0);
    		if(ch=='y') {
    			isExtraCheeseAdded=true;
    			this.price+=extraCheesePrice;
    		}
    }
    public void addExtraToppings() {
    		System.out.println("Extra Toppings:(y/n)?=>");
    		char ch=sin.next().charAt(0);
    		if(ch=='y') {
    			isExtraToppingsAdded=true;
    			this.price+=extraToppingsPrice;
    		}
    }
    public void takeAway() {
    		System.out.println("Take Away:(y/n)?=>");
    		char ch=Character.toLowerCase(sin.next().charAt(0));
    		if(ch=='y') {
    			isOptedTakeAway=true;
    			this.price+=backPackPrice;
    		}
    }
    public void getBill() {
    		String bill="";
    		System.out.println("---Final Bill---");
    		System.out.println("Customer Name:"+name);
    		System.out.println("Customer's contact number:"+number);
    		System.out.println("Customer's Address:"+address);
    		System.out.println("Pizza's Token:"+token);
    		System.out.println("Base Pizza:"+basePizzaPrice);
    		System.out.println("Extra Cheese:"+extraCheesePrice);
    		System.out.println("Extra Toppings:"+extraToppingsPrice);
    		System.out.println("Take Away:"+backPackPrice);
    		bill="Total Amount:"+this.price+"\n";
    		System.out.println(bill);
    		System.out.println("Thank you!!! Visit Again...........");
    		System.out.println("---------------------------");
    }
}
