package ex04_overloading;

public class BreadMain {

	public static void main(String[] args) {
		Bread b = new Bread();
		
		b.makeBread();
		
		b.makeBread(2);
		
		b.makeBread("담배",6);

	}

}
