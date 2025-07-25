package Day4.Secondpackage;

	import Day4.firstpackage.Base;

	public class Executor {
		public static void main(String[] args) {
			// accessing different package class
			Base b1 = new Base();

			b1.methodPublic();
			b1.varPublic = 41;
			b1.methodPublic();
}
	}
