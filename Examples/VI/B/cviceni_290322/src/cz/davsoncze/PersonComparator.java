package cz.davsoncze;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private boolean desc; // == true -> seřazení sestupně, ==false -> seřazení vzestupně

    public void setOrderDescending(boolean desc) {
        this.desc = desc;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (desc) {
            return compare2(o2, o1);
        }
        else {
            return compare2(o1, o2);
        }
    }

    public int compare2(Person o1, Person o2) {
        int result;

        result = o1.getSurname().compareTo(o2.getSurname());
        if (result != 0)
            return result;
        else {
            result = o1.getName().compareTo(o2.getName());
            if (result != 0)
                return result;

            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
