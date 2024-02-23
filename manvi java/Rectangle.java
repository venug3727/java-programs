import java.util.Scanner;
class Rectangle
{
int len , bre;
void area()
{
System.out.println("area=" + len*bre);
}
int perimeter()
{
return(2*(len+bre));
}
}
class RecDemo
{
public static void main(String [] args)
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.len=10;
r1.bre=15;
r2.len=5;
r2.bre=7;
r1.area();
int p1 = r1.perimeter();
System.out.println("perimeter=" + p1);
System.out.println("perimeter for object 2:" + r2.perimeter());
}
}
