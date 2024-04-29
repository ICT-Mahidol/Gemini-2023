package org.example.samyung;
import edu.gemini.app.ocs.OCS;

public class User
{
    public int userID;
    private String username;
    private String password;
    private String roles;
    private int accessLevel;

    public User(int userID, String username, String password, String roles, int accessLevel) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.accessLevel = accessLevel;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public int getAccessLevel() {
        return this.accessLevel;
    }


}
