package ThreeDimensionalShapes;

public class Cube {

    private double width;
    private double height;
    private double length;

    public Cube(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getAllArea() {
        return 6 * (width * height);
    }

    public double getArea() {
        return width * height;
    }


}
