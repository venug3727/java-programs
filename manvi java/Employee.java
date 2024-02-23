import java.util.Scanner;
class Employee
{
private int empid;
private String empname;
private int empnohrs;
private double empbasic;
private double emphra;
private double empda;
private double empit;
private double empgross;

public void acceptInput()
{
Scanner s1=new Scanner(System.in);

System.out.println("Enter Employee ID: ");
empid = s1.nextInt();
System.out.println("Enter Employee NAME: ");
empname = s1.next();
System.out.println("Enter Employee NO.OF HOURS WORKED: ");
empnohrs = s1.nextInt();
System.out.println("Enter Employee BASIC SALARY: ");
empbasic = s1.nextDouble();
System.out.println("Enter Employee HRA % : ");
emphra =s1.nextDouble();
System.out.println("Enter Employee Da(%): ");
empda=s1.nextDouble();
System.out.println("Enter Employee IT (%): ");
empit=s1.nextDouble();

s1.close();
}
public void calculateGrossSalary()
{
empgross= empbasic + empbasic*emphra + empbasic*empda - empbasic*empit;

if(empnohrs > 200)
{
double overtimepayment = (empnohrs -200) *100;
empgross += overtimepayment;
}

else if (empnohrs < 200)
{
double reductionAmount = (200-empnohrs) * 100;
empgross -= reductionAmount;
}
}


public void displayDetails()
{
System.out.println("Employee ID:" + empid);
System.out.println("Employee NAME:" + empname);
System.out.println("GROSS SALARY: Rs." + empgross);
}

public static void main(String[] args)
{
Employee employee = new Employee();
employee.acceptInput();
employee.calculateGrossSalary();
employee.displayDetails();
}
}

