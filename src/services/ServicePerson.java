package services;

import entities.Person;
import utilities.Utility;

import java.util.*;

public class ServicePerson {
    static Scanner sc = new Scanner(System.in);
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final List<Person> persons = new ArrayList<>();

    public static void defineTypePerson(){
        System.out.println("What type person will be recorded?\n L/l - Legal person \n N/n - Natural person\n");
        String option = sc.nextLine();

        switch (option){
            case "l" -> {
                ServiceLegal.recordLegalPerson();
            }
            case "n" -> {
                ServiceNatural.recordNaturalPerson();
            }
            default -> {
                Utility.printMessage("Option no-existent.\n");
            }
        }
    }
}
