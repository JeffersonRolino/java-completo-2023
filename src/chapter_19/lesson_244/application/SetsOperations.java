package chapter_19.lesson_244.application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetsOperations {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Set<Integer> b = new TreeSet<>(Arrays.asList(4, 5, 6, 7, 8, 9, 10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        //difference
        Set<Integer> f = new TreeSet<>(b);
        f.removeAll(a);
        System.out.println(f);
    }
}
