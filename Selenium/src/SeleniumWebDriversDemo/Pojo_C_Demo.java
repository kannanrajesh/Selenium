package SeleniumWebDriversDemo;

public class Pojo_C_Demo {
	public static void main(String[] args) {
			Pojo_A_Demo c = new Pojo_A_Demo();
			
				int value = c.getA();
				System.out.println(value);
				c.setA(100);
				System.out.println(c.getA());
				
				String string = c.getS();
				c.setS("how r u");
				System.out.println(c.getS());
				
	}
}
