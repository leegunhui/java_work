package ex03_Polymorphism;

public class ComMain {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		cr.com1 = new Samsung();
		cr.com2 = new Samsung();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println();

	}
}
