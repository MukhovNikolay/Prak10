package Prak10;

public class ConcreteFactory implements ComplexAbstractFactory {
    public Complex CreateComplex(int real, int image) {
        return new Complex(real,image);
    }
    public Complex createComplex() {
        return new Complex(5,7);
    }
}
