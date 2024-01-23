package entities;

public class BossLaywer {
    private String nameLaywer;
    private String username;
    private String password;

    public BossLaywer() {
    }
    public BossLaywer(String nameLaywer, String username, String password){
        this.nameLaywer = nameLaywer;
        this.username = username;
        this.password = password;
    }

    public String getNameLaywer() {
        return nameLaywer;
    }

    public void setNameLaywer(String nameLaywer) {
        this.nameLaywer = nameLaywer;
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
