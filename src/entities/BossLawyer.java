package entities;

public class BossLawyer {
    private String nameLawyer;
    private String username;
    private String password;

    public BossLawyer() {
    }
    public BossLawyer(String nameLawyer, String username, String password){
        this.nameLawyer = nameLawyer;
        this.username = username;
        this.password = password;
    }

    public String getNameLawyer() {
        return nameLawyer;
    }

    public void setNameLawyer(String nameLawyer) {
        this.nameLawyer = nameLawyer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
