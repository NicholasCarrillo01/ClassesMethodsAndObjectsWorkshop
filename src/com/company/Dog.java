package com.company;

public class Dog {


    String  name;
    double  weight;
    boolean fur;
    int     legs;
    String  furColor;
    String  whiskers;





    public Dog(String name, double weight, int legs) {
        this.name = name;
        this.weight = weight;
        this.legs = legs;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getWhiskers() {
        return whiskers;
    }

    public void setWhiskers(String whiskers) {
        this.whiskers = whiskers;
    }
}
