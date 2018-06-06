package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat myCat = new Cat("Crystal" ,"Abby", 3, 'b', "Pikeville", true, 10.5);

        System.out.println("the name of my cat is abby: " + myCat.getPetName());


        myCat.setWhiskers(true);
        System.out.println("does this cat have whiskers?" + myCat.isWhiskers());

        System.out.println(myCat.makeSound());

        System.out.println(myCat.catYears());



    }
}
