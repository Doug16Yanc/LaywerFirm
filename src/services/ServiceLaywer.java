package services;

import entities.Laywer;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServiceLaywer {

    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final Map<Laywer, Long> laywers = new HashMap<>();

    public static int generateId() {
        Random random = new Random();
        Long enter;

        do {
            enter = (long) (random.nextInt(900000) + 100000);
        } while (idMap.containsKey(enter));

        idMap.put(enter, true);
        return Math.toIntExact(enter);
    }
    public static int recordLaywer(){
        /*
        Utility.printMessage("Welcome to the lawyer registration page in the system. Please fill out the form" +
                " below to register as a lawyer. If you already have an account, you can log in here. " +
                "Thank you for choosing our platform.\"); */

        Long codeLaywer = (long) generateId();

        System.out.println("OAB laywer:");
        Long oab = sc.nextLong();
        sc.nextLine();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Address :");
        String address = sc.nextLine();
        System.out.println("District: ");
        String district = sc.nextLine();
        System.out.println("Zip code: ");
        String zipcode = sc.nextLine();
        System.out.println("telephone number: ");
        String telephone = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();

        Laywer laywer = new Laywer(codeLaywer, oab, name, address, district, zipcode, telephone, email);

        laywers.put(laywer, codeLaywer);

        return Math.toIntExact(codeLaywer);
    }

    public static int searchLawyer(){
        System.out.println("Enter a option to search the laywer:\n 1 - Code laywer \n 2 - OAB laywer \n\n");
        int option = sc.nextInt();

        switch(option){
            case 1 -> {
                System.out.println("Enter a laywer code:");
                Long laywerCode = sc.nextLong();

                if (laywers.containsKey(laywerCode)){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            case 2 -> {
                System.out.println("Enter OAB code:");
                Long oab = sc.nextLong();

                if (laywers.containsKey(oab)){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            default -> {
                println("Option no-existent.\n");
            }
        }
        return option;
    }
    public static String consultLaywer(Laywer laywer){
        searchLawyer();
        return "Data" +
                " > Code laywer=" + laywer.getCodeLaywer() + "\n" +
                " > OAB laywer=" + laywer.getOabLaywer()+ "\n" +
                " > name laywer : " + laywer.getNameLaywer() + "\n" +
                " > address : " + laywer.getAddress() +
                " > district : " + laywer.getDistrict() + "\n" +
                " > zip code : " + laywer.getZipCode() + "\n" +
                " > telephone number: " + laywer.getTelephone() + "\n" +
                " > email : " + laywer.getEmail() +
                '}';

    }
}
