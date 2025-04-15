package org.example;

import Encapsulation.Student;

import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args){
        Student obj = new Student();
        obj.setName("kamal");
        System.out.println(obj.getName());
        obj.setAge(25);
        System.out.println(obj.getAge());
    }

}