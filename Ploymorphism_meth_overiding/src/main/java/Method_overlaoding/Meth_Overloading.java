package Method_overlaoding;

public class Meth_Overloading {

    public void  meth(){
        System.out.println("method1");
    }

    public void  meth(int x){
        System.out.println("method2");
    }

    public void  meth(int x,int y){
        System.out.println("method2");
    }


    public static void main(String[] args) {
       Meth_Overloading obj = new Meth_Overloading();
       obj.meth();
       obj.meth(10);
       obj.meth(10,20);  //should change count of parameters
    }
}
