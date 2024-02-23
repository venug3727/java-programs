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

class Gener2
{
		
		public static void main(String [] args)
		{
			Gener<Double> g1 = new Gener<Double>(100.003);
			g1.showType();
			double x = g1.retObj();		
			System.out.println("x = "+ x);


		}
}
			
