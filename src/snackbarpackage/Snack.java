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

	public Snack(String name, int quantity, double cost) // constructor function
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;

	}

	

	// ------- Getter Methods -----------


	public int getId()
	{

		return id;

	}

	public String getName()
	{

		return name;

	}

	public double getCost()
	{

		return cost;

	}

	public int getVendingMachineId()
	{

		return vendingMachineId;

	}

	public int getQuantity()
	{

		return quantity;

	}

	public double getTotalCost(int numberPurchased)
	{

		return getCost() * numberPurchased;

	}

	// ------- Setter Methods ----------

	public void setName(String name)
	{
		this.name = name;
	};

	public void setCost(double cost)
	{
		this.cost = cost;
	};

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	};

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}


	// ------- additional Methods ---------

	// add quantity when given how many to add

	// public addQuantity() 
	// {

	// }

	// buy snack when given how many to buy

	public void buySnack(int numberPurchased )
	{
		this.quantity -= numberPurchased;
	}


}