package entities.court;

import enumerations.CourtCostSituation;

import java.time.LocalDateTime;

public class CourtCosts {
    private LocalDateTime date;
    private String courtCostDescription;
    private double courtCostValue;

    private CourtCostSituation courtCostSituation;

    public CourtCosts(){

    }
    public CourtCosts(LocalDateTime date, String courtCostDescription, double courtCostValue, CourtCostSituation courtCostSituation){
        this.date = date;
        this.courtCostDescription = courtCostDescription;
        this.courtCostValue = courtCostValue;
        this.courtCostDescription = courtCostDescription;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCourtCostDescription() {
        return courtCostDescription;
    }

    public void setCourtCostDescription(String courtCostDescription) {
        this.courtCostDescription = courtCostDescription;
    }

    public double getCourtCostValue() {
        return courtCostValue;
    }

    public void setCourtCostValue(double courtCostValue) {
        this.courtCostValue = courtCostValue;
    }

    public CourtCostSituation getCourtCostSituation() {
        return courtCostSituation;
    }

    public void setCourtCostSituation(CourtCostSituation courtCostSituation) {
        this.courtCostSituation = courtCostSituation;
    }
}

