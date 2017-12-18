package be.pxl.h10.opdracht8_shapes;

public class Circle extends Shape{
	private double Radius;
	
	public Circle(double x, double y, double radius) {
		setPosition(x, y);
		setRadius(radius);
	}
	
	public double getRadius() {
		return Radius;
	}
	
	public void setRadius(double radius) {
		Radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(Radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2*Radius*Math.PI;
	}
	
	public boolean equals(Object o) {
		if(o != null
				&& o.getClass() == this.getClass()) {
			Circle circle = (Circle) o;
			if(circle.getRadius() == this.getRadius()
				&& circle.getX() == this.getX()
				&& circle.getY() == this.getY()) {
			return true;
			}
		}
		else {
			return false;
		}
	}
	
}
