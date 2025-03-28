package exam2;

public class Calc extends Calculator {
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	@Override
	public double average(int[]a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<=a.length; i++) {
			sum += i;
		}
		
		double avg = sum/(double)a.length;
		return avg;
	}
	
	
}
