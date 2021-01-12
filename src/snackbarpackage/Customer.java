package snackbarpackage;

public class Customer
{

	// ----- Customer Fields -------

	private static int maxId = 0;

	private int id;
	private String name;
	private double cashOnHand;

	// -------- Constructor Customer Object -------

	public Customer(String name, double cashOnHand)
	{

		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;

	}

	// ------ Getter & Setter Methods -----

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand)
	{
		this.cashOnHand = cashOnHand;
	}
	
	
	// ------ Additional Methods


	public void addCashToCashOnHand(double cash)
	{

		setCashOnHand(getCashOnHand() + cash);
	}
	
	// buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount

	public void buySnacks(double totalCostOfSnacks)
	{

		setCashOnHand(getCashOnHand() - totalCostOfSnacks);
	}

}