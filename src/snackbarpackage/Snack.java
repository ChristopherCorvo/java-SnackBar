package snackbarpackage;

public class Snack 
{
	// ------ Fields -------

	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// ------- Constructor ---------
	public Snack(String name, int quantity, double cost) // constructor function
	{
		// These two lines of code generate a new id
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}

	// ------- Getters & Setter Methods -----------


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


	public double getCost()
	{

		return cost;

	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getVendingMachineId()
	{

		return vendingMachineId;

	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}


	public int getQuantity()
	{

		return quantity;

	}

	

	// ------- additional Methods ---------

	public double getTotalCost(int numberPurchased)
	{

		return getCost() * numberPurchased;

	}

	public void addQuantity(int addQuantity)
	{
		this.quantity += addQuantity;
	}


	public void buySnack(int buyQuantity)
	{
		this.quantity -= buyQuantity;
	}


}