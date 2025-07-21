package Day1;
import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
				
		System.out.print("add of a=" +a+",b=" +b+" is "+c);
	}

}
