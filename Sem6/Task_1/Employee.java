package OOP_GB_4335.Sem6.Task_1;

import java.util.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    /**
     * Метод для создания работника.
     * @param name - Имя
     * @param dob - Дата приёма
     * @param baseSalary - Заработная плата
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    
}
