package services;

import entities.LegalPerson;
import entities.NaturalPerson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static repositories.GenerationImplementation.generateIdPerson;
import static utilities.Utility.*;

public class ServiceLegal {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final Map<Long, List<LegalPerson>> legalPersons = new HashMap<>();

    public static void doLoginLegalPerson(){
        int attempts = 3;
        println("Enter your ssn, so, you can enter with your password:\n" +
                "You have only three chances.\n");

        do{
            System.out.println("SSN");
            String ssn = sc.nextLine();

            System.out.println("Password:");
            String password = sc.nextLine();

            if (legalPersons.containsKey(ssn) && legalPersons.containsKey(password)){
                System.out.println("");
            }
            else{
                println("SSN or password not recognized.\n");
            }
        } while(attempts > 0);

    }
    public static int recordLegalPerson(LegalPerson legalPerson){
        Long id = (long) generateIdPerson();

        System.out.println("EIN:");
        Long ein = sc.nextLong();

        if (legalPersons.containsKey(ein)) {

            System.out.println("Name:");
            String name = sc.nextLine();

            System.out.println("District:");
            String district = sc.nextLine();

            System.out.println("Zip code:");
            String zip = sc.nextLine();

            System.out.println("Telephone:");
            String telephone = sc.nextLine();

            System.out.println("Email:");
            String email = sc.nextLine();

            System.out.println("Password:");
            String password = sc.nextLine();

            legalPerson = new LegalPerson(id, name, district, zip, telephone, email, password, ein);

            legalPersons.computeIfAbsent(legalPerson.getIdPerson(), k -> new ArrayList<>()).add(legalPerson);
            legalPersons.computeIfAbsent(legalPerson.getEin(), k -> new ArrayList<>()).add(legalPerson);

            proofLegalRecord(legalPerson);
        }
        else {
            println("Sorry, but this people was already registered in our system.\n");
        }
        return 1;
    }

    public static void proofLegalRecord(LegalPerson legalPerson){
        println("           LEGAL PERSON PROOF RECORD           \n" +
                "           > Name : " + legalPerson.getNamePerson() +
                "           > Id person : " + legalPerson.getIdPerson() +
                "           > EIN : " + legalPerson.getEin() +
                "           > District : " + legalPerson.getDistrictPerson() +
                "           > Zip code : " + legalPerson.getZipCode() +
                "           > Telephone : " + legalPerson.getTelephonePerson() +
                "           > Email : " + legalPerson.getEmailPerson() +
                "           > Date and hour : " + giveHour());
    }
    public static int searchLegalPerson(){
        return 1;
    }
    public static String consultLegalPerson(LegalPerson legalPerson){
        return "";
    }
}
