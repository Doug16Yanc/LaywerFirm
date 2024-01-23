package enumerations;

public enum CourtCostSituation {
    Unpaid("UNPAID"),
    In_progress("IN PROGRESS"),

    Paid("PAID");

    private final String situation;
    CourtCostSituation(String situation) {
        this.situation = situation;
    }
    public String getSituation(){
        return situation;
    }
}
