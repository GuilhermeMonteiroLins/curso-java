package entities;

public class Rectangle {
	 public double width;
	 public double height;
	 
	 public double area() {
		 double a = width * height;
		 return a;
	 }
	 public double perimeter() {
		 double p = (2*(width + height));
		 return p;
	 }
	 public double diagonal() {
		 double d = Math.sqrt((width * width) + (height * height));
		 return d;
	 }
}
