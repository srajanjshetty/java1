package V11;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class c2 {
    public static void main(String[] args) {


    PriorityQueue<String> p=new PriorityQueue<>();
        p.offer("aaa");
        p.offer("bbb");
        p.offer("ccc");
        p.offer("ddd");
        p.offer("eee");
        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p.element());
        System.out.println(p.remove("aaa"));

        //deque
        PriorityQueue<String> d=new PriorityQueue<>();

}
}
