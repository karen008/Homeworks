package Collections;

import java.util.Comparator;

public class AgeCompare implements Comparator<CollectionsStudent> {
    @Override
    public int compare(CollectionsStudent s1, CollectionsStudent s2) {
        return s2.getAge()-s1.getAge();
    }
}
