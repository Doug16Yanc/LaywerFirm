package entities.court;

import java.util.List;

public class Court {
    private String denominationCourt;
    private String addressCourt;

    private List<Courtroom> courtrooms;

    public Court(){

    }
    public Court(String denominationCourt, String addressCourt, List<Courtroom> courtrooms){
        this.denominationCourt = denominationCourt;
        this.addressCourt = addressCourt;
        this.courtrooms = courtrooms;
    }

    public String getAddressCourt() {
        return addressCourt;
    }

    public void setAddressCourt(String addressCourt) {
        this.addressCourt = addressCourt;
    }

    public String getDenominationCourt() {
        return denominationCourt;
    }

    public void setDenominationCourt(String denominationCourt) {
        this.denominationCourt = denominationCourt;
    }

    public List<Courtroom> getCourtrooms() {
        return courtrooms;
    }

    public void setCourtrooms(List<Courtroom> courtrooms) {
        this.courtrooms = courtrooms;
    }
}
