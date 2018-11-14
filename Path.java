package com.company;

public class Path{


    String Curr;
    String Targ;
    int cost;

    public Path(String curr, String targ, int cost) {
        Curr = curr;
        Targ = targ;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCurr() {
        return Curr;
    }

    public String getTarg() {
        return Targ;
    }

    public void setCurr(String curr) {
        Curr = curr;
    }

    public void setTarg(String targ) {
        Targ = targ;
    }


}
