package repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerationImplementation implements Generation {
    private static final Map<Long, Boolean> idMap = new HashMap<>();

    public static int generateIdLawyer(){
        Random random = new Random();
        Long enter;

        do {
            enter = (long) (random.nextInt(1000) + 100000);
        } while (idMap.containsKey(enter));

        idMap.put(enter, true);
        return Math.toIntExact(enter);
    }
    public static int generateIdPerson() {
        Random random = new Random();
        Long enter;

        do {
            enter = (long) (random.nextInt(1000) + 100000);
        } while (idMap.containsKey(enter));

        idMap.put(enter, true);
        return Math.toIntExact(enter);
    }
    public static int generateIdProcess(){
        Random random = new Random();
        Long enter;

        do {
            enter = (long) (random.nextInt(10000) + 100000000);
        } while (idMap.containsKey(enter));

        idMap.put(enter, true);
        return Math.toIntExact(enter);
    }
}
