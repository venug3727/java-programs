class Gener<G>
{
	G ob;
	Gener(G o)
	{
	   ob=o;
	}
	   
	void showType()
	{
		System.out.println(ob.getClass().getName());
	}
	G retObj()
	{
	   return ob;
	}
}

class Generics
{
		
		public static void main(String [] args)
		{
			Gener<Integer> g1 = new Gener<Integer>(100);
			g1.showType();
			int x = g1.retObj();		
			System.out.println("x = "+ x);


		}
}
			
