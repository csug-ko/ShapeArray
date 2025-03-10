package Shapes;

public class Cone extends Shape{
   
    private double coneRadius;
    private double coneHeight;
    private double area;
    private double volume;

// Cone Constructor 
    Cone(double r, double h){
          coneRadius = r;
          coneHeight = h;
          this.surface_area();
          this.volume();
  
    }

// Override the surface area method from Shape
@Override
    double surface_area() {
       this.area = coneRadius * Math.PI * Math.sqrt(coneRadius * coneRadius * coneHeight * coneHeight);
        return this.area;
    }

// Override the volume method from Shape
@Override
    public double volume(){
        this.volume = Math.PI * coneRadius * coneRadius * (coneHeight/3) * (coneHeight %3);
        return this.volume;
    }

// override the toString method 
@Override
    public String toString(){
        String r = new StringBuilder()
        .append("The area of the cone is: ")
        .append(String.format("%.2f",this.area))
        .append("\nThe Volume of the cone is: ")
        .append(String.format("%.2f",this.volume)).toString();
        return r;
    }
}
