package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {

    List<StudentGroup> steamGroup;

    /**
     * Формирование списка групп
     */
    public StudentSteam(List<StudentGroup> steamGroups, int idGroup) {
        idGroup = StudentGroup.getIdGroup;
        this.steamGroup = steamGroup;
    }

    /**
     * Сформировать список групп
     * @return - список групп
     */
    public List<StudentGroup> getSteamGroup() {
        return steamGroup;
    }



    @Override
    public String toString() {
        return "StudentSteam{" +
                "StudentGroup=" + steamGroup +
                ", idGroup=" + StudentGroup.getIdGroup +
                '}';
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < steamGroup.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return steamGroup.get(counter++);
            }
        }
    }

}
