package OOP_GB_4335.Sem6.Task_1;

import java.util.Date;

public class GetEmpInfo {
    
    /**
     * Метод для печати данных о приёме работника
     * @param name - Имя
     * @param dob - Дата приёма
     * @return По форме: Имя, Дата приёма
     */
    public String getEmpInfo(String name, Date dob) {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
