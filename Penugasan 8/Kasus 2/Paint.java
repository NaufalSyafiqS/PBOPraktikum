//*****************************************************
// Paint.java//
// Represents a type of paint that has a fixed area
// covered by a gallon. All measurements are in feet.
// *****************************************************
public class Paint {
    private double coverage; // number of square feet per gallon

    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        double area = s.area();
        return area / coverage;
    }
}
