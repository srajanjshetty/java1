package V11;

import java.util.PriorityQueue;

public class c3 {
    public static void main(String[] args) {
        PriorityQueue<String> d=new PriorityQueue<>();
        d.offer("aaa");
        d.offer("bbb");
        d.offer("ccc");
        d.offer("ddd");
        d.offer("eee");
        System.out.println(d);
        System.out.println(d.peek());
        System.out.println(d.poll());
        System.out.println(d.element());
        System.out.println(d.remove("aaa"));
    }
}
