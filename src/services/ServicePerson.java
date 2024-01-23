package services;

import entities.Person;
import utilities.Utility;

import java.util.*;

import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServicePerson {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final List<Person> persons = new ArrayList<>();

    public static void defineTypePerson(){
        System.out.println("What type person will be recorded?\n L/l - Legal person \n N/n - Natural person\n");
        String option = sc.nextLine();

        switch (option.toLowerCase()){
            case "l" -> {
                ServiceLegal.recordLegalPerson();
            }
            case "n" -> {
                ServiceNatural.recordNaturalPerson();
            }
            default -> {
                println("Option no-existent.\n");
            }
        }
    }
}
