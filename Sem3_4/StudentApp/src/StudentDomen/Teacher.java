package StudentDomen;

public class Teacher extends Person{
    private String acadDegree;
    private int count;
    public Teacher(String firstName, String secondName, int age, int count) {
        super(firstName, secondName, age);
        this.count = count;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + super.firstName + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + count +
                '}';
    }
    public String getAcadDegree() {
        return acadDegree;
    }
    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}