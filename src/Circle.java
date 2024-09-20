import java.util.Scanner;

public class Circle {
    private double radius;
	private String size;

    // No-argument constructor
    public Circle() {
        this.radius = 2.0; // Default radius
    }

   
    public Circle(double radius ) {
        this.radius = radius;
       
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }
     
  
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Circle using no-argument constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - with Default Radius -- " + circle1.getRadius() + 
                           ", Circumference -- " + circle1.calculateCircumference());

        // Create Circle using two-argument constructor
        System.out.print("Enter the radius for Circle 2: ");
        double inputRadius = scanner.nextDouble();
       
        Circle circle2 = new Circle(inputRadius);

        System.out.println("Circle 2 - Radius --- " + circle2.getRadius() + 
                           ", Circumference --- " + circle2.calculateCircumference());

    }

	
}
