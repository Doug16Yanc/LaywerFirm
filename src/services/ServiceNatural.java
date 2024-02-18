package services;

import entities.persons.NaturalPerson;

import java.util.*;

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


    public static String proofNaturalPerson(NaturalPerson naturalPerson){
        Date currentDate = new Date();
        return String.format("           NATURAL PERSON PROOF RECORD         \n" +
                "\n         > Name : " + naturalPerson.getNamePerson() +
                "\n         > Id person : " + naturalPerson.getIdPerson() +
                "\n         > SSN : " + naturalPerson.getSsn() +
                "\n          > District : " + naturalPerson.getDistrictPerson() +
                "\n          > Zip code : " + naturalPerson.getZipCode() +
                "\n          > Telephone : " + naturalPerson.getTelephonePerson() +
                "\n          > Email : " + naturalPerson.getEmailPerson() +
                "\n          > Date and hour : " + currentDate);
    }
    public static int searchNaturalPerson(){
        return 1;
    }
    public static String consultNaturalPerson(NaturalPerson naturalPerson){
        return "";
    }
}
