package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class function {

    int words = 0;

    public void Function() throws FileNotFoundException {

        File text = new File("C:\\Users\\kakak_000\\IdeaProjects\\untitled5\\src\\com\\company\\lexikon.txt"); 
        Scanner scnr = new Scanner(text); 
        int i;
        HashMap<String, String> lexikon; 
        lexikon = new HashMap<String, String>(); 
        System.out.print("Skriv in ett värde i consolen: ");
        for (i = 0; i < testing(); i++) { 


            String line = scnr.nextLine(); 
            String[] arr = line.split("\\s+"); 
            arr[0] = arr[0].toLowerCase(); 
            arr[1] = arr[1].toLowerCase();

            lexikon.put(arr[0].toLowerCase(), arr[1].toLowerCase()); 
            lexikon.put(arr[1].toLowerCase(), arr[0].toLowerCase()); 

        }

        while (true) { 
            Scanner sc = new Scanner(System.in);

            String input = sc.next().toLowerCase(); 
            lexikon.get(input); 
            if (lexikon.get(input) == null) { 
                System.out.println("ERROR: Tyvärr, ditt ord finns inte i den Svensk-Engelska ordlistan!"); 


            } else { 
                System.out.println("Ordet " + input + " översätts till " + lexikon.get(input)); 

            }

        }

    }

    public int testing() throws FileNotFoundException
    {
        File file = new File("C:\\Users\\kakak_000\\IdeaProjects\\untitled5\\src\\com\\company\\lexikon.txt");
        Scanner in = new Scanner(file);



        while(in.hasNextLine())
        {
            in.nextLine();
            words++;

            return words;
        }

    }
}















