class WrongAge extends Exception
{
	WrongAge(String Message)
	{
		super(Message);
	}
}

class Father
{
	private int age;
	
	public Father(int age) throws WrongAge
	{
		if(age<0)
		{
			throw new WrongAge("Age cannot be negative");
		}
		this.age=age;
	}
	public int getAge()
	{	
		return age;
	}  
}

class Son extends Father
{
	private int sonAge;
	public Son(int fatherAge,int sonAge) throws WrongAge
	{
		super(fatherAge);
		if(sonAge>=fatherAge)
		{
			throw new WrongAge ("Son's age cannot be greater than or equal to father's age");
		}
		this.sonAge=sonAge;
	}
	public int getSonAge()
	{
		return sonAge;
	}
}

public class ExceptionInheritance
{
	public static void main(String [] args)
	{
		try{
			Son s1=new Son(40,20);
			System.out.println("father'age:"+s1.getAge());
			System.out.println("father'age:"+s1.getSonAge());

			Son invalidSon = new Son(30,35);
			System.out.println("This line will not be reached");
		}
		catch(WrongAge e)
		{
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
			
			