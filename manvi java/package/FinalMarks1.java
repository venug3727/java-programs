import CIE.Student;
import CIE.Internals;
import SEE.Externals;
import java.util.Scanner;


public class FinalMarks
{
	public static void main(String [] args)
	{
		Scanner s1=new Scanner(System.in);

		System.out.println("Enter the number of Students");
		int n=s1.nextInt();

		 String []names=new String[n];
		 String []usn=new String[n];
		 int []sem = new int[n];
		 int [][] InternalMarks = new int[n][5];
		 int [][] SeeMarks = new int[n][5];

		for(int i=0 ; i<n; i++)
		{
			System.out.println("Enter details for Student" + (i+1) + ":");
			System.out.println("Name:");
			names[i]=s1.next();
			System.out.println("USN:");
			usn[i]=s1.next();
			System.out.println("SEM:");
			sem[i]=s1.nextInt();

			System.out.println("Enter Internal marks for 5 courses:");
			for(int j=0; j<5; j++)
			{ 
				System.out.println("Course"+(j+1)+":");
				InternalMarks[i][j]=s1.nextInt();
			}
			System.out.println("Enter Internal marks for 5 courses:");
			for(int j=0; j<5; j++)
			{ 
				System.out.println("Course"+(j+1)+":");
				SeeMarks[i][j]=s1.nextInt();
			}
		}

		int [][]FinalMarks =  new int[n][5];
		for(int i=0 ; i<n ; i++)
		{
			Internals I1 = new Internals(names[i] , usn[i] , sem[i] , InternalMarks[i]);
			Externals E1 = new Externals(names[i] , usn[i] , sem[i] , SeeMarks[i]);


			for(int j=0; j<5 ;j++)
			{
				FinalMarks[i][j] = I1.InternalMarks[i] + E1.SeeMarks[j];
			}
			System.out.println("Finals Marks for " + n+ "Students in 5 courses:");
			for(int i=0 ;i<n ;i++)
			{
				System.out.println(names[i] +":");

				for(int j=0; j<5;j++)
				{
					System.out.println(FinalMarks[i][j] + ":");
				}
				System.out.println();
		  	}
			s1.close();
		}
}
}
		
		