package ex03_try_catch;

import java.util.Scanner;

public class InputErrorException extends Exception {
	
	public InputErrorException(String message) {
		super(message);
	}
	
}
