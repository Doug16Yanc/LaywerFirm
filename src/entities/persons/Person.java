package entities.persons;

public abstract class Person {
    private Integer idPerson;
    private String namePerson;
    private String districtPerson;
    private String zipCode;
    private String telephonePerson;
    private String emailPerson;
    private String password;

    public Person(Integer idPerson, String namePerson, String districtPerson, String zipCode, String telephonePerson, String emailPerson, String password){
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.districtPerson = districtPerson;
        this.zipCode = zipCode;
        this.telephonePerson = telephonePerson;
        this.emailPerson = emailPerson;
        this.password = password;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getDistrictPerson() {
        return districtPerson;
    }

    public void setDistrictPerson(String districtPerson) {
        this.districtPerson = districtPerson;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTelephonePerson() {
        return telephonePerson;
    }

    public void setTelephonePerson(String telephonePerson) {
        this.telephonePerson = telephonePerson;
    }

    public String getEmailPerson() {
        return emailPerson;
    }

    public void setEmailPerson(String emailPerson) {
        this.emailPerson = emailPerson;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
