package entities;

public class Courtroom {
    private String descriptionCourtroom;

    public Courtroom(){

    }
    public Courtroom(String descriptionCourtroom){
        this.descriptionCourtroom = descriptionCourtroom;
    }

    public String getDescriptionCourtroom() {
        return descriptionCourtroom;
    }

    public void setDescriptionCourtroom(String descriptionCourtroom) {
        this.descriptionCourtroom = descriptionCourtroom;
    }
}
