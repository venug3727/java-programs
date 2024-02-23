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

class Gener3
{
		
		public static void main(String [] args)
		{
			Gener<Float> g1 = new Gener<Float>(12.25);
			g1.showType();
			float f = g1.retObj();		
			System.out.println("f = "+ f);


		}
}
			
