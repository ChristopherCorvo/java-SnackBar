package snackbarpackage;

public class Main
{
	private static void workWithData()
	{
		// -------- Instantiate Obj's from Classes ------
		// -------- Customer objs ---------
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		// ------- Vending Machine objs ----
		VendingMachine v1 = new VendingMachine("Food");
		VendingMachine v2 = new VendingMachine("Drink");
		VendingMachine v3 = new VendingMachine("Office");

		// ------- Snack objs ----------------
		// In Vending Machine 'Food'
		Snack s1 = new Snack("Chips", 36, 1.75);
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00);
		Snack s3 = new Snack("Pretzel", 30, 2.00);

		// In Vending Machine 'Drink'
		Snack s4 = new Snack("Soda", 24, 2.50);
		Snack s5 = new Snack("Water", 20, 2.75);

		// ------- Proccessing Data --------

		System.out.println(" <---------- Processing Data -------->");
		System.out.println("Name: " + c1.getName() );
		System.out.println("Janes Starting Cash On Hand: " + c1.getCashOnHand() );
		
		// Jane buys 3 of snack 4 (soda)

		c1.buySnacks(s4.getTotalCost(3));


		//total cost of 3 items

		System.out.println("total cost of 3 items " + s4.getTotalCost(3));


		// reduce quantity of snack 4

		s4.buySnack(3);

		
		System.out.println("New Quantity of Soda " + s4.getQuantity());


		// subtract total cost from Jane's Cash On Hand

		System.out.println("subtract total cost from Jane's Cash On Hand " + (c1.getCashOnHand()));
		
		
		// Print Customer 1 (Jane) Cash on hand.
		
		

		// Print quantity of snack 4 (Soda).

		// System.out.println(s4.getQuantity());


		// Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
		// Print Customer 1 (Jane) Cash on hand.
		// Print quantity of snack 3 (Pretzel).
		// Customer 2 (Bob) buys 2 of snack 4 (Soda).
		// Print Customer 2 (Bob) Cash on Hand.
		// Print quantity of snack 4 (Soda).
		// Customer 1 (Jane) finds $10.
		// Print Customer 1 (Jane) Cash on Hand.
		// Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
		// Print Customer 1 (Jane) Cash on Hand.
		// Print quantity of snack 2 (Chocolate Bar).
		// Add 12 more items to snack 3 (Pretzel).
		// Print quantity of snack 3 (Pretzel).
		// Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
		// Print Customer 2 (Bob) Cash on hand.
		// Print quantity of snack 3 (Pretzel).


	}

	public static void main(String[] args)
	{
		workWithData();
	}

	
}