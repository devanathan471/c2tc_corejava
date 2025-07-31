package Day8.Interfaces.Functionalinterface;

public class FunctionalinterfaceDemo {

	public static void main(String[] args) {
		Greetclass g = new Greetclass();
		System.out.println(g.greet());

		//using Lambda Expression
		Greetinterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());

	}
}