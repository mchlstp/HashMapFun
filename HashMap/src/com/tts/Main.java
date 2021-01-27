package com.tts;

import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


//        System.out.println(MikesCarLot);

        carSearch();




    }

    public static void  carSearch() {
        HashMap<String, String> MikesCarLot = new HashMap<>();
        MikesCarLot.put("Toyota", "4runner");
        MikesCarLot.put("Honda", "Civic");
        MikesCarLot.put("Kia", "Sorento");
        MikesCarLot.put("Hyundai", "Elantra");
        MikesCarLot.put("Acura", "MDX");



        // Create a Scanner object
        Scanner whatCar = new Scanner(System.in);
        System.out.println("What model car are you looking for? ");


        String next = whatCar.nextLine();

        if ( MikesCarLot.containsKey(next)){
            System.out.println("We have plenty of those right over here!");


        } else {

            System.out.println("We're sorry for the inconvenience. Check" +
                    " back tomorrow for new inventory" +
                    ".\n");
//            System.exit(0);


        }

    }



}


