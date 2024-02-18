package entities.persons;

public class NaturalPerson extends Person {
    private Integer ssn;
    public NaturalPerson(Integer idPerson, String namePerson, String districtPerson, String cepPerson, String telephonePerson, String emailPerson, String password, Integer ssn) {
        super(idPerson, namePerson, districtPerson, cepPerson, telephonePerson, emailPerson, password);
        this.ssn = ssn;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }
}
