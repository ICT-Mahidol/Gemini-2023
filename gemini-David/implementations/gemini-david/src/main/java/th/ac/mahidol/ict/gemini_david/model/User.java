package th.ac.mahidol.ict.gemini_david.model;

public class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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

    protected void setRole(String role) {
        this.role = role;
    }
    protected String getRole() {
        return role;
    }
}


