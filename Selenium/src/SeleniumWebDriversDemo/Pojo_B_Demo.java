package SeleniumWebDriversDemo;

public class Pojo_B_Demo {
		public static void main(String[] args) {
				Pojo_A_Demo a = new Pojo_A_Demo();
				
				int value = a.getA();
				System.out.println(value);
				a.setA(10);
				System.out.println(a.getA());
				
				a.setS("hello");
				System.out.println(a.getS());
				
		}
}
