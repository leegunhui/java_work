package ex05_Generic;

//제네릭에 들어올 수 있는 타입을 숫자로 제한

public class Ex03_Generic {
	class Calculator<T extends Number> {
	    void add(T a, T b) {}
	    void min(T a, T b) {}
	    void mul(T a, T b) {}
	    void div(T a, T b) {}
	}

	public class Main {
	    public static void main(String[] args) {
	        // 제네릭에 아무 타입이나 모두 할당이 가능
//	        Calculator<Number> cal1 = new Calculator<>();
//	        Calculator<Float> cal2 = new Calculator<>();
//	        Calculator<Integer> cal3 = new Calculator<>();
//	        
	    }
	
	}
}