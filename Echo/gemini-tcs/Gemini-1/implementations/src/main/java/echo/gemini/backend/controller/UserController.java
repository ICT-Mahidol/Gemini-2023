package echo.gemini.backend.controller;

import echo.gemini.backend.model.Astronomer;
import echo.gemini.backend.model.Observer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import echo.gemini.backend.model.User;
import echo.gemini.backend.repository.UserRepository;

import java.util.*;
import java.util.stream.Collectors;

@Controller
//@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @GetMapping("/")
    public String login() {
        return "login";
    }


//    @CrossOrigin
//    @GetMapping("/test")
//    public ResponseEntity<String> Testpath() {
//        return ResponseEntity.ok("Hello from observing programs");
//    }

    @CrossOrigin
    @PostMapping("login")
    public @ResponseBody
    int login(@RequestParam(value = "username") String username,
              @RequestParam(value = "password") String password) {
        System.out.println(username + password);
        for (User u : userRepository.findAll()) {
            if (u.username.equals(username)) {
                return u.login(username, password);
            }
        }
        return 0;
    }

    @CrossOrigin
    @GetMapping("/getRole")
    public @ResponseBody Map<String, String> getUserRole(@RequestParam(value = "id") int id) {
        User user = userRepository.findById(id).get();
        System.out.println(user.getRole());
        Map<String, String> response = new HashMap<>();
        response.put("role", user.getRole());
        return response;
    }


    @CrossOrigin
    @GetMapping("/users")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }


    @CrossOrigin
    @PostMapping("register")
    public @ResponseBody int register(@RequestBody Map<String, Object> body) {
        String username = body.get("username").toString();
        if (userRepository.findByUsername(username) != null) {
            return 0; // Username already exists
        }

        User newuser = registerUser(body);
        userRepository.save(newuser);
        return 1;
    }

    public User registerUser(Map<String, Object> body) {
        Integer id = (int) (userRepository.count() + 1);
        String username = body.get("username").toString();
        String role = body.get("role").toString();
        String firstname = body.get("firstname").toString();
        String lastname = body.get("lastname").toString();
        String password = body.get("password").toString();

        if (role.equals("Astronomer")) {
            String institution = body.get("institution").toString();
            String academicDegree = body.get("academicDegree").toString();
            Astronomer newAstronomer = new Astronomer(id, username, password, firstname, lastname, role, institution, academicDegree);
            System.out.println(newAstronomer);
            return newAstronomer;
        } else {
            String academicDegree = body.get("academicDegree").toString();
            String employmentDate = body.get("employmentDate").toString();
            double salary = Double.parseDouble(body.get("salary").toString());
            Observer newObserver = new Observer(id, username, password, firstname, lastname, role, academicDegree, employmentDate, salary);
            System.out.println(newObserver);
            return newObserver;
        }
    }

//    @CrossOrigin
//    @GetMapping("/astronomers")
//    public @ResponseBody Iterable<User> getAstronomers() {
//        List<User> astronomers = new ArrayList<>();
//        userRepository.findAll().forEach(astronomers::add);
//        return astronomers.stream()
//                .filter(user -> user.getRole().equals("Astronomer"))
//                .collect(Collectors.toList());
//    }

    //    @CrossOrigin
//    @GetMapping(value = {"/astronomers"})
//    public List<Astronomer> getAstronomers() {
//        Iterable<Astronomer> astronomers = userRepository.findAllByRole("Astronomer");
//        List<Astronomer> astronomerList = new ArrayList<>();
//        astronomers.forEach(astronomerList::add);
//        return astronomerList;
//    }
//    @CrossOrigin
//    @GetMapping("/astronomers")
//    public @ResponseBody Iterable<User> getAstronomers() {
//        List<Integer> astronomerIds =  new ArrayList<>();
//        Set<User> astronomers = new HashSet<>();
//        for (User user : userRepository.findAll()) {
//            if (user.getRole().equals("Astronomer")) {
//                astronomerIds.add(user.getId());
//                System.out.println(astronomerIds);
//                astronomers.add(user);
//            }
//        }
//        System.out.println("Number of astronomers: " + astronomers.size());
//        return astronomers;
//    }
//    @CrossOrigin
//    @GetMapping("/astronomerIds")
//    public @ResponseBody List<Integer> getAstronomers() {
//        List<Integer> astronomerIds =  new ArrayList<>();
//        for (User user : userRepository.findAll()) {
//            if (user.getRole().equals("Astronomer")) {
//                astronomerIds.add(user.getId());
//                System.out.println(astronomerIds);
//            }
//        }
//        return astronomerIds;
//    }
    @CrossOrigin
    @GetMapping("/astronomers")
    public @ResponseBody Map<Integer, String> getAstronomers() {
        Map<Integer, String> astronomerNames = new HashMap<>();
        for (User user : userRepository.findAll()) {
            if (user.getRole().equals("Astronomer")) {
                astronomerNames.put(user.getId(), user.getUsername());
                System.out.println("ID: " + user.getId() + ", Username: " + user.getUsername());
            }
        }
        return astronomerNames;
    }

    @CrossOrigin
    @GetMapping("/observers")
    public @ResponseBody Iterable<User> getObservers() {
        List<User> observers = new ArrayList<>();
        userRepository.findAll().forEach(observers::add);
        return observers.stream()
                .filter(user -> user.getRole().equals("ScienceObserver"))
                .collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/usersname")
    public @ResponseBody String getUser(@RequestParam(value = "id") int id) {
        User user = (User) userRepository.findById(id).get();
        //System.out.println(user.getUsername());
        return user.getUsername();
    }

    @CrossOrigin
    @GetMapping("/astronomer")
    public String getAstronomer() {
        return "astronomer_homepage";
    }

    @CrossOrigin
    @GetMapping("/observer")
    public String getObserver() {
        return "observer_homepage";
    }

    @CrossOrigin
    @GetMapping("/observingprogram")
    public String getObservingprogram() {
        return "observingprogram";
    }
//
//    @CrossOrigin
//    @GetMapping("/observer")
//    public String observer(){
//        return "observer"  ;
//    }
//
//    @CrossOrigin
//    @GetMapping("/create_scienceplan")
//    public String create_scienceplan(){
//        return "createscienceplan"  ;
//    }
//

    //    @CrossOrigin
//    @GetMapping("/username")
//    public @ResponseBody String getUser(@RequestParam(value = "id") int id){
//        User user = (User) userRepository.findById(id).get();
//        return user.getUsername();
//    }
//    @CrossOrigin
//    @GetMapping("/getrole")
//    public @ResponseBody Integer getUserPermission(@RequestParam(value = "id") int id){
//        User user = (User) userRepository.findById(id).get();
//        System.out.println(user.getRole());
//        if(user.getRole().equals("Astronomer")) return 1;
//        return 2;
//    }
//
//
////    public @ResponseBody Iterable<User> getAllUsers() {
////        return userRepository.findAll();
////    }
//
////    @CrossOrigin
////    @GetMapping("/id")
////    @ResponseBody
////    public int getID() {
////        return userRepository.getID();
////    }
//
//    @CrossOrigin
//    @PostMapping("/adduser")
//    public  @ResponseBody int addUser(@RequestBody String username, String password, String firstname, String lastname, int id, String role) {
//        System.out.println(String.format("%s %s %s %s %d %s" ,username, password, firstname, lastname, id, role));
//        User newuser = new User(username, password, firstname, lastname,id, role);
//
//        for(User user: userRepository.findAll()) {
//            if(user.username.equals(newuser.username)) return 0;
//        }
//        userRepository.save(newuser);
//
//        return 1;
//    }
//

//
//    @CrossOrigin
//    @GetMapping("/validate")
//    @ResponseBody
//    public boolean validateUsernameAndPassword(@RequestParam String username, @RequestParam String password) {
//        return !username.isEmpty() && !password.isEmpty();
//    }
//

}