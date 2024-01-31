package services;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;
import utilities.Utility;

import java.util.*;

import static repositories.GenerationImplementation.generateIdPerson;
import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServicePerson {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final List<Person> persons = new ArrayList<>();
    public static void defineTypePerson(){
        System.out.println("Have you already registered in our system?\n Y/y = Yes \n N/n - Not\n");
        String option = sc.nextLine();

        switch (option.toLowerCase()){
            case "y" -> {
                System.out.println("L/l - Legal person\n N/n - Natural person\n");
                String choose = sc.nextLine();

                switch (choose.toLowerCase()){
                    case "l" -> {
                        ServiceLegal.doLoginLegalPerson();
                    }
                    case "n" -> {
                        ServiceNatural.doLoginNaturalPerson();
                    }
                    default -> {
                        println("Option no-existent.\n");
                    }
                }
            }
            case "n" -> {
                recordPerson();
            }
            default -> {
                println("Option no-existent.\n");
            }
        }
    }
    public static int recordPerson(){

        LegalPerson legalPerson = new LegalPerson();
        NaturalPerson naturalPerson = new NaturalPerson();
        println("Register persons service.\n");
        Long idPerson = (long) generateIdPerson();

        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Address:");
        String address = sc.nextLine();

        System.out.println("District:");
        String district = sc.nextLine();

        System.out.println("Cep person:");
        String cep = sc.nextLine();

        System.out.println("Telephone:");
        String telephone = sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Password:");
        String password = sc.nextLine();

        System.out.println("What´s person type?\n L/l - legal person\n N/n - natural person\n");
        String option = sc.nextLine();

        switch(option.toLowerCase()){
            case "n" -> {
                ServiceLegal.recordLegalPerson(legalPerson);
            }
            case "l" -> {
                ServiceNatural.recordNaturalPerson(naturalPerson);
            }
            default -> {
                println("Option no-existent.\n");
            }
        }
        return 1;
    }


}
