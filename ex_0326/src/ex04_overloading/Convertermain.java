package ex04_overloading;

public class Convertermain {

	public static void main(String[] args) {
		Converter c = new Converter();
		
		c.convert(180);
		
		c.convert(100,"inch");
	}

}
