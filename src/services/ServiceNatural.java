package services;

import entities.NaturalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        naturalPersons.computeIfAbsent(naturalPerson.getIdPerson(), k -> new ArrayList<>()).add(naturalPerson);
        naturalPersons.computeIfAbsent(naturalPerson.getSsn(), k -> new ArrayList<>()).add(naturalPerson);

        return 1;
    }
    public static int searchNaturalPerson(){
        return 1;
    }
    public static String consultNaturalPerson(NaturalPerson naturalPerson){
        return "";
    }
}
