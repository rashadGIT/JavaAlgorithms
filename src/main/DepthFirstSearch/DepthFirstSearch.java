package main.DepthFirstSearch;

import domain.Node;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    public static void main(String[] args) {
        Node graph = Node.TestNode();
        List <String> array = new ArrayList<>();
        System.out.println(graph.depthFirstSearch(array));
    }
}
