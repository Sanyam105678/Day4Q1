package com.company;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Sanyam",21,499);
        Student s2 = new Student();
        s2.setRoll(2);
        s2.setName("Cosykiddo");
        s2.setAge(22);
        s2.setMarks(600);

        System.out.println("Roll: "+s1.getRoll());
        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());
        System.out.println("Marks: "+s1.getMarks());
        System.out.println("--------------------");
        System.out.println("Roll: "+s2.getRoll());
        System.out.println("Name: "+s2.getName());
        System.out.println("Age: "+s2.getAge());
        System.out.println("Marks: "+s2.getMarks());




    }
}
