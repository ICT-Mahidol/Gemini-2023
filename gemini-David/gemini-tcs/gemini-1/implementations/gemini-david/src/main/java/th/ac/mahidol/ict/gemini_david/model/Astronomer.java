package th.ac.mahidol.ict.gemini_david.model;

public class Astronomer extends User{
    public Astronomer(String userName, String password){
        super(userName,password);
        super.setRole("Astronomer");
    }

    public String getRole() {
        return super.getRole();
    }

}
