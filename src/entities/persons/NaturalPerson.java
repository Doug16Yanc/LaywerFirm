package entities.persons;

import entities.persons.Person;

public class NaturalPerson extends Person {
    private Long ssn;

    public NaturalPerson() {

    }

    public NaturalPerson(Long idPerson, String namePerson, String districtPerson, String cepPerson, String telephonePerson, String emailPerson, String password, Long ssn) {
        super(idPerson, namePerson, districtPerson, cepPerson, telephonePerson, emailPerson, password);
        this.ssn = ssn;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }
}
