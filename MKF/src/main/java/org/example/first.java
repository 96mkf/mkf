package org.example;

import java.lang.*;
import java.util.*;

class First
{
    public static void main(String[] args)
    {
        String name;

        Scanner sc=new Scanner (System.in);

        System.out.println("May I Know Your Name");
        name=sc.nextLine();

        System.out.println("welcome "+name);
    }
}
