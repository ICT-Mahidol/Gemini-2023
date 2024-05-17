package th.ac.mahidol.ict.Gemini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int userID;
    private String username;
    private String password;
    private String role;

    public User() {
        super(); }
    public User(String username) {
        this.username = username;}

    //get set
    public int getUserID() {
        return userID; }
    public String getUsername() {
        return username; }
    public String getPassword() {
        return password; }
    public String getRole() {
        return role; }
    public void setUserID(int userID) {
        this.userID = userID; }
    public void setUsername(String username) {
        this.username = username; }
    public void setPassword(String password) {
        this.password = password; }
    public void setRole(String role) {
        this.role = role; }
}
