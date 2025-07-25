package Day2.entity1;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		System.out.println(c1);
		
		Customer c2=new Customer();
		c2.setCid(102);
		c2.setCustomername("suriya");
		c2.setCity("bangalore");
		System.out.println(c2);
		
		System.out.println("customer 1 city:"+c1.getCity()+" customer 2 city:"+c2.getCity());
	}

}
