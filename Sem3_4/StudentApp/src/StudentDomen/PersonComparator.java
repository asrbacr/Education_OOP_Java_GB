package StudentDomen;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultCompating = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultCompating == 0){
            resultCompating = o1.getSecondName().compareTo(o2.getSecondName());
            return resultCompating;
        }
        else {
            return resultCompating;
        }
    }
}
