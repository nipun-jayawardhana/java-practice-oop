package SuperKeyWord;

class Student{
    int age;
    String school;
    String email;

    Student(int age,String school,String email){
        this.age=age;
        this.school=school;
        this.email=email;
    }
}

class Kamal extends Student{
    Kamal(int age,String school,String email){
        super(age,school,email);//assign super class varables
    }
}




public class Super {
    public static void main(String[] args) {
        Kamal obj =new Kamal(12,"international","kamal@gmail.com");
        System.out.println(obj.school);

    }
}
