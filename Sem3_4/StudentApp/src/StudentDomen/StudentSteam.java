package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.GroupLayout.Group;

public class StudentSteam implements Iterable<StudentGroup> {

    private List<StudentGroup> streamGroup;
    private int streamNumber;

    /**
     * Формирование списка групп
     */
    public void StudentStream(int streamNumber) {
        this.streamNumber = streamNumber;
        this.streamGroup = new ArrayList<>();
    }

    /**
     * Метод для добавлениие группы в список потока
    */
    public void addGroupStream (StudentGroup group) {
        this.streamGroup.add(group);
    }

    /**
     * Метод возвращает номер потока.
     * @return
     */
    public int getStreamNumber() {
        return streamNumber;
    }

    /**
     * Метод возвращает список групп.
     * @return
     */
    public  List<StudentGroup> getGroups() {
        return streamGroup;
    }


    @Override
    public String toString() {
        return "StudentSteam{" +
                "StudentGroup=" + streamGroup +
                ", idGroup=" + StudentGroup.getIdGroup +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < streamGroup.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return streamGroup.get(counter++);
            }
        }
    }


}
