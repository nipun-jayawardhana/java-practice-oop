package FinalKeyword;


    class Parent{
        public void say(){
            System.out.println("hii");
        }
    }
    class Child extends Parent{
        public void say(){
            System.out.println("HEllO");
        }
    }

public class Test1 {
    public static void main(String[] args){
       Child obj = new Child();
       obj.say();
    }

}
