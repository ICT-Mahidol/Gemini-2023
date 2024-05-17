package th.ac.mahidol.ict.crystal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import th.ac.mahidol.ict.crystal.model.User;
import th.ac.mahidol.ict.crystal.service.ServiceData;

@ControllerAdvice
public class GlobalModelAttributeController {

     @Autowired
     ServiceData serviceData;

     // This method annotates the globalUser method to add the User and Login status to the Model.
     @ModelAttribute
     public void globalUser(Model model) {
          // Retrieve the User object from the serviceData and add it to the model.
          User user = serviceData.getUser();
          model.addAttribute("userData", user);
          // Retrieve the login status from the serviceData and add it to the model.
          model.addAttribute("loginStatus", serviceData.getLogin());
     }
}