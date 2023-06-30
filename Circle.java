package Project6;

public class Circle implements Shape{
	private double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
