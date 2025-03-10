package Shapes;

public class Cylinder extends Shape{
    
    private double cylinderRadius;
    private double cylinderHeight;
    private double area;
    private double volume;

    // constructor 
    Cylinder(double radius, double height) {
        cylinderRadius = radius;
        cylinderHeight = height;
        this.surface_area();
        this.volume();
    }

    // overriding shape surface area 
    @Override
    public double surface_area() {
        this.area = (2 * Math.PI * cylinderRadius * cylinderHeight) * (2 * Math.PI * cylinderRadius * cylinderRadius);
        return this.area;
    }

    // overriding shape volume 
    @Override
    public double volume(){
        this.volume = Math.PI * cylinderRadius * cylinderRadius * cylinderHeight;
        return this.volume;
    }

    // overriding tostring
    @Override
    public String toString() {
        String r = new StringBuilder()
        .append("The area of the cylinder is: ")
        .append(String.format("%.2f",this.area))
        .append("\nThe Volume of the cylinder is: ")
        .append(String.format("%.2f",this.volume)).toString();
        return r;
    }
}
