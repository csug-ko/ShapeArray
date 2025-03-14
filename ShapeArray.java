package Shapes;

import java.util.Arrays;

public class ShapeArray{
    
    public Object [] shapearray = new Object[3];
    
    // constructor 
    ShapeArray() {
        double height = 1.2;
        double radius = 1.3;
        shapearray[0] = new Sphere(radius);
        shapearray[1] = new Cone(radius,height);
        shapearray[2] = new Cylinder(height,radius);
    }
   
    public Object [] getArr() {
        return shapearray;
    }

    public static void main(String [] args) {
        Object [] a = new ShapeArray().getArr();

        for(int i = 0; i < 3;i++)
        {
            System.out.println(a[i].toString());
        }
    }

}
