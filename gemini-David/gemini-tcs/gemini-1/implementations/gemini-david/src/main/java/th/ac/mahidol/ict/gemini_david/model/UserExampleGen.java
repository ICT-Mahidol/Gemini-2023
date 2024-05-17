package th.ac.mahidol.ict.gemini_david.model;

import th.ac.mahidol.ict.gemini_david.model.Astronomer;
import java.util.ArrayList;

public class UserExampleGen {
    public UserExampleGen() {}
    public ArrayList<User> generateUsers() {
        ArrayList<User> users = new ArrayList<>();
        Astronomer astronomer = new Astronomer("test","test");
        GeminiAdmin geminiAdmin = new GeminiAdmin("admin","1234");
        users.add(astronomer);
        users.add(geminiAdmin);
        return users;
    }
}
