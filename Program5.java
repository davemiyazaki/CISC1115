public class Program5 {
	public static void main(String[] args){
		final double PI = 3.14159; // setting constant for PI for ease of use
		final double circleRadius = 5.5; //setting constsant for circle radius since it won't change
		final double circlePerimeter = 2 * circleRadius * PI; //setting constant for Perimeter since it won't change 
		final double circleArea = circleRadius * circleRadius * PI; // setting constant for Area since it won't change
		System.out.println("Premeter of a cirlce with radius of 5.5 is " + circlePerimeter);
		System.out.println("Area of a circle with radius of 5.5 is " + circleArea);
	}
}
