package com.company;

import java.util.ArrayList;
import java.util.LinkedList;


public class BFS {


    public static int lengthPath(ArrayList<Node> Graph,String start,String gool){
        boolean visited[]=new boolean[Graph.size()];
        LinkedList<String> queue = new LinkedList<String>();
        visited[Node.index.indexOf(start)]=true;
        queue.add(start);
        while (!queue.isEmpty()){

            String curr=queue.pop();
            int indexNode=Node.index.indexOf(curr);
            Node node=Graph.get(indexNode);
            if(node.nameNode.equals(gool))return node.step;
            for(int i=0;i<node.paths.size();i++){
                if(Node.index.indexOf(node.paths.get(i).Targ)>=0&&
                        visited[Node.index.indexOf(node.paths.get(i).Targ)]==false){
                    visited[Node.index.indexOf(node.paths.get(i).Targ)]=true;
                    queue.add(node.paths.get(i).Targ);
                    Graph.get(Node.index.indexOf(node.paths.get(i).Targ)).nameParent=curr;
                    Graph.get(Node.index.indexOf(node.paths.get(i).Targ)).step=node.step+1;
                }
            }

        }



        return -1;
    }


    public static void printGraph(ArrayList<Node> Graph){
        System.out.println();
        System.out.println("All Graph");
        for (Node n:Graph) {
            System.out.print(n.nameNode+" --> ");


            for(int i=0;i<n.paths.size();i++){
                System.out.print(n.paths.get(i).Targ+" ");
            }
            System.out.println();
        }
    }

    public void checkCheese(ArrayList<Node> Graph){
        for(Node n: Graph){
            if(n.ischeese){
                System.out.println(n.nameNode);
            }
        }
    }


}
