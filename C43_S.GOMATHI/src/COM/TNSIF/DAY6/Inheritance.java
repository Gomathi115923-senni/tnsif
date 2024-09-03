package COM.TNSIF.DAY6;

import com.tansif.Day6.Inheritance.Inher.a;
import com.tansif.Day6.Inheritance.Inher.a1;

public class Inheritance {
	public static class a{
		public void show() {
			System.out.println("hi");
		}
	}
	public static class a1 extends a{
		public void dhow() {
			System.out.println("hii");
		}
	}
	public static void main(String[]args) {
		a1 obj=new a1();
		obj.dhow();
		obj.show();
	}
}
