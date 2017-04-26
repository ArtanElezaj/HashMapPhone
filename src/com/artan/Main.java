package com.artan;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> hash = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<n; i++){

            String name = scanner.nextLine();
            int phoneNumber = scanner.nextInt();
            scanner.nextLine();
            hash.put(name,phoneNumber);
        }

        while(scanner.hasNext()){
            String s = scanner.nextLine();

            try {
                int out = hash.get(s);
                System.out.println(s + " = " + out);
            } catch (Exception e) {
                System.out.println("Not found!");
            }

        }


    }
}
