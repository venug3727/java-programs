import java.util.Scanner;
class Roots
{
public static void main(String xx[])
{
double r1;
double r2;
Scanner s1 = new Scanner(System.in);
System.out.println("   MANVI SHARMA 1BM22CS149   ");
System.out.println("Enter Coefficients of the equation:");

double a=s1.nextDouble();
double b=s1.nextDouble();
double c=s1.nextDouble();

double d=(b*b)-(4*a*c);

if(d==0)
{
System.out.println("Roots are real and equal");
r1 = r2 = -b/(2*a);
System.out.println("R1=" + r1);
System.out.println("R2=" + r2);
}
else if(d>0)
{
System.out.println("Roots are real and distinct");
r1=(-b + Math.sqrt(d)) / (2*a);
r2=(-b - Math.sqrt(d)) / (2*a);
System.out.println("R1=" + r1);
System.out.println("R2=" + r2);
}
else
{
System.out.println("Roots are distinct and imaginary");

double x = -b / (2*a);
double y = ( Math.sqrt(-d)) / (2*a);

System.out.println("R1=" + x + "+i" + y);
System.out.println("R2=" + x + "-i" + y);
}
}
}

