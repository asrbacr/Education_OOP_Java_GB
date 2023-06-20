package OOP_GB_4335.Sem7.Decorator;

import java.util.Scanner;

import javax.xml.transform.Result;

public class ViewCalculatorComplexNumber {

    private double real;
    private double imaginary;
    private ComplexNumber calculator = new ComplexNumber(real, imaginary);

    public void run() {
        while (true) {
            double real = promptInt("Введите первое действительно число: ");
            double imaginary = promptInt("Введите первое вещественное число: ");
            ComplexNumber calculator = new ComplexNumber(real, imaginary);
            
            while (true) {
                String cmd = prompt("Введите команду (*, +, /) : ");
                if (cmd.equals("*")) {
                    double real2 = promptInt("Введите второе действительное число: ");
                    double imaginary2 = promptInt("Введите второе вещественное число: ");
                    ComplexNumber number = new ComplexNumber(real2, imaginary2);
                    System.out.print("=\nРезультат ");
                    calculator.multi(number).print();
                    break;
                }
                if (cmd.equals("+")) {
                    double real2 = promptInt("Введите второе действительное число: ");
                    double imaginary2 = promptInt("Введите второе вещественное число: ");
                    ComplexNumber number = new ComplexNumber(real2, imaginary2);
                    System.out.print("=\nРезультат ");
                    calculator.sum(number).print();
                    break;
                }
                if (cmd.equals("/")) {
                    double real2 = promptInt("Введите второе действительное число: ");
                    double imaginary2 = promptInt("Введите второе вещественное число: ");
                    ComplexNumber number = new ComplexNumber(real2, imaginary2);
                    System.out.print("=\nРезультат ");
                    calculator.division(number).print();
                    break;
                }
                // if (cmd.equals("=")) {
                //     ComplexNumber result = calculator;
                //     // System.out.printf("Результат %d\n", result);
                //     result.print();
                //     break;
                // }
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