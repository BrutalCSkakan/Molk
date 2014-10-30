package com.company;

import java.io.*;

import java.util.HashMap;
import java.util.Scanner;

public class function {
    String file = "C:\\Users\\kakak_000\\IdeaProjects\\untitled5\\src\\com\\company\\lexikon.txt";
    String line;
    public void counter() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        HashMap<String, String> lexikon;
        lexikon = new HashMap<String, String>();

        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\s+");
            arr[0] = arr[0].toLowerCase();
            arr[1] = arr[1].toLowerCase();
            lexikon.put(arr[0].toLowerCase(), arr[1].toLowerCase());
            lexikon.put(arr[1].toLowerCase(), arr[0].toLowerCase());
        }
        br.close();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Skriv in ett värde i consolen: ");
            String input = sc.next().toLowerCase();
            lexikon.get(input);
            if (lexikon.get(input) == null) {
                System.out.println("ERROR: Tyvärr, ditt ord finns inte i den Svensk-Engelska ordlistan!");
            }
            else {
                System.out.println("Ordet " + input + " översätts till " + lexikon.get(input));
            }
        }
    }
}















