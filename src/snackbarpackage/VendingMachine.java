package snackbarpackage;

public class VendingMachine 
{

	// ------ VendingMachine fields ----------

	private static int maxId = 0;
	private int id;

	private String name;

	// --------- VendingMachine Object Constructor -----------
	public VendingMachine(String name)
	{
		maxId++;
		id = maxId;

		this.name = name;
	}

	// --------- Getters & Setter Methods ----------
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

}