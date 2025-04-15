
public class Geometry {
    
    public static double getAreaRectangle(double width, double length) {
        return width * length;
    }
    
    public static double getAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double getAreaTriangle(double base, double height) {
        return 0.5 * base * height;
    }
    
    public static double getPerimeterRectangle(double width, double length) {
        return 2 * (width + length);
    }
    
    public static double getPerimeterCircle(double radius) {
        return 2 * Math.PI * radius;
    }
    
    public static double getPerimeterTriangle(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}