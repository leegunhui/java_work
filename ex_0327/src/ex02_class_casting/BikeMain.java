package ex02_class_casting;

public class BikeMain {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		//b.addWheel(); 부모 타입으로는 불가
		
		
		System.out.println();
		//자식 타입으로 다시 변환을 해줌으로써 부모 타입에서는 사용하지
		//못했던 자식의 멤버들을 모두 사용할 수 있게 되었다
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.addWheel();
		fwb.info();
		fwb.ride();
	}
}
