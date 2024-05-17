package echo.gemini.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;


@Entity
@Table(name = "USERRR")
@Inheritance(strategy = InheritanceType.JOINED)
public class User{
    @Id
    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    public String username;
    @Column
    private String password;
    @Column
    private String firstname;
    @Column
    private String lastname;

    @Column
    private String role;

    public User(Integer id,String username, String password, String firstname, String lastname,  String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    public User() {

    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
    public int login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            return this.id;
        }
        return 0;
    }

}