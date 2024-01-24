package services;

import entities.Lawyer;
import repositories.GenerationImplementation;

import java.util.HashMap;
import java.util.Map;

import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServiceLawyer {

    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final Map<Lawyer, Long> lawyers = new HashMap<>();

    public static void doLoginLawyer(){
        println("Login");
    }
    public static int recordLawyer(){
        /*
        Utility.printMessage("Welcome to the lawyer registration page in the system. Please fill out the form" +
                " below to register as a lawyer. If you already have an account, you can log in here. " +
                "Thank you for choosing our platform.\"); */

        Long codeLawyer = (long) GenerationImplementation.generateIdLawyer();

        System.out.println("OAB laywer:");
        Long oab = sc.nextLong();

        if(!lawyers.containsKey(oab)){
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

            Lawyer lawyer = new Lawyer(codeLawyer, oab, name, address, district, zipcode, telephone, email);

            lawyers.put(lawyer, codeLawyer);
        }
        else{
            println("Sorry, but this lawyer was already registered in our system.");
        }
        return Math.toIntExact(codeLawyer);

    }

    public static int searchLawyer(){
        System.out.println("Enter a option to search the laywer:\n 1 - Code lawyer \n 2 - OAB lawyer \n\n");
        int option = sc.nextInt();

        switch(option){
            case 1 -> {
                System.out.println("Enter a lawyer code:");
                Long lawyerCode = sc.nextLong();

                if (lawyers.containsKey(lawyerCode)){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            case 2 -> {
                System.out.println("Enter OAB code:");
                Long oab = sc.nextLong();

                if (lawyers.containsKey(oab)){
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
    public static String consultLawyer(Lawyer lawyer){
        searchLawyer();
        return "Data" +
                " > Code lawyer=" + lawyer.getCodeLawyer() + "\n" +
                " > OAB lawyer=" + lawyer.getOabLawyer()+ "\n" +
                " > name lawyer : " + lawyer.getNameLawyer() + "\n" +
                " > address : " + lawyer.getAddress() +
                " > district : " + lawyer.getDistrict() + "\n" +
                " > zip code : " + lawyer.getZipCode() + "\n" +
                " > telephone number: " + lawyer.getTelephone() + "\n" +
                " > email : " + lawyer.getEmail() +
                '}';

    }
}
