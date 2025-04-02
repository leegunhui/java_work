package ex02_lamda;

public class Ex01_Function {
	public static void main(String[] args) {
		Iadd add = (x,y) -> x+y;
		int res = result(add);
		System.out.println("람다식 매개변수로 활용 : " +res);
	}
	
	public static int result(Iadd lamda) {
		return lamda.add(1, 2);
	}
}
