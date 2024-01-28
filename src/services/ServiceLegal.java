package services;

import entities.LegalPerson;

import java.util.HashMap;
import java.util.Map;

public class ServiceLegal {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    private static final Map<LegalPerson, Long> legalPersons = new HashMap<>();

    public static void doLoginLegalPerson(){

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
