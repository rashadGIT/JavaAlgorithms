package domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    String name;
    List<Node> children = new ArrayList<>();
    public int value;
    public Node prev;
    public Node next;

    public Node(String name) {
        this.name = name;
    }

    public Node(int value) {
        this.value = value;
    }

    public List<String> breadthFirstSearch(List<String> array) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()){
            Node current = queue.remove();
            array.add(current.name);
            queue.addAll(current.children);
        }
        return array;
    }

    public List<String> depthFirstSearch(List<String> array) {
        array.add(this.name);
        for (Node aChildren : this.children) {
            aChildren.depthFirstSearch(array);
        }
        return array;
    }

    public Node addChild(String name) {
        Node child = new Node(name);
        children.add(child);
        return this;
    }

    public static boolean compare(List<String> arr1, String[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (!arr1.get(i).equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static Node TestNode (){
        Node graph = new Node("A");
        graph.addChild("B").addChild("C").addChild("D");
        graph.children.get(0).addChild("E").addChild("F");
        graph.children.get(2).addChild("G").addChild("H");
        graph.children.get(0).children.get(1).addChild("I").addChild("J");
        graph.children.get(2).children.get(0).addChild("K");
        return graph;
    }

}
