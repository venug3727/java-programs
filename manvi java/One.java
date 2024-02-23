
import java.util.Scanner;
class One
{
public static void main(String xx[])
{
int a;
int b;
int c;
Scanner s1 = new Scanner(System.in);
System.out.println("enter the values of a,b,c");
a=s1.nextInt();
b=s1.nextInt();
c=s1.nextInt();

System.out.println("MANVI SHARMA 1BM22CS149 ");

if(a>b && a>c)
{
	System.out.println( a+ "is the largest integer");
}
else if(b>a && b>c)
{
	System.out.println( b+ "is the largerst integer");
}
else
{
	System.out.println(c +"is the largest int");
}
}
}




