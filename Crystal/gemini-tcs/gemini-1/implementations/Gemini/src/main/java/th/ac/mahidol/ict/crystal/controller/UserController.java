package th.ac.mahidol.ict.crystal.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import th.ac.mahidol.ict.crystal.model.User;
import th.ac.mahidol.ict.crystal.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;
import edu.gemini.app.ocs.model.SciencePlan.STATUS;

import org.springframework.validation.BindingResult;
import th.ac.mahidol.ict.crystal.service.ServiceData;

@Controller
public class UserController {

     // Instantiate OCS object
     OCS ocs = new OCS(true);

     // Inject UserRepository and ServiceData dependencies
     @Autowired
     UserRepository userRepository;

     @Autowired
     ServiceData serviceData;

     // Handle user login page
     @GetMapping("/user")
     public ModelAndView userLogin() {
          List<User> users = (List<User>) userRepository.findAll();
          return new ModelAndView("user", "users", users);
     }

     // Handle GET request for login page
     @GetMapping("/login")
     public String login(ModelMap model) {
    // Check if user is already logged in
          if (serviceData.getLogin()) {
               return "redirect:/";
          }
    // Add new User object to the model
     model.addAttribute("loginData", new User());
    // Return the "login" view
     return "login";
     }
     // Handle POST request for login page
     @PostMapping("/login")
     public String getLogin(User user, BindingResult result, RedirectAttributes attributes) {
          // Check for validation errors
          if (result.hasErrors()) {
               attributes.addFlashAttribute("error", "Error Please try again later.");
               return "redirect:/login";
          } else {
               // Check if user credentials are valid
               User u = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
               if (u != null) {
                    // Set the user in the ServiceData object and redirect to home page
                    serviceData.setUser(u);
                    return "redirect:/";
               } else {
                    // Add an error message and redirect back to login page
                    attributes.addFlashAttribute("error", "Username or Password is invalid.");
                    return "redirect:/login";
               }
          }
     }
     // Handle GET request for registration page
     @GetMapping("/register")
     public String register(ModelMap model) {
          // Check if user is already logged in
          if (serviceData.getLogin()) {
               return "redirect:/";
          }
          // Add new User object to the model
          model.addAttribute("regisData", new User());
          // Return the "register" view
          return "register";
     }
     // Handle POST request for registration page
     @PostMapping("/register")
     public String getRegister(User user, BindingResult result, RedirectAttributes attributes) {
          // Check for validation errors
          if (result.hasErrors()) {
               attributes.addFlashAttribute("error", "Error Please try again later.");
               return "redirect:/register";
          } else {
               try {
                    // Save new User object
                    userRepository.save(user);
                    // Redirect to login page
                    return "redirect:/login";
               } catch (Exception e) {
                    // Log error and add error message to flash attributes
                    System.console().writer().println(e);
                    attributes.addFlashAttribute("error", "Unable to complete registration. Please try again later.");
                    return "redirect:/register";
               }
          }
     }
     // Handle GET request for logout action
     @GetMapping("/logout")
     public String getMethodName() {
          // Clear current user session
          serviceData.logOut();
          // Redirect to login page
          return "redirect:/login";
     }
     // Handle GET request for create science plan page
     @GetMapping("/createsciplan")
     public String createsciplan(ModelMap model) {
          // Check if user is logged in
          if (!serviceData.getLogin()) {
               return "redirect:/login";
          }
          // Check user role
          String role = serviceData.getUser().getRole();
          if(!role.equals("Astronomer") ){
               return "redirect:/scienceplan";
           }
          // Add new SciencePlan and DataProcRequirement objects to the model
          model.addAttribute("sciencePlan", new SciencePlan());
          model.addAttribute("dataProc", new DataProcRequirement());
          // Return the "createsciplan" view
          return "createsciplan";
     }
     // Handle POST request for creating a new science plan
     ArrayList<SciencePlan> sciencePlans = ocs.getAllSciencePlans();
     @PostMapping("/createNewSicPlan")
     public String createNewSciPlan(String startDate, String endDate, SciencePlan sciencePlan,
               DataProcRequirement dProcRequirement, BindingResult result, RedirectAttributes attributes) {
          // Check for validation errors
          if (result.hasErrors()) {
               attributes.addFlashAttribute("error", "Error Please try again later.");
               return "redirect:/createsciplan";
          } else {
               try {
                    // Set creator name and data processing requirements
                    sciencePlan.setCreator(serviceData.getUser().getName());
                    sciencePlan.setDataProcRequirements(dProcRequirement);
                    // Create the science plan using OCS object
                    SciencePlanRepository.createSciencePlan(sciencePlan);
                    // ocs.createSciencePlan(sciencePlan);
                    // Redirect to science plan page
                    return "redirect:/scienceplan";
               } catch (Exception e) {
                    // Log error and add error message to flash attributes
                    System.console().writer().println(e);
                    attributes.addFlashAttribute("error", "Unable to create science plan. Please try again later.");
                    return "redirect:/createsciplan";
               }
          }
     }
     // Handle GET request for testing a science plan
     @GetMapping("/testSciPlan/{id}")
     public String testSciPlan(@PathVariable int id, RedirectAttributes attributes) {
          // Check if user is logged in
          if (!serviceData.getLogin()) {
               return "redirect:/login";
          }
          // Check user role
          String role = serviceData.getUser().getRole();
          if(!role.equals("Astronomer") ){
               return "redirect:/scienceplan";
          }
          // Get science plan with given ID using OCS object
          SciencePlan sciencePlan = SciencePlanRepository.getSciencePlanByNo(id);
          // Add ID and test result message to flash attributes
          attributes.addFlashAttribute("id", id);
          attributes.addFlashAttribute("msg", ocs.testSciencePlan(sciencePlan));
          // Redirect to science plan page
          return "redirect:/scienceplan";
     }
     // Handle GET request for submitting a science plan
     @GetMapping("/submitSciPlan/{id}")
     public String submitSciPlan(@PathVariable int id) {
          // Check if user is logged in
          if (!serviceData.getLogin()) {
               return "redirect:/login";
          }
          // Check user role
          String role = serviceData.getUser().getRole();
          if(!role.equals("Astronomer") ){
               return "redirect:/scienceplan";
          }
          // Get science plan with given ID using OCS object
          SciencePlan sciencePlan = SciencePlanRepository.getSciencePlanByNo(id);
          // Get submitter name
          String submitter = serviceData.getUser().getName();
          if(updateSubmitter(id, submitter)){
               ocs.submitSciencePlan(sciencePlan);
          }
          // Redirect to science plan page
          return "redirect:/scienceplan";
     }
     // Handle GET request for cancelling a science plan
     @GetMapping("/cancelSciPlan/{id}")
     public String cancelSciPlan(@PathVariable int id) {
          // Check if user is logged in
          if (!serviceData.getLogin()) {
               return "redirect:/login";
          }
          // Check user role
          String role = serviceData.getUser().getRole();
          if(!role.equals("Astronomer") ){
               return "redirect:/scienceplan";
          }
          // Update status of science plan with given ID to "Cancelled"
          ocs.updateSciencePlanStatus(id, STATUS.CANCELLED);
          // Redirect to science plan page
          return "redirect:/scienceplan";
     }
     // Add model attribute for star systems
     @ModelAttribute
     public void starSystemList(ModelMap model) {
          // Add a collection of star systems from the CONSTELLATIONS enum to the model
          model.addAttribute("starSystems", StarSystem.CONSTELLATIONS.values());
     }
     // This method updates the submitter of a science plan in the database.
     private boolean updateSubmitter(int id,String name){
          Connection conn = null;
          Statement stmt = null;
          try{
               Class.forName("org.h2.Driver");
               conn = DriverManager.getConnection("jdbc:h2:./ocs", "sa", "");
               stmt = conn.createStatement();
               String sql = " UPDATE MASSCIENCEPLAN SET SUBMITTER = '" + name + "' WHERE planNo = " + id;
               stmt.executeUpdate(sql);
               stmt.close();
               conn.close();
               SciencePlan sp = ocs.getSciencePlanByNo(id);
               if (sp == null) {
                    System.out.println("Update Submitter of '" + name + "' is unsuccessful...");
                    System.out.println("Not found planNo: " + id + "\n");
                    return false;
               }
               System.out.println("Updated Submitter of '" + name + "' successfully...\n");
               return true; 

          }catch (SQLException se){
               se.printStackTrace();
               System.out.println("Update Submitter of '" + name + "' failed...\n");
               return false;
          }catch (Exception e){
               e.printStackTrace();
               System.out.println("Update Submitter of '" + name + "' failed...\n");
               return false;
          }finally{
               try {
                    if (stmt != null)
                      stmt.close(); 
               } catch (SQLException sQLException) {}
               try {
                    if (conn != null)
                      conn.close(); 
               } catch (SQLException se) {
                    se.printStackTrace();
               } 
          }      
     }

}
