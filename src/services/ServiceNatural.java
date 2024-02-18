package services;

import entities.persons.NaturalPerson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utilities.Utility.*;

public class ServiceNatural {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final Map<Long, List<NaturalPerson>> naturalPersons = new HashMap<>();

    public static void doLoginNaturalPerson(){
        int attempts = 3;
        println("Enter your ssn, so, you can enter with your password.\n" +
                "You have only three chances.\n");

        do{
            System.out.println("SSN");
            String ssn = sc.nextLine();

            System.out.println("Password:");
            String password = sc.nextLine();

            if (naturalPersons.containsKey(ssn) && naturalPersons.containsKey(password)){
                System.out.println("");
            }
            else{
                println("SSN or password not recognized.\n");
            }
        } while(attempts > 0);
    }

    public static int recordNaturalPerson(NaturalPerson naturalPerson){

        System.out.println("SSN:");
        Long ssn = sc.nextLong();

        if (naturalPersons.containsKey(ssn)) {

            naturalPerson = new NaturalPerson(naturalPerson.getIdPerson(), naturalPerson.getNamePerson(), naturalPerson.getDistrictPerson(), naturalPerson.getZipCode(), naturalPerson.getTelephonePerson(), naturalPerson.getEmailPerson(), naturalPerson.getPassword(), ssn);

            naturalPersons.computeIfAbsent(naturalPerson.getIdPerson(), k -> new ArrayList<>()).add(naturalPerson);
            naturalPersons.computeIfAbsent(naturalPerson.getSsn(), k -> new ArrayList<>()).add(naturalPerson);

            proofNaturalPerson(naturalPerson);

        }
        else {
            println("Sorry, but this people was already registered in our system.\n");
        }
        return 1;
    }

    public static void proofNaturalPerson(NaturalPerson naturalPerson){
        println("           NATURAL PERSON PROOF RECORD         \n" +
                "           > Name : " + naturalPerson.getNamePerson() +
                "           > Id person : " + naturalPerson.getIdPerson() +
                "           > SSN : " + naturalPerson.getSsn() +
                "           > District : " + naturalPerson.getDistrictPerson() +
                "           > Zip code : " + naturalPerson.getZipCode() +
                "           > Telephone : " + naturalPerson.getTelephonePerson() +
                "           > Email : " + naturalPerson.getEmailPerson() +
                "           > Date and hour : " + giveHour());
    }
    public static int searchNaturalPerson(){
        return 1;
    }
    public static String consultNaturalPerson(NaturalPerson naturalPerson){
        return "";
    }
}
