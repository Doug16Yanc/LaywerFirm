package services;

import entities.persons.LegalPerson;
import entities.persons.NaturalPerson;
import entities.persons.Person;

import java.util.*;

import static application.Program.doFirstInteraction;
import static repositories.GenerationImplementation.generateIdPerson;
import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServicePerson {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final List<Person> persons = new ArrayList<>();
    public static void defineTypePerson(){
        Map<Integer, List<NaturalPerson>> naturalPersons = new HashMap<>();
        Map<Integer, List<LegalPerson>> legalPersons = new HashMap<>();
        System.out.println("Have you already registered in our system?\n Y/y = Yes \n N/n - Not\n");
        String option = sc.nextLine();

        switch (option.toLowerCase()){
            case "y" -> {
                System.out.println("L/l - Legal person\n N/n - Natural person\n");
                String choose = sc.nextLine();

                switch (choose.toLowerCase()){
                    case "l" -> {
                        ServiceLegal.doLoginLegalPerson(legalPersons);
                    }
                    case "n" -> {
                        ServiceNatural.doLoginNaturalPerson(naturalPersons);
                    }
                    default -> {
                        println("Option no-existent.\n");
                    }
                }
            }
            case "n" -> {
                recordPerson(naturalPersons, legalPersons);
            }
            default -> {
                println("Option no-existent.\n");
            }
        }
    }
    public static int recordPerson(Map<Integer, List<NaturalPerson>> naturalPersons, Map<Integer, List<LegalPerson>> legalPersons){

        println("Register persons service.\n");
        int idPerson =  generateIdPerson();


        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("District:");
        String district = sc.nextLine();

        System.out.println("Zip Code:");
        String zipCode = sc.nextLine();

        System.out.println("Telephone:");
        String telephone = sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Password:");
        String password = sc.nextLine();

        System.out.println("What´s person type?\n L/l - legal person\n N/n - natural person\n");
        String option = sc.nextLine();

        switch(option.toLowerCase()){
            case "l" -> {
                System.out.println("EIN:");
                Integer ein = sc.nextInt();

                LegalPerson legalPerson = new LegalPerson(idPerson, name, district, zipCode, telephone, email, password, ein);
                legalPersons.put(legalPerson.getIdPerson(), Collections.singletonList(legalPerson));
                legalPersons.put(ein,Collections.singletonList(legalPerson));
                println(ServiceLegal.proofLegalRecord(legalPerson));

            }
            case "n" -> {
                System.out.println("SSN:");
                Integer ssn = sc.nextInt();

                NaturalPerson naturalPerson = new NaturalPerson(idPerson, name, district, zipCode, telephone, email, password, ssn);
                naturalPersons.put(naturalPerson.getIdPerson(), Collections.singletonList(naturalPerson));
                naturalPersons.put(ssn, Collections.singletonList(naturalPerson));
                println(ServiceNatural.proofNaturalPerson(naturalPerson));
            }
            default -> {
                println("Option no-existent.\n");
            }
        }
        doFirstInteraction();
        return 1;
    }


}
