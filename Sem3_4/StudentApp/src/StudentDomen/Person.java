package StudentDomen;

public class Person {
    private String personName;
    private String secondName;
    private int age;


    /**
     * Конструктор класса 
     * @param personName - имя
     * @param secondName - фамилия
     * @param age - возраст
     */
    public void Person(String personName, String secondName, int age){
        this.personName=personName;
        this.secondName=secondName;
        this.age=age;
    }

    

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
    
}
