package OOP_GB_4335.Sem6.Task_1;

public class СalculateNetSalary {

    /**
     * Метод для расчёта заработной платы
     * @param baseSalary - Ставка заработной платы
     * @return Размер заработной платы для выплаты работнику
     */
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}
