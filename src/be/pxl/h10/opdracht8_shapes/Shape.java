package be.pxl.h10.opdracht8_shapes;

public abstract class Shape {
	protected double X;
	protected double Y;
	protected int aantal = 0;
	{
		aantal++;
	}
	
	public void setPosition(double x, double y) {
		X = x;
		Y = y;
	}
	
	public double getX() {
		return X;
	}
	
	public double getY() {
		return Y;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
