package th.ac.mahidol.ict.gemini_david.model;

public class GeminiAdmin extends User{
    public GeminiAdmin(String username, String password) {
        super(username,password);
        super.setRole("admin");
    }

    public void chengRole(User user, String role) {
        user.setRole(role);
    }
}
