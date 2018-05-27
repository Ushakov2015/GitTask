package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Введите число a");
    int a = in.nextInt();
    System.out.println("Введите число b");
    int b = in.nextInt();
    System.out.println("Введите знак (+,-,*)");
    String sign = in.next();


      if (sign.equals("+")) {

          System.out.println(Main.Sum(a,b));

      }

        if (sign.equals("-")) {

            System.out.println(Rem(a,b));
        }

        if (sign.equals("*")) {

            System.out.println(Increase(a,b));
        }

    }

    public static int Sum (int a, int b) {

       int Sum = a+b;

       return Sum;

    }

    public static int Rem (int a, int b) {

        int Rem = a+b;

        return Rem;

    }

    public static int Increase (int a, int b) {

        int Increase = a*2;

        return Increase;

    }
}
