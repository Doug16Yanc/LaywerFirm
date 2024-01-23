package enumerations;

public enum ProcessSituation {
    Open("OPEN"),
    Finished("FINISHED");

    private final String situation;

    ProcessSituation(String situation){
        this.situation = situation;
    }
    public String getSituation(){
        return situation;
    }
}
