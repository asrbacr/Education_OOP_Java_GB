package OOP_GB_4335.Sem7.Decorator;

public class ComplexNumber {
    double real;
    double imaginary;
    
    public  ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // public void setReal(double real) {
    //     this.real = real;
    // }

    // public void setImaginary(double imaginary) {
    //     this.imaginary = imaginary;
    // }
     
    
    // @Override
   public double getReal() {
        return real;
    }
    
    // @Override
    public double getImaginary() {
        return imaginary;
    }

    // @Override
    public ComplexNumber sum(ComplexNumber arg) {
        double real2 = arg.getReal();
        double imaginary2 = arg.getImaginary();
        double realNew = real + real2;
        double imaginaryNew = imaginary + imaginary2;
        ComplexNumber result = new ComplexNumber(realNew, imaginaryNew);
        return result;
    }
    
    // @Override
    public ComplexNumber multi(ComplexNumber arg) {
        double real2 = arg.getReal();
        double imaginary2 = arg.getImaginary();
        double realNew = real * real2 + (-1) * imaginary * imaginary2;
        double imaginaryNew = real * imaginary2 + real2 * imaginary;
        ComplexNumber result = new ComplexNumber(realNew, imaginaryNew);
        return result;
    }
    
    // @Override
    public ComplexNumber division(ComplexNumber arg) {
        double real2 = arg.getReal();
        double imaginary2 = arg.getImaginary();
        double realNewDelim = real * real2 + imaginary * imaginary2;
        double imaginaryNewDelim = (-1) * real * imaginary2 + real2 * imaginary;
        double valueDelit = real2 * real2 + imaginary2 * imaginary2;
        double realNew = realNewDelim / valueDelit;
        double imaginaryNew = imaginaryNewDelim / valueDelit;
        ComplexNumber result = new ComplexNumber(realNew, imaginaryNew);
        return result;
    }

    public void print() {
        if (imaginary > 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else if (imaginary < 0) {
            System.out.println(real + " - " + imaginary * (-1) + "i");
        } else {
            System.out.println(real);
        }
    }


}
