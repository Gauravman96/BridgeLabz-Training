import java.util.*;
public class VolumeOfCylinder {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the radius");
    double radius= sc.nextDouble();
    // System.out.println("Enter the Height");
    double height = sc.nextDouble();
    double volume=  Math.PI*radius*radius*height ;

    System.out.println(volume);
    }
    

}
