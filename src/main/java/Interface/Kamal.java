package Interface;

public class Kamal implements Student {

    public void eat(){
        System.out.println("Eating");
    }

    public void drink(){
        System.out.println("Drink");
    }

    public void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Kamal obj = new Kamal();
        obj.eat();
        System.out.println(Student.number);
        Student x = new Kamal(); //calling interface
        x.drink();

    }
}
