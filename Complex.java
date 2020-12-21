package Prak10;

public class Complex {
    public double real;
    public double image;
    Complex(double real,double image){
         this.real = real;
         this.image = image;
    }
    public String getComplex(){
        return (real+" + "+image+"i");
    }
}
