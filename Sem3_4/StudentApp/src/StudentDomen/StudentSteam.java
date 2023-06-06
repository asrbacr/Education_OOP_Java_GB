package StudentDomen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * представляет поток студентов и содержит поле`streamNumber` - номер потока, 
 * и список `groups` - список учебных групп,представленных объектами класса `StudentGroup`.
 * 
 */
public class StudentSteam implements Iterable<StudentGroup> {

    private int streamNumber;
    private List<StudentGroup> groups;

    public StudentSteam(int streamNumber) {
        this.streamNumber = streamNumber;
        this.groups = new ArrayList<>();
    }

    /*
     * Метод `addGroup(StudentGroup group)` добавляет группу в список групп потока.
     */
    public void addGroup(StudentGroup group) {
        this.groups.add(group);
    }

    /*
     * Метод `getStreamNumber()` возвращает номер потока, а метод `getGroups()`
     * возвращает список групп.
     */
    public int getStreamNumber() {
        return streamNumber;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    /*
     * Интерфейс `Iterable` был реализован, поэтому в классе `StudentStream`
     * былреализован метод `iterator()`,
     * который возвращает итератор для списка групп.
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < groups.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return groups.get(counter++);
            }
        };
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "StudentGroup=" + groups +
                ", idGroup=" + StudentGroup.getIdGroup +
                '}';
    }

}
