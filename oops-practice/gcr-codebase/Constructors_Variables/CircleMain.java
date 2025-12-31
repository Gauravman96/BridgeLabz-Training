class Circle {
    double radius;

    // Default constructor (calls parameterized constructor)
    Circle() {
        this(1.0); 
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }
}
  public class CircleMain{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
  }