package services;

import entities.persons.NaturalPerson;

import java.util.*;

import static utilities.Utility.*;

public class ServiceNatural {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    public static void doLoginNaturalPerson(Map<Integer, List<NaturalPerson>> naturalPersons){
        boolean naturalValidation = false;
        int attempts = 3;
        System.out.println("Enter your id: ");
        int id = sc.nextInt();

        if (naturalPersons.containsKey(id)) {
            println("Enter your ssn, so, you can enter with your password.\n" +
                    "You have only three chances.\n");

            do {
                System.out.println("SSN");
                String ssn = sc.nextLine();

                System.out.println("Password:");
                String password = sc.nextLine();

                for (NaturalPerson naturalPerson : naturalPersons.get(id)) {
                    if (naturalPerson.getSsn().equals(ssn) && naturalPerson.getPassword().equals(password)){
                        System.out.println("Login sucessfully!\n");
                        naturalValidation = true;
                    } else {
                    }
                }
                if (!naturalValidation){
                    println("SSN or password not recognized.\n");
                    attempts--;
                }
            } while (attempts > 0) ;
        }
        else {
            println("Person not found.\n");
        }
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
