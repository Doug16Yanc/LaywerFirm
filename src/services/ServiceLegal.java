package services;

import entities.LegalPerson;

import java.util.HashMap;
import java.util.Map;

import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServiceLegal {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final Map<LegalPerson, Long> legalPersons = new HashMap<>();

    public static void doLoginLegalPerson(){
        int attempts = 3;
        println("Enter your ssn, so, you can enter with your password:\n");

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
    public static int recordLegalPerson(){
        return 1;
    }
    public static int searchLegalPerson(){
        return 1;
    }
    public static String consultLegalPerson(LegalPerson legalPerson){
        return "";
    }
}
