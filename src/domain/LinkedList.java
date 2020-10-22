package domain;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public int value;
    public LinkedList next = null;

    public LinkedList(int value) {
        this.value = value;
    }

    public void addMany(int[] values) {
        LinkedList current = this;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new LinkedList(value);
            current = current.next;
        }
    }

    public List<Integer> getNodesInArray() {
        List<Integer> nodes = new ArrayList<Integer>();
        LinkedList current = this;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }
}
