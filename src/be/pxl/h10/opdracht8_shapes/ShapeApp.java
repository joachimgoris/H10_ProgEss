package be.pxl.h10.opdracht8_shapes;

public class ShapeApp {

	public static void main(String[] args) {
		Circle c = new Circle(1.0,1.0,2.56);
		
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(c.getRadius());
		
		System.out.println(c.getClass());
		System.out.println(c.getClass().toString());
		
		Circle c2 = new Circle(1.0,1.0,2.56);
		
		System.out.println(c.equals(c2));
	}

}
