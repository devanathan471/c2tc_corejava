package Day3.constructor;
import java.util.Scanner;

public class ConstructorDemo {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String name, city;
	int id;
	System.out.print("Enter Customer Id : ");
	id=sc.nextInt();
	
	sc.nextLine();
	System.out.print("Enter Customer Name : ");
	name=sc.nextLine();
	
	System.out.print("Enter Customer City : ");
	city=sc.nextLine();

	
	System.out.println(" ");
	
	Customer c1=new Customer(); //default constructor invoked
	c1.setCustomerName(name);
	c1.setCustomerId(id);
	c1.setCustomerCity(city);
	System.out.println(c1);
	
	System.out.print("Enter Customer Id : ");
	id=sc.nextInt();
	
	sc.nextLine();
	System.out.print("Enter Customer Name : ");
	name=sc.nextLine();
	
	System.out.print("Enter Customer City : ");
	city=sc.nextLine();
	
	sc.close();
}
}