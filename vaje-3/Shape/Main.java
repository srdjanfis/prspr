// Main.java
// Main class
public class Main {
    public static void main(String[] args) {
		double r = 4.0;
        Circle circle = new Circle(r);
		double rs1 = 4.0, rs2 = 6.0;
		double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
        Rectangle rectangle = new Rectangle(rs1, rs2);
        Triangle triangle = new Triangle(ts1, ts2, ts3);
        System.out.println("Radius of the Circle"+r);
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());
		System.out.println("\nSides of the rectangle are: "+rs1+','+rs2);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
		System.out.println("\nSides of the Traiangel are: "+ts1+','+ts2+','+ts3);
        System.out.println("Area of the Triangle: " + triangle.getArea());
        System.out.println("Perimeter of the Triangle: " + triangle.getPerimeter());
    }
}
