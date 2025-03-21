class Box {
    private double height;
    private double width;
    private double breadth;

    public Box(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getVolume() {
        return height * width * breadth;
    }

    public double getArea() {
        return 2 * (height * width + width * breadth + height * breadth);
    }

    public void displayDetails() {
        System.out.println("Box Dimensions: " + height + " x " + width + " x " + breadth);
        System.out.println("Volume: " + getVolume() + " cubic units");
        System.out.println("Surface Area: " + getArea() + " square units");
        System.out.println();
    }
}

public class Q3_BoxDemo {
    public static void main(String[] args) {

        Box box1 = new Box(10, 12, 15);
        Box box2 = new Box(8, 10, 12);

        box1.displayDetails();
        box2.displayDetails();
    }
}
/*Box Dimensions: 10.0 x 12.0 x 15.0
Volume: 1800.0 cubic units
Surface Area: 900.0 square units

Box Dimensions: 8.0 x 10.0 x 12.0
Volume: 960.0 cubic units
Surface Area: 592.0 square units*/