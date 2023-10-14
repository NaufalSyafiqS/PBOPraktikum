public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) { // New constructor with radius and color parameters
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public String getColor() { // New getter for color
        return color;
    }

    public void setColor(String c) { // New setter for color
        color = c;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}

//In this modified version, I've added a new constructor Circle(double r, String c) 
// which takes both radius and color as parameters. 
// I've also added a getter getColor() and a setter setColor(String c) for the color variable.