package main.QueueSort;

import java.util.*;
import java.util.stream.Collectors;

public class QueueSort {
    public static class Task{
        String id;
        int queue;
        int duration;
        Task(String id, int queue, int duration){
            this.id = id;
            this.queue = queue;
            this.duration = duration;
        }
    }

    // You are given a list of tasks with their id, when they will be queued, and how long they will take to execute.
    // When the CPU is not busy, it should execute the task that has been queued that will take the least amount of time.
    // Return the ids in order that they will be executed.

    // Example: [[id1, 0, 10], [id4, 0, 10], [id2, 3, 7], [id3, 6, 3]] -> [id1, id3, id2]
    // Example: [[id1, 0, 10], [id4, 0, 10], [id2, 3, 7], [id3, 6, 3]] -> [id1, id3, id2]
    // Example: [[id1, 0, 10], [id4, 0, 10], [id3, 6, 3], [id2, 3, 7]] -> [id1, id3, id2]
    // Example: [[id2, 3, 7], [id3, 100, 3], [id1, 0, 10]] -> [id1,id2,id3]


    public static void main (String[] args){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("id1", 0, 10));
        tasks.add(new Task("id2", 3, 7));
        tasks.add(new Task("id3", 6, 3));
        tasks.add(new Task("id4", 0, 10));
        System.out.println(getQueueOrder(tasks));
    }

    public static List<String> getQueueOrder(List<Task> tasks){
        List<String> result = new ArrayList<>();
        List<List<Task>> groupby = new ArrayList<>();
        tasks.sort((a,b) -> a.queue + b.queue);
        Queue<Task> queue = new LinkedList<>(tasks);



        tasks.remove(0);
        tasks.sort(Comparator.comparingInt(a -> a.duration));
        //result.add(temp.id);
        result.addAll(tasks.stream().map(x -> x.id).collect(Collectors.toList()));
        return result;
    }

}
