package th.ac.mahidol.ict.crystal.service;

import org.springframework.stereotype.Service;

import th.ac.mahidol.ict.crystal.model.User;

@Service
public class ServiceData {
     User user;
     boolean login = false;

     public User getUser(){
          return this.user;
     }

     public void setUser(User user){
          this.user = user;
          this.setLogin();
     }

     public boolean getLogin(){
          return this.login;
     }

     public void setLogin(){
          this.login = true;
     }

     public void logOut(){
          this.user = null;
          this.login = false;
     }
    
}