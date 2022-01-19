package Homework.task_2;

import java.util.Comparator;

public class NameComparator implements Comparator<Gem> {
    @Override
    public int compare(Gem o1, Gem o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
