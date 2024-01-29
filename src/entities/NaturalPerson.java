package entities;

public class NaturalPerson extends Person {
    private String ssn;

    public NaturalPerson() {

    }

    public NaturalPerson(Long idPerson, String namePerson, String districtPerson, String cepPerson, String telephonePerson, String emailPerson, String password, String ssn) {
        super(idPerson, namePerson, districtPerson, cepPerson, telephonePerson, emailPerson, password);
        this.ssn = ssn;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
