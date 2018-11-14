package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /**ArrayList<Node>nodes=new ArrayList<>();
        ArrayList<String>adj=new ArrayList<>();
        ArrayList<Path>paths=new ArrayList<>();

        paths.add(new Path("m1","m2",3));
        paths.add(new Path("m1","m4",2));
        paths.add(new Path("m1","D1",5));
        nodes.add(new Node("m1",paths,false));

        paths=new ArrayList<>();
        paths.add(new Path("m3","m2",4));
        paths.add(new Path("m3","m4",6));
        paths.add(new Path("m3","D1",3));
        nodes.add(new Node("m3",paths,false));

        paths=new ArrayList<>();
        paths.add(new Path("m2","m1",3));
        paths.add(new Path("m2","m3",4));
        paths.add(new Path("m2","D1",1));
        nodes.add(new Node("m2",paths,false));

        paths=new ArrayList<>();
        paths.add(new Path("m4","m1",2));
        paths.add(new Path("m4","m3",6));
        paths.add(new Path("m4","D1",9));
        nodes.add(new Node("m4",paths,false));


        paths=new ArrayList<>();
        paths.add(new Path("D1","m1",5));
        paths.add(new Path("D1","m3",3));
        paths.add(new Path("D1","m2",1));
        paths.add(new Path("D1","m4",9));
        nodes.add(new Node("D1",paths,true));//exist cheese


        System.out.println("BFS from m1 to m3 = "+
                BFS.lengthPath(nodes,"m1","m3"));

        BFS.printGraph(nodes);

        DFS.checkCheese(nodes,"m1");

        UCS.lengthPath(nodes,"m1","m3");
        */

        /************************************/

        ArrayList<Node>nodes=new ArrayList<>();
        ArrayList<String>adj=new ArrayList<>();
        ArrayList<Path>paths=new ArrayList<>();

        paths.add(new Path("m1","m2",7));
        paths.add(new Path("m1","m4",1));
        paths.add(new Path("m1","D2",8));
        nodes.add(new Node("m1",paths,false,new Point(1,0,1)));

        paths=new ArrayList<>();
        paths.add(new Path("m3","m2",1));
        paths.add(new Path("m3","m4",6));
        paths.add(new Path("m3","D2",5));
        nodes.add(new Node("m3",paths,false,new Point(-1,0,1)));

        paths=new ArrayList<>();
        paths.add(new Path("m2","m1",7));
        paths.add(new Path("m2","m3",1));
        paths.add(new Path("m2","D2",1));
        nodes.add(new Node("m2",paths,false,new Point(0,1,1)));

        paths=new ArrayList<>();
        paths.add(new Path("m4","m1",1));
        paths.add(new Path("m4","m3",6));
        paths.add(new Path("m4","D2",1));
        nodes.add(new Node("m4",paths,false,new Point(0,-1,1)));

        paths=new ArrayList<>();
        paths.add(new Path("D2","m1",8));
        paths.add(new Path("D2","m3",5));
        paths.add(new Path("D2","m2",1));
        paths.add(new Path("D2","m4",1));
        paths.add(new Path("D2","D1",10));
        nodes.add(new Node("D2",paths,true,new Point(0,0,1)));//exist cheese

        //D1
        paths=new ArrayList<>();
        paths.add(new Path("w1","w2",3));
        paths.add(new Path("w1","D1",3));
        nodes.add(new Node("w1",paths,false,new Point(1,1,0)));

        paths=new ArrayList<>();
        paths.add(new Path("w2","w1",3));
        paths.add(new Path("w2","w3",3));
        paths.add(new Path("w2","D1",3));
        nodes.add(new Node("w2",paths,false,new Point(0,1,0)));

        paths=new ArrayList<>();
        paths.add(new Path("w3","w2",3));
        paths.add(new Path("w3","D1",3));
        nodes.add(new Node("w3",paths,false,new Point(-1,1,0)));

        paths=new ArrayList<>();
        paths.add(new Path("w4","w5",6));
        paths.add(new Path("w4","D1",5));
        nodes.add(new Node("w4",paths,false,new Point(-1,-1,0)));

        paths=new ArrayList<>();
        paths.add(new Path("w5","w6",7));
        paths.add(new Path("w5","w4",6));
        paths.add(new Path("w5","D1",1));
        nodes.add(new Node("w5",paths,false,new Point(0,-1,0)));

        paths=new ArrayList<>();
        paths.add(new Path("w6","w5",7));
        paths.add(new Path("w6","D1",2));
        nodes.add(new Node("w6",paths,false,new Point(1,-1,0)));

        paths=new ArrayList<>();
        paths.add(new Path("D1","w1",3));
        paths.add(new Path("D1","w2",3));
        paths.add(new Path("D1","w3",3));
        paths.add(new Path("D1","w4",5));
        paths.add(new Path("D1","w5",1));
        paths.add(new Path("D1","w6",2));
        paths.add(new Path("D1","D2",10));
        nodes.add(new Node("D1",paths,false,new Point(0,0,0)));


        System.out.println("BFS from m1 to m3 = "+
                BFS.lengthPath(nodes,"m1","m3"));

        BFS.printGraph(nodes);

        DFS.checkCheese(nodes,"m1");

        UCS.lengthPath(nodes,"w2","w6");

    }
}
