package day32collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.add(12);
        dq.add(3);
        dq.add(15);
        dq.add(33);
        dq.add(25);
        System.out.println(dq);
    }
}
