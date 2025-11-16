 package pekan7_2511533029;

public class Akun_2511533029 {

	private String Username;
    private String Password;
    private String Email;
    private int PinAngka;

    public void setUsername(String username) {
        this.Username = username;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public void setPinAngka(int pinAngka) {
        this.PinAngka = pinAngka;
    }
    public String getUsername() {
        return Username;
    }
    public String getPassword() {
        return Password;
    }
    public String getEmail() {
        return Email;
    }
    public int getPinAngka() {
        return PinAngka;
    }
    public boolean isPasswordValid() {
        return Password.length() >= 8;
    }
    public boolean isEmailValid() {
        return Email.contains("@") && Email.contains(".");
    }
}