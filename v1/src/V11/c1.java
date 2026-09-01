package V11;

import java.util.TreeSet;

public class c1 {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        t.add(50);
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet(25));
        System.out.println(t.tailSet(25));
    }
}
