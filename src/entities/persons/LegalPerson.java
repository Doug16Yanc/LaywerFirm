package entities.persons;

public class LegalPerson extends Person {
    private Integer ein;


    public LegalPerson(Integer idPerson, String namePerson, String districtPerson,  String zipCode, String telephonePerson, String emailPerson, String password, Integer ein) {
        super(idPerson, namePerson, districtPerson, zipCode, telephonePerson, emailPerson, password);
        this.ein = ein;
    }

    public Integer getEin() {
        return ein;
    }

    public void setEin(Integer ein) {
        this.ein = ein;
    }
}