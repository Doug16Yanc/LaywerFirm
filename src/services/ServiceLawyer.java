package services;

import entities.persons.Lawyer;
import repositories.GenerationImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static application.Program.doFirstInteraction;
import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServiceLawyer {

    public static final Map<Long, Boolean> idMap = new HashMap<>();

    public static final Map<Long, List<Lawyer>> lawyers = new HashMap<>();

    public static void doValidationLawyer(){
        println("Lawyer validation.\n");
        System.out.println("Have you already registered in our system?\n Y/y - Yes\n N/n - Not\n");
        String option = sc.nextLine();

        switch(option.toLowerCase()){
            case "y" -> {
                doLoginLawyer();
            }
            case "n" -> {
                recordLawyer();
            }
            default -> {
                println("Option no-existent.\n");
            }
        }
    }
    public static int recordLawyer() {
        /*
        Utility.printMessage("Welcome to the lawyer registration page in the system. Please fill out the form" +
                " below to register as a lawyer. If you already have an account, you can log in here. " +
                "Thank you for choosing our platform.\"); */

        Long codeLawyer = (long) GenerationImplementation.generateIdLawyer();

        System.out.println("OAB laywer:");
        Long oab = sc.nextLong();

        Lawyer lawyer = null;
        if (!lawyers.containsKey(codeLawyer) || !lawyers.containsKey(oab)) {
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
            System.out.println("Username:");
            String username = sc.nextLine();
            System.out.println("Password:");
            String password = sc.nextLine();

            lawyer = new Lawyer(codeLawyer, oab, name, address, district, zipcode, telephone, email, username, password);

            lawyers.computeIfAbsent(codeLawyer, k -> new ArrayList<>()).add(lawyer);
            lawyers.computeIfAbsent(oab, k -> new ArrayList<>()).add(lawyer);

        } else {
            println("Sorry, but this lawyer was already registered in our system.");
        }
        proofRecord(lawyer);
        doFirstInteraction();
        return Math.toIntExact(codeLawyer);

    }
    public static void proofRecord(Lawyer lawyer){
        println("Data\n" +
                " > Code lawyer : " + lawyer.getCodeLawyer() + "\n" +
                " > OAB lawyer : " + lawyer.getOabLawyer()+ "\n" +
                " > name lawyer : " + lawyer.getNameLawyer() + "\n" +
                " > address : " + lawyer.getAddress() + "\n" +
                " > district : " + lawyer.getDistrict() + "\n" +
                " > zip code : " + lawyer.getZipCode() + "\n" +
                " > telephone number: " + lawyer.getTelephone() + "\n" +
                " > email : " + lawyer.getEmail());
    }

    public static boolean doLoginLawyer(){
        println("Enter your code lawyer in system or oab lawyer, so, you can enter with username and password:\n");

        System.out.println("1-Code lawyer:\n2-OAB\n");
        int option = sc.nextInt();

        switch(option){
            case 1 -> {
                System.out.println("Enter code:");
                Long code = sc.nextLong();

                if (lawyers.containsKey(code)){
                    println("Code found.\n");
                    doLogin();
                }
                else{
                    println("Sorry, not found.\n");
                }
            }
            case 2 -> {
                System.out.println("Enter oab");
                Long oab = sc.nextLong();

                if (lawyers.containsKey(oab)){
                    println("Oab found.\n");
                    doLogin();
                }
                else{
                    println("Sorry, not found.\n");
                }
            }
            default -> {
                println("Option no-existent.\n");
            }
        }
        return true;
    }

    public static int doLogin() {
        int attempts = 3;
        boolean validation = false;
        Lawyer helpLawyer = null;
        println("You have only three chances.\n");
        sc.nextLine();
        do {
            System.out.println("Username:");
            String username = sc.nextLine();

            System.out.println("Password:");
            String password = sc.nextLine();

            for (List<Lawyer> lawyerList : lawyers.values()) {
                for (Lawyer lawyer : lawyerList) {
                    if (lawyer.getUsername().equals(username) && lawyer.getPassword().equals(password)) {
                        println("Login successfully!\n");
                        helpLawyer = lawyer;
                        validation = true;
                        break;
                    }
                }
                if (validation) {
                    interactesLawyer(helpLawyer);
                }
                else{
                    println("Username or recognized not recognized.\n");
                    attempts--;
                }
            }
        } while (attempts > 0) ;
        return 1;
    }
    public static void interactesLawyer(Lawyer lawyer){
        println("Welcome to your page, dearest " + lawyer.getNameLawyer() + "\n");
    }

    public static int searchLawyer(){
        System.out.println("Enter a option to search the laywer:\n 1 - Code lawyer \n 2 - OAB lawyer \n\n");
        int option = sc.nextInt();

        switch(option){
            case 1 -> {
                System.out.println("Enter a lawyer code:");
                Long lawyerCode = sc.nextLong();

                if (lawyers.containsKey(lawyerCode)){
                    List<Lawyer> lawyersList = lawyers.get(lawyerCode);
                    for (Lawyer lawyer : lawyersList){
                        println("Laywer " + lawyer.getNameLawyer() + " found.\n");
                    }
                    return 1;
                }
                else{
                    println("Sorry, not found.\n");
                    return 0;
                }
            }
            case 2 -> {
                System.out.println("Enter OAB code:");
                Long oab = sc.nextLong();

                if (lawyers.containsKey(oab)){
                    List<Lawyer> lawyersList = lawyers.get(oab);
                    for (Lawyer lawyer : lawyersList){
                        println("Laywer " + lawyer.getNameLawyer() + " found.\n");
                    }
                    return 1;
                }
                else{
                    println("Sorry, not found.\n");
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
    public static void listLawyers(Lawyer lawyer){
        if (!lawyers.isEmpty()) {

            for (Map.Entry<Long, List<Lawyer>> entry : lawyers.entrySet()) {
                println("Data" +
                        " > Code lawyer=" + lawyer.getCodeLawyer() + "\n" +
                        " > OAB lawyer=" + lawyer.getOabLawyer() + "\n" +
                        " > name lawyer : " + lawyer.getNameLawyer() + "\n" +
                        " > address : " + lawyer.getAddress() +
                        " > district : " + lawyer.getDistrict() + "\n" +
                        " > zip code : " + lawyer.getZipCode() + "\n" +
                        " > telephone number: " + lawyer.getTelephone() + "\n" +
                        " > email : " + lawyer.getEmail() +
                        '}');
            }
        }
        else {
            println("No lawyers recorded.\n");
        }
    }
}
