package ex04_overloading;

public class Converter {
	//cm -> m로 변환하는 convert
	
	//m,inch -> cm로 변환하는 convert
	//inch -> cm:inch*2.54
	public void convert(int n) {
		System.out.printf("%d cm - > m : %.1fm \n" ,n, n*0.01);
	}
	
	public void convert(double n, String unit) {
		if(unit.equals("m")) {
			System.out.printf("m -> cm : %.1fcm \n" , n*100);	
		}
		else if(unit.equals("inch")) {
			System.out.printf("inch -> cm : %.1fcm \n" , n*2.54);	
		}
		else {
			System.out.println("잘못입력하셨습니다. \n");
		}
	}
}
