package modules;

public class Utilisateur
{
    private  String first_name;
    private  String last_name;
    private int n_cin;
    private String password;

    public Utilisateur() {}

    public Utilisateur(String first_name, String last_name, int n_cin, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.n_cin = n_cin;
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getN_cin() {
        return n_cin;
    }

    public void setN_cin(int n_cin) {
        this.n_cin = n_cin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

