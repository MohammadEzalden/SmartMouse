package com.company;


import java.util.ArrayList;
import java.util.Stack;


public class DFS {

    public static void checkCheese(ArrayList<Node> Graph, String start) {
        Stack<String> nodeStack = new Stack<>();
        boolean visited[] = new boolean[Graph.size()];
        nodeStack.push(start);
        visited[Node.index.indexOf(start)]=true;

        while (!nodeStack.empty()) {
            String curr = nodeStack.pop();
            int indexNode = Node.index.indexOf(curr);
            Node node = Graph.get(indexNode);
            if (node.ischeese) {
                printPath(Graph,node.nameNode);
                return;
            }
            for (int i = 0; i < node.paths.size(); i++) {
                if(visited[Node.index.indexOf(node.paths.get(i).Targ)]==false) {
                    Graph.get(Node.index.indexOf(node.paths.get(i).Targ)).nameParent=node.nameNode;
                    nodeStack.push(node.paths.get(i).Targ);
                    visited[Node.index.indexOf(node.paths.get(i).Targ)] = true;
                }
            }

        }
    }

    private static void printPath(ArrayList<Node> Graph, String end) {
        String curr=end;
        System.out.println();
        System.out.println("DFS");
        while (!Graph.get(Node.index.indexOf(curr)).nameParent.isEmpty()){
            System.out.print(curr+" <-- ");
            curr=Graph.get(Node.index.indexOf(curr)).nameParent;
        }
        System.out.println(curr);
    }


}
