package Collections;

import java.util.Comparator;

public class FirstNameCompare implements Comparator<CollectionsStudent> {
    @Override
    public int compare(CollectionsStudent s1, CollectionsStudent s2) {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}
