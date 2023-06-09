package StudentDomen;

/**
 * Класс для создания препадователя, принимает на вход:
 * @param firstName - Имя
 * @param secondName - Фамилия
 * @param age - Возраст
 * @param count - Номер / id
 */
public class Teacher extends Person{
    private String acadDegree;
    private int count;
    public Teacher(String firstName, String secondName, int age, int count) {
        super(firstName, secondName, age);
        this.count = count;
    }

    /**
     * @return acadDegree
     */
    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    /**
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     * метод toString()
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + super.firstName + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + count +
                '}';
    }
}