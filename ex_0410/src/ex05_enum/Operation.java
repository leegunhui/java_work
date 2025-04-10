package ex05_enum;

public enum Operation {

	PLUS{
		int apply(int x, int y) {
			return x + y;
		}
	},
	
	MINUS{
		int apply(int x, int y) {
			return x - y;
		}
	},
	
	MULTI{
		int apply(int x, int y) {
			return x * y;
		}
	},
	
	DIV{
		int apply(int x, int y) {
			return x / y;
		}
	};
	
	abstract int apply(int x, int y); 
}
