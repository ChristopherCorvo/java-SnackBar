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
		System.out.println();
		System.out.println("Jane buys 3 sodas");
		c1.buySnacks(s4.getTotalCost(3));
		System.out.println("Janes current cash on hand after buying 3 sodas is" + "$" + c1.getCashOnHand()); //
		s4.buySnack(3);
		System.out.println("Soda quantity is: " + s4.getQuantity());


		System.out.println();
		System.out.println("Jane buys 1 bag of pretzels");
		c1.buySnacks(s3.getTotalCost(1));
		System.out.println("Janes current cash on hand after buying pretzels is: " + "$" + c1.getCashOnHand()); //
		s3.buySnack(1);
		System.out.println("Pretzel quantity is: " + s3.getQuantity());
		
		
		System.out.println();
		System.out.println("Bob buys 3 sodas");
		c2.buySnacks(s4.getTotalCost(2));
		System.out.println("Bob's current cash on hand after buying 3 sodas is: " + "$" + c2.getCashOnHand()); //
		s4.buySnack(2);
		System.out.println("Soda quantity is: " + s4.getQuantity());

		System.out.println();
		c1.addCashToCashOnHand(10);
		System.out.println("Jane finds $10 so her new cash on hand value is: " + "$" + c1.getCashOnHand());
		
		System.out.println();
		System.out.println("Jane buys 1 Chocolate Bar");
		c1.buySnacks(s2.getTotalCost(1));
		System.out.println("Jane's current cash on hand after buying 1 Chocolate bar is" + "$" + c1.getCashOnHand()); //
		s2.buySnack(1);
		System.out.println("Chocolate Bar quantity is: " + s2.getQuantity());

		System.out.println();
		s3.addQuantity(12);
		System.out.println("Pretzel quantity is: " + s3.getQuantity());

		System.out.println();
		System.out.println("Bob buys 3 pretzels");
		c2.buySnacks(s3.getTotalCost(3));
		System.out.println("Bob's current cash on hand after buying 3 pretzels is: " + "$" + c2.getCashOnHand());
		s3.buySnack(3);
		System.out.println("Pretzel quantity is: " + s3.getQuantity());

	}

	public static void main(String[] args)
	{
		workWithData();
	}

	
}