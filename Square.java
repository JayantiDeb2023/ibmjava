package Project6;

public class Square implements Shape{
	private double side;
	Square(double side)
	{
		this.side=side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getArea()
	{
		return side*side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	

}
