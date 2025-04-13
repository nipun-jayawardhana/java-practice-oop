package org.example;

public class NewPhone extends OldPhone{

    void BrowseInternet(String name1){
        System.out.println("google.com"+name1);

    }




    public static void main(String[]args){
        NewPhone obj2 = new NewPhone();
        obj2.call("nimal");

    }

}
