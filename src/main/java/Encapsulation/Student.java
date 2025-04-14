package Encapsulation;

public class Student {

    private String name;
    private int age;

    public void setName(String name){// giving values for creating class
        this.name=name;
    }

    public String getName(){// reading variables names
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }
}
