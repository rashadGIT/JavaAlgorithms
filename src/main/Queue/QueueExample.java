package main.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++){
            queue.add(i * 2);
        }

        System.out.println("Elements of queue " + queue);

        System.out.println("removed element - " + queue.remove());

        System.out.println(queue);

        System.out.println("head of queue - " + queue.peek());

        System.out.println("Size of queue - " + queue.size());
    }
}
