package project4;

public class Square extends Shape {
	private String color;
	Square(int side,String color)
	{ super(side,side);
	  this.color=color;
	}
	

	public double calculateShape(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public String toString() {
		return "Square [color=" + color +super.toString() +"]";
	}
}
