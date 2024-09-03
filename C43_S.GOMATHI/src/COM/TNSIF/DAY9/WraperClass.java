package COM.TNSIF.DAY9;

public class WraperClass {
		public static void main(String[] args) {
			// Unboxing
			@SuppressWarnings("removal")
			Integer i = new Integer(10);
			System.out.println(i);
			int b = i.intValue();
			System.out.println(b);

			// Without using intValue()
			int c = i;
			System.out.println(c);
			
			//Autoboxing
			int a = 100;
			Integer i1 = a;
			System.out.println(i1);
		}

}
