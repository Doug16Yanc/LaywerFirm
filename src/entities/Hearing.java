package entities;

import java.time.LocalDateTime;

public class Hearing {
    private LocalDateTime dateHearing;
    private String reportHearing;

    public Hearing(){

    }
    public Hearing(LocalDateTime dateHearing, String reportHearing){
        this.dateHearing = dateHearing;
        this.reportHearing = reportHearing;
    }

    public LocalDateTime getDateHearing() {
        return dateHearing;
    }

    public void setDateHearing(LocalDateTime dateHearing) {
        this.dateHearing = dateHearing;
    }

    public String getReportHearing() {
        return reportHearing;
    }

    public void setReportHearing(String reportHearing) {
        this.reportHearing = reportHearing;
    }
}
