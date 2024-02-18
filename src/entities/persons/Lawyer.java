package entities.persons;

public class Lawyer {
    private Long codeLawyer;
    private Long oabLawyer;
    private String nameLawyer;
    private String address;
    private String district;
    private String zipCode;
    private String telephone;
    private String email;

    private String username;
    private String password;

    public Lawyer() {
    }
    public Lawyer(Long codeLawyer, Long oabLawyer, String nameLawyer, String address, String district, String zipCode, String telephone, String email, String username, String password){
        this.codeLawyer = codeLawyer;
        this.oabLawyer = oabLawyer;
        this.nameLawyer = nameLawyer;
        this.address = address;
        this.district = district;
        this.zipCode = zipCode;
        this.telephone = telephone;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Long getCodeLawyer() {
        return codeLawyer;
    }

    public void setCodeLawyer(Long codeLawyer) {
        this.codeLawyer = codeLawyer;
    }

    public Long getOabLawyer() {
        return oabLawyer;
    }

    public void setOabLawyer(Long oabLawyer) {
        this.oabLawyer = oabLawyer;
    }

    public String getNameLawyer() {
        return nameLawyer;
    }

    public void setNameLawyer(String nameLawyer) {
        this.nameLawyer = nameLawyer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername(){return username;}

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
