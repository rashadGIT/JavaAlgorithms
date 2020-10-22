package main.RemoveKNodeFromEnd;

import domain.LinkedList;

public class RemoveKNodeFromEnd {
    public static void main (String[] args){
        LinkedList test = new LinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        removeKthNodeFromEnd(test,4);
    }

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        int counter = 1;
        LinkedList first = head;
        LinkedList second = head;
        while (counter <= k){
            second = second.next;
            counter++;
        }
        if(head != null && second == null){
            head.value = head.next.value;
            head.next = head.next.next;
        }
        while(second != null && second.next != null){
            second = second.next;
            first = first.next;
        }
        if(first != null) first.next = first.next.next;
    }
}
