package com.company;

public class bird {


    public bird(String name, int wings, double weight, boolean feathers) {
        this.name = name;
        this.wings = wings;
        this.weight = weight;
        this.feathers = feathers;
    }

    String  name;
     int     wings;
     double  weight;
     String  featherColor;
     boolean feathers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }
}
