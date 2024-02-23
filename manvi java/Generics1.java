class Gener<T>
{
	T ob;
	Gener(T o)
	{
	   ob=o;
	}
	   
	void showType()
	{
		System.out.println(ob.getClass().getName());
	}
	T retObj()
	{
	   return ob;
	}
}

class Generics1
{
		
		public static void main(String [] args)
		{
			Gener<String> g1 = new Gener<String>("This is Java Language");
			g1.showType();
			String s = g1.retObj();		
			System.out.println(s);


		}
}
			
