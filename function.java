package com.company;

import java.io.*;

import java.util.HashMap;
import java.util.Scanner;

public class function {
String file = "C:\\Users\\kakak_000\\IdeaProjects\\untitled5\\src\\com\\company\\lexikon.txt";

    public void counter() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner scnr = new Scanner(file);
        HashMap<String, String> lexikon; // Jag "skapar" oldlistan/HashMap'en "lexikon"
        lexikon = new HashMap<String, String>(); // Jag berättar att min ordlista lexikon ska ta två Strings
        int count = 0;
        String line = scnr.nextLine();
        while ((line = br.readLine()) != null) {

            String[] arr = line.split("\\s+"); // Här delar jag upp raden i 2 arrays(arr[0] och arr[1], tack vare mellanslaget som är mellan orden
            arr[0] = arr[0].toLowerCase(); // Jag säger till arr[0] att skrivas in i ordlistan med små bokstäver. Detta är endast för att underlätta så man slipper tänka på att skriva orden med stor bokstav osv
            arr[1] = arr[1].toLowerCase();// Jag säger till arr[1] att skrivas in i ordlistan med små bokstäver. Detta är endast för att underlätta så man slipper tänka på att skriva orden med stor bokstav osv

            lexikon.put(arr[0].toLowerCase(), arr[1].toLowerCase()); // Swe - Eng
            lexikon.put(arr[1].toLowerCase(), arr[0].toLowerCase()); // Eng - Swe
        }
        br.close();

        while (true) { // Skapar en while loop för att min scanner inte ska avsluta efter att ha fått gjort sitt
            Scanner sc = new Scanner(System.in); // Jag berättar för min scanner att den ska ta in info ifrån consolen
            System.out.print("Skriv in ett värde i consolen: ");
            String input = sc.next().toLowerCase(); // Jag tar in ett värde ifrån consolen och gör detta till lowercase, att jag tar in den som lowercase, jag kallar detta värde för "input"
            lexikon.get(input); // Jag säger till mitt lexikon att ta in ordet jag nyss skrev in i "input"
            if (lexikon.get(input) == null) { // om den inte hittar en motsvarighet till inputordet i lexikonet så ger programmet svaret "null", jag ändrar svaret till nedan
                System.out.println("ERROR: Tyvärr, ditt ord finns inte i den Svensk-Engelska ordlistan!"); // ändrar null-felmeddelandet till "ERROR: Tyvärr, ditt ord finns inte i den Svensk-Engelska ordlistan!"


            } else { // Om det inte blir ett felmeddelande så skriver jag ut följande
                System.out.println("Ordet " + input + " översätts till " + lexikon.get(input)); // "Ordet MIN-INPUT översätts till ORDETS-MOTSVARIGHET-I-ENGELSKA

            }

        }
    }



        }















