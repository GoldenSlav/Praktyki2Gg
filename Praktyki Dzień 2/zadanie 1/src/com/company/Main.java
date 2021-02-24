package com.company;

public class Main {
    private static int PierwszaLiteraAlfabetu;

    public static void main(String[] args)
    {
        //Zadanie 1 Pętle
        //Napisz pętle, która wypisze znaki(A-Z) z tabeli , wynikiem mają być wypisane znaki (co drugi!)
        char PierwszaLitera = 'A';

        for (int i = 0; i < 26; i++)
        {
            if ( i % 2 == 0)
                System.out.print(PierwszaLiteraAlfabetu + "\t");
            PierwszaLiteraAlfabetu++;
        }

    }
}