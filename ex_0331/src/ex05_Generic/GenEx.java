package ex05_Generic;

public class GenEx<T> {
	
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}	
}