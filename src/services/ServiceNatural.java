package services;

import entities.NaturalPerson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static repositories.GenerationImplementation.generateIdPerson;
import static utilities.Utility.println;
import static utilities.Utility.sc;

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

        Long id = (long) generateIdPerson();

        System.out.println("SSN:");
        Long ssn = sc.nextLong();

        if (naturalPersons.containsKey(ssn)) {

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

            naturalPerson = new NaturalPerson(id, name, district, zip, telephone, email, password, ssn);

            naturalPersons.computeIfAbsent(naturalPerson.getIdPerson(), k -> new ArrayList<>()).add(naturalPerson);
            naturalPersons.computeIfAbsent(naturalPerson.getSsn(), k -> new ArrayList<>()).add(naturalPerson);

        }
        else {
            println("Sorry, but this people was already registered in our system.\n");
        }
        return 1;
    }
    public static int searchNaturalPerson(){
        return 1;
    }
    public static String consultNaturalPerson(NaturalPerson naturalPerson){
        return "";
    }
}
