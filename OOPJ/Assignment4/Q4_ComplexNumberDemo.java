class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

  
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    public void display() {
        System.out.println(real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i");
    }
}

public class Q4_ComplexNumberDemo {
    public static void main(String[] args) {
  
        ComplexNumber c1 = new ComplexNumber(3, 2);
        ComplexNumber c2 = new ComplexNumber(4, -2);

        ComplexNumber sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        ComplexNumber product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();
    }
}
/*Sum: 7.0 + 0.0i
Product: 16.0 + 2.0i*/