package services;

import entities.NaturalPerson;
import entities.Person;

import java.util.HashMap;
import java.util.Map;

public class ServiceNatural {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final Map<NaturalPerson, Long> naturalPersons = new HashMap<>();

    public static int recordNaturalPerson(){
        return 1;
    }
    public static int searchNaturalPerson(){
        return 1;
    }
    public static String consultNaturalPerson(NaturalPerson naturalPerson){
        return "";
    }
}
