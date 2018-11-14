package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class UCS {

    public static void lengthPath(ArrayList<Node> Graph, String start, String gool){
        boolean visited[]=new boolean[Graph.size()];
        PriorityQueue<Node> queue= new PriorityQueue<>();
        Node node;
        String curr = "";
        int indexNode;
        int min=Integer.MAX_VALUE;

        // get first node
        indexNode=Node.index.indexOf(start);
        node=Graph.get(indexNode);
        // put it visited
        visited[Node.index.indexOf(start)]=true;

        // add it to queue
        queue.add(node);



        while (!queue.isEmpty()){

            curr=queue.poll().nameNode;
            indexNode=Node.index.indexOf(curr);
            node=Graph.get(indexNode);


            for(int i=0;i<node.paths.size();i++){
                if(Node.index.indexOf(node.paths.get(i).Targ)>=0&&
                        visited[Node.index.indexOf(node.paths.get(i).Targ)]==false){
                    // put it visited
                    visited[Node.index.indexOf(node.paths.get(i).Targ)]=true;
                    // edit cost node
                    Graph.get(Node.index.indexOf(node.paths.get(i).Targ)).costUCS
                            =node.costUCS+node.paths.get(i).cost;

                    Graph.get(Node.index.indexOf(node.paths.get(i).Targ)).nameParent
                            =curr;
                    queue.add(Graph.get(Node.index.indexOf(node.paths.get(i).Targ)));

                }
                else if(Node.index.indexOf(node.paths.get(i).Targ)>=0&&
                        visited[Node.index.indexOf(node.paths.get(i).Targ)]==true&&
                        node.costUCS+node.paths.get(i).cost<
                        Graph.get(Node.index.indexOf(node.paths.get(i).Targ)).costUCS){
                    // delete it from queue
                    queue.remove(Graph.get(Node.index.indexOf(node.paths.get(i).Targ)));

                    // edit it then add to queue again
                    Graph.get(Node.index.indexOf(node.paths.get(i).Targ)).nameParent
                            =curr;
                    Graph.get(Node.index.indexOf(node.paths.get(i).Targ)).costUCS
                    =node.costUCS+node.paths.get(i).cost;

                    queue.add(Graph.get(Node.index.indexOf(node.paths.get(i).Targ)));
                }
            }

        }

        printPath(Graph.get(Node.index.indexOf(gool)),Graph, start);
        return ;
    }

    private static void printPath(Node node, ArrayList<Node> Graph, String start) {
        System.out.println();
        System.out.println("UCS = "+node.costUCS);
        while (!node.nameParent.equals(start)){
            System.out.print(node.nameNode+ " <-- ");
            node=Graph.get(Node.index.indexOf(node.nameParent));
        }
        System.out.println(node.nameNode+" <-- "+start);
        return;
    }
}
