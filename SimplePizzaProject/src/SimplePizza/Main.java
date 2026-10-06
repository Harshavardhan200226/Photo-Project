package SimplePizza;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Welcome to Pizza's World");
		System.out.println("Enter customer's name:");
		String name=sin.next();
		System.out.println("Enter customer's Contact:");
		long number=sin.nextLong();
		System.out.println("Enter customer's address:");
		String address=sin.next();
		System.out.println("Pizza's Token:1.Veg Pizza 2.Non-Veg Pizza 3.Delux Veg Pizza 4.Delux Non-Veg Pizza");
		int ch=sin.nextInt();
		switch(ch) {
		case 1:
			pizza vegPizza=new pizza(true);
			vegPizza.name=name;
			vegPizza.number=number;
			vegPizza.address=address;
			vegPizza.addExtraCheese();
			vegPizza.addExtraToppings();
			vegPizza.takeAway();
			vegPizza.getBill();
		case 2:
			pizza NonVegPizza=new pizza(false);
			NonVegPizza.name=name;
			NonVegPizza.number=number;
			NonVegPizza.address=address;
			NonVegPizza.addExtraCheese();
			NonVegPizza.addExtraToppings();
			NonVegPizza.takeAway();
			NonVegPizza.getBill();
		case 3:
			DeluxPizza vegpizza=new DeluxPizza(true);
			vegpizza.basePizzaPrice();
			vegpizza.addExtraCheese();
			vegpizza.addExtraToppings();
			vegpizza.takeAway();
			vegpizza.getBill();
		case 4:
			DeluxPizza nonVegPizza=new DeluxPizza(false);
			nonVegPizza.basePizzaPrice();
			nonVegPizza.addExtraCheese();
			nonVegPizza.addExtraToppings();
			nonVegPizza.takeAway();
			nonVegPizza.getBill();
		default:
			System.out.println("Invalid choice:");
		}
	}
}
