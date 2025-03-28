package ex03_Polymorphism;

class Animal{
	public void cry() {};
}
class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}
class Cow extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}

class Farm{
	public void sound(Animal animal) {
		animal.cry();
	}
}


public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}
}