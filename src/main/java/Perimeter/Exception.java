package Perimeter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, z;

        try {
            System.out.println("Enter width :");
            x = sc.nextInt();

            System.out.println("Enter width :");
            y = sc.nextInt();

            z = (x + y) * 2;
            System.out.println("Perimeter is : "+z);
        }

        catch(ArithmeticException e){
            System.out.println("can not devide by zero :");
        }
        catch(InputMismatchException e){
            System.out.println("plese enter integer value  :");
        }
        finally{
            System.out.println("bye");
        }


    }
}