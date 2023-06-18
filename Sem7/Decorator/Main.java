package OOP_GB_4335.Sem7.Decorator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        //iCalculable calculator = new Calculator(0);
        // iCalculable calculator = new CalcDecorator(new Calculator(0),new Logger());
        // ViewCalculator view = new ViewCalculator(calculator);
        // view.run();
        ComplexNumber namb = new ComplexNumber(1, 2);
        ComplexNumber numb = new ComplexNumber(3, -4);
        namb.sum(numb).print();
    }
}
