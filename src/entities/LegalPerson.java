package entities;

public class LegalPerson extends Person {
    private Long ein;

    public LegalPerson() {

    }

    public LegalPerson(Long idPerson, String namePerson, String districtPerson, String cepPerson, String telephonePerson, String emailPerson, String password, Long ein) {
        super(idPerson, namePerson, districtPerson, cepPerson, telephonePerson, emailPerson, password);
        this.ein = ein;
    }

    public Long getEin() {
        return ein;
    }

    public void setEin(Long ein) {
        this.ein = ein;
    }
}