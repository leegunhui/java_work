package ex01_lamda;

import java.util.function.Function;

public class Ex02_Function {
	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		//이진수로 값 바꿔줌
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);

		Function<String, String> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g);

		System.out.println(h.apply("FF")); // "FF" -> 255 -> "11111111"
		System.out.println(h2.apply(2)); // 2 -> "10" -> 16

		Function<String, String> f2 = x -> x; // 항등 함수(identity function)
		System.out.println(f2.apply("Hello")); // Hello가 그대로 출력됨
	}
}
