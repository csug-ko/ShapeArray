package Shapes;

public class Sphere extends Shape{
    
    private double sphereRadius;
    private double area;
    private double volume;
    
    // constructor 
    Sphere(double radius) {
        sphereRadius = radius;
        this.surface_area();
        this.volume();
    }

    // overriding surface area shape mwthod 
    @Override
    public double surface_area() {
        this.area = 4 * Math.PI * sphereRadius * sphereRadius;
        return this.area;
    }

    // overriding volume shape method 
    @Override
    public double volume() {
        this.volume = Math.PI * sphereRadius * sphereRadius * sphereRadius * (4 / 3) * (4 % 3);
        return this.volume;
    }

    // overring toString method 
    @Override
    public String toString() {
        String r = new StringBuilder()
        .append("The area of the sphere is: ")
        .append(String.format("%.2f",this.area))
        .append("\nThe Volume of the sphere is: ")
        .append(String.format("%.2f",this.volume)).toString();
        return r;
    }
}
