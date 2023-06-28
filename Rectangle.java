package project4;

public class Rectangle extends Shape{
	private MyColor color;
	Rectangle(int height,int weight,MyColor color)
	{ super(height,weight);
	  this.color=color;
	}
	
	@Override
	public double calculateShape(int height, int width) {
		// TODO Auto-generated method stub
		return height*width;
	}

	@Override
	public String toString() {
		return "Rectangle [color=" + color+super.toString() +"]";
	}
	

}
