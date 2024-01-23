package entities;

public abstract class Person {
    private Long idPerson;
    private String namePerson;
    private String districtPerson;
    private String cepPerson;
    private String telephonePerson;
    private String emailPerson;

    public Person(){

    }
    public Person(Long idPerson, String namePerson, String districtPerson, String cepPerson, String telephonePerson, String emailPerson){
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.districtPerson = districtPerson;
        this.cepPerson = cepPerson;
        this.telephonePerson = telephonePerson;
        this.emailPerson = emailPerson;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
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

    public String getCepPerson() {
        return cepPerson;
    }

    public void setCepPerson(String cepPerson) {
        this.cepPerson = cepPerson;
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
}
