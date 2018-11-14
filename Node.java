package com.company;

import org.omg.CORBA.NO_IMPLEMENT;

import java.util.ArrayList;

public class Node implements Comparable<Node>{


    String nameNode;
    String nameParent;
    ArrayList<Path>paths;
    boolean ischeese;
    public int step;
    int costUCS=0;
    Point p;

    public Node(String nameNode, ArrayList<Path> paths, boolean ischeese,Point p) {
        this.nameNode = nameNode;
        this.paths = paths;
        this.ischeese = ischeese;
        this.p=p;
        index.add(nameNode);
        step=0;
        nameParent="";
    }


    public void setNameNode(String nameNode) {
        this.nameNode = nameNode;
    }


    public void setIscheese(boolean ischeese) {
        this.ischeese = ischeese;
    }

    public String getNameNode() {
        return nameNode;
    }



    public boolean isIscheese() {
        return ischeese;
    }
    public static ArrayList<String>index=new ArrayList<>();

    @Override
    public int compareTo(Node o) {
        int A1=this.costUCS+MyMath.manhattanDistance(this.p,new Point(1,-1,0));
        int A2=o.costUCS+MyMath.manhattanDistance(o.p,new Point(1,-1,0));

        if(A1>A2)return 1;
        if(A1<A2)return -1;
        return 0;
        /*
        if(o.costUCS<costUCS)return 1;
        if(o.costUCS>costUCS)return -1;
        return 0;*/
    }
}
