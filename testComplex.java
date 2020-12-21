package Prak10;

public class testComplex {
    public static void main(String[]args){
        double real;
        double image;
        ConcreteFactory F1 = new ConcreteFactory();
        Complex c1 = F1.CreateComplex(2,6);
        System.out.println(c1.getComplex());
        c1=(F1.createComplex());
        System.out.println(c1.getComplex());
    }
}
