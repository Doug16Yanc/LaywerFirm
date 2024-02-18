package services;

import entities.persons.LegalPerson;

import java.util.*;

import static utilities.Utility.*;

public class ServiceLegal {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    public static void doLoginLegalPerson(){
        int attempts = 3;
        println("Enter your ssn, so, you can enter with your password:\n" +
                "You have only three chances.\n");

        do{
            System.out.println("SSN");
            String ssn = sc.nextLine();

            System.out.println("Password:");
            String password = sc.nextLine();
        } while(attempts > 0);

    }

    public static String proofLegalRecord(LegalPerson legalPerson){
        Date currentDate = new Date();
        return String.format("           LEGAL PERSON PROOF RECORD           \n" +
                "\n         > Name : " + legalPerson.getNamePerson() +
                "\n         > Id person : " + legalPerson.getIdPerson() +
                "\n         > EIN : " + legalPerson.getEin() +
                "\n         > District : " + legalPerson.getDistrictPerson() +
                "\n         > Zip code : " + legalPerson.getZipCode() +
                "\n         > Telephone : " + legalPerson.getTelephonePerson() +
                "\n         > Email : " + legalPerson.getEmailPerson() +
                "\n         > Date and hour : " + currentDate);
    }
    public static int searchLegalPerson(){

        System.out.println("Enter id person: ");
        int id = sc.nextInt();
        return 1;
    }
    public static String consultLegalPerson(LegalPerson legalPerson){
        return "";
    }
}
