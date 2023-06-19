package OOP_GB_4335.Sem7.Decorator;

import java.util.Scanner;

import javax.xml.transform.Result;

public class ViewCalculatorComplexNumber {

    private int real;
    private int imaginary;
    private ComplexNumber calculator = new ComplexNumber(real, imaginary);

    // public ViewCalculatorComplexNumber(ComplexNumber calculator) {
    //     this.calculator = calculator;
    // }

    public void run() {
        while (true) {
            int real = promptInt("Введите первое действительно число: ");
            int imaginary = promptInt("Введите первое вещественное число: ");
            // calculator.sum(calculator);
            
            // iCalculable calculator = calculableFactory.create(primaryArg);
            
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                // if (cmd.equals("*")) {
                //     int arg = promptInt("Введите второй аргумент: ");
                //     calculator.multi(arg);
                //     continue;
                // }
                if (cmd.equals("+")) {
                    int real2 = promptInt("Введите второе действительное число: ");
                    int imaginary2 = promptInt("Введите второе вещественное число: ");
                    ComplexNumber number = new ComplexNumber(real2, imaginary2);
                    calculator.sum(number);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator;
                    // System.out.printf("Результат %d\n", result);
                    System.out.printf("Результат ");
                    result.print();
                    break;
                }
            }

            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}