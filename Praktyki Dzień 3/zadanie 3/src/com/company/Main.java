package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        System.out.println("Jesteś zamknięty w więzieniu.");
        System.out.println("Strażnik który cię pilnuję osuwa się na ziemię i zasypia.");
        System.out.println("Podchodzisz po cichu i zabierasz mu klucze które miał przypięte do pasa.");
        System.out.println("Ma on 5 kluczy.");
        
        while(programIsRunning)
        {

            System.out.println("Pytanie teraz który pasuje do drzwi od celi... Musisz wybrać:");
            String userInput = sc.next();

            switch (userInput)
            {
                case "1": {
                    System.out.println("Ten klucz nie pasuje!");
                    break;
                }
                case "2": {
                    System.out.println("Ten klucz nie pasuje!");
                    break;
                }
                case "3": {
                    programIsRunning = false;
                    break;
                }
                case "4": {
                    System.out.println("Ten klucz nie pasuje!");
                    break;
                }
                case "5": {
                    System.out.println("Ten klucz nie pasuje!");
                    break;
                }
                default: {
                    System.out.println("Strażnik się budzi spowodowany hałasem który zrobiłeś. Zabiera Ci klucze i zamyka w ciemni. Już nigdy się stąd nie wydostaniesz...");
                }
            }
        }

        System.out.println("Wkładasz klucz do zamka.");
        System.out.println("Przekręcasz powoli tak aby strażnik nie usłyszał i się nie obudził.");
        System.out.println("Słyszysz charakterystyczne 'kliknięcie' w drzwiach.");
        System.out.println("Bierzesz głęboki oddech i popychasz drzwi.");
        System.out.println("Te zaczynają się otwierać. Jesteś wolny. Gratulacje ");
    }
}