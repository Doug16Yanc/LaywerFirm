package entities;

import java.util.Objects;

public class Laywer {
    private Long codeLaywer;
    private Long oabLaywer;
    private String nameLaywer;
    private String address;
    private String district;
    private String zipCode;
    private String telephone;
    private String email;

    public Laywer() {
    }
    public Laywer(Long codeLawyer, Long oabLaywer, String nameLaywer, String address, String district, String zipCode, String telephone, String email){
        this.codeLaywer = codeLaywer;
        this.oabLaywer = oabLaywer;
        this.nameLaywer = nameLaywer;
        this.address = address;
        this.district = district;
        this.zipCode = zipCode;
        this.telephone = telephone;
        this.email = email;
    }

    public Long getCodeLaywer() {
        return codeLaywer;
    }

    public void setCodeLaywer(Long codeLaywer) {
        this.codeLaywer = codeLaywer;
    }

    public Long getOabLaywer() {
        return oabLaywer;
    }

    public void setOabLaywer(Long oabLaywer) {
        this.oabLaywer = oabLaywer;
    }

    public String getNameLaywer() {
        return nameLaywer;
    }

    public void setNameLaywer(String nameLaywer) {
        this.nameLaywer = nameLaywer;
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

}
