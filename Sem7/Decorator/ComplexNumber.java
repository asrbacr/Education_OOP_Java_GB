package OOP_GB_4335.Sem7.Decorator;

public class ComplexNumber {
    int real;
    int imaginary;
    
    public  ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // public void setReal(int real) {
    //     this.real = real;
    // }

    // public void setImaginary(int imaginary) {
    //     this.imaginary = imaginary;
    // }
     
    
    // @Override
   public int getReal() {
        return real;
    }
    
    // @Override
    public int getImaginary() {
        return imaginary;
    }

    // @Override
    public ComplexNumber sum(ComplexNumber arg) {
        int real2 = arg.getReal();
        int imaginary2 = arg.getImaginary();
        int realNew = real + real2;
        int imaginaryNew = imaginary + imaginary2;
        ComplexNumber result = new ComplexNumber(realNew, imaginaryNew);
        return result;
    }
    
    // @Override
    public ComplexNumber multi(ComplexNumber arg) {
        int real2 = arg.getReal();
        return null;
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
