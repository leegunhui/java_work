package ex01_inheritance;

public class Pen {
	private int amount;
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
}

class SharpPen extends Pen{
	private int width;
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
}

class BallPen extends Pen{
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}

class FountainPen extends BallPen{
	public void refill(int n) {
		setAmount(n);//amount에 접근할 수 있다.
	}
}