package Perimeter;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b,c;
        System.out.println("Entre firs Width :");
        a=sc.nextInt();

        System.out.println("Enter Height :");
        b=sc.nextInt();

        c=(a+b)*2;
        System.out.println("Perimeter is :"+c);
    }
}
