package Controllers;

import StudentDomen.Teacher;

public interface iUserController<T extends Teacher> {
    void create(String firstName, String secondName, int age);
}
