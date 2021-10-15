
public class AreaTest {

	public static void main(String[] args) {
		
		Figure[] figures = {
				new Triangle(2 ,3, 3),
				new Rectangle(5, 8),
				new Square(5)};
			
			for(int i =0; i < figures.length; i++) {
				System.out.println(figures[i] + "area = " + figures[i].getArea());
		}
	}
}


abstract class Figure{
	public abstract double getArea();
}


class Triangle extends Figure{
	private double la;
	private double lb;
	private double lc;
	
	public Triangle(double la, double lb, double lc) {
		this.la = la;
		this.lb = lb;
		this.lc = lc;
	}
	
	public String toString() {
		return "Triangle : sides = " + la + ", " + lb + ", " + lc + " : ";
	}
	
	public double getArea() {
		double s = (la + lb + lc) / 2.0;
		return Math.sqrt(s * (s - la) * (s - lb) * (s - lc));
	}
}


class Rectangle extends Figure{
	private double height;
	protected double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public String toString() {
		return "Rectangle : height = " + height + ", width = " + width + " : ";
	}
	
	public double getArea() {
		return height * width;
	}
}


class Square extends Rectangle{
	public Square(double width) {
		super(width, width);
	}
	
	public String toString() {
		return "Square : width = " + width + " : ";
	}
}