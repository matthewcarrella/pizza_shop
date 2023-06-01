// Chapter 3 extra project

// import statement for the Scanner class
import java.util.Scanner;

public class PizzaShop
{
	public static void main(String[] args) 
	{
		// Variables and constants
		String customer;
		int toppings;
		Scanner input = new Scanner(System.in);
		Pizza pizza1 = new Pizza();
		Pizza.intro();
		System.out.print("What name will the order be under? >>");
		customer = input.nextLine();
		System.out.print("Please enter the number of toppings >>");
		toppings = input.nextInt();

		// Processing phase
		pizza1.enterName(customer);
		pizza1.addToppings(toppings);
		pizza1.calcPrice();

		// Output phase
		pizza1.summary();
		System.out.println("Order Complete");
	} // end of main()
} // end of class