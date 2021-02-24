package com.company;

public class Main {
    public static void main(String[] args)
    {
        //Zadanie 2

        System.out.println(" ");
        int n1 = 0 , n2 = 1 , n3, i , x;


        x = 20;

        for( i = 2; i < x; i++)
        {
            if( i == 2){
                System.out.print(n1 +" "+ n2);
            }
            n3 = n1 + n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
        }

    }


}