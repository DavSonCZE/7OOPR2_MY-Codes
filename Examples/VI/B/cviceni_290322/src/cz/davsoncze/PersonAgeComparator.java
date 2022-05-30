package cz.davsoncze;

import java.util.Comparator;

public class PersonAgeComparator  implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() == null)
            return 1;
        if (o2.getAge() == null)
            return -1;
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
