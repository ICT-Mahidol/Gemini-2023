# GEMINI-Fahrakphor

# Instruction
    - Clone this Github Repository
    - Open projec as build.gradle
    - Run Demo_Application.main() in com/example/demo/DemoApplication.java
    - Open web browser: http://localhost:8080/

#Selected use case
    - Login
    - Create a science plan
    - Test a science plan
    - Submit a science plan

# Design Pattern
    We used Singleton design pattern for our project because it enable us to ensure that a class has only one instance while providing a global access point to this instance. This design pattern prevent other objects use new operator.
    - UserController.java where the ocs is a single instance that is accessible to all clients.
    - SciencePlanController where the ocs is a single instance that is accessible to all science plans.
    
# The steps and explanations execute usecase
    - Login
        a.System requires the user to put a username.
        
        public ResponseEntity<?> loginUser(@RequestParam String username
        
        b.User type username.
        
        userInfo.put("username", user.getUsername());
        
        c.The system requires the user to put in a password.
        
        @RequestParam String password
        
        d.The user puts the password.
        user.getPassword().equals(password))
        
        e.The user clicks login
        
        f.If the system shows an incorrect password.
        S-1: Incorrect information 
        
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password!");
        
        g.Login successful
        
         return ResponseEntity.ok().body(userInfo);
        

    - Create a science plan
        a.The astronomer selects the “create science plan” button from the menu.
        
        @GetMapping("/create")
        public String redirectToCreatePage(Model model) {
        return "create";
        }
        
        b.The astronomer brought to the science plan creation page.
          
        @CrossOrigin
        @PostMapping("/createSciencePlan")
        
        c.The astronomer inputs details of the science plan such as planID,funding,creator, and etc.
        
        public String createSciencePlan(@RequestParam String submitter,
                                    @RequestParam double fundingInUSD,
                                    @RequestParam String objectives,
                                    @RequestParam StarSystem.CONSTELLATIONS starSystem,
                                    @RequestParam LocalDateTime startDate,
                                    @RequestParam LocalDateTime endDate,
                                    @RequestParam SciencePlan.TELESCOPELOC telescopeLocation,
                                    @RequestParam String fileType,
                                    @RequestParam String fileQuality,
                                    @RequestParam String colorType,
                                    @RequestParam double contrast,
                                    @RequestParam double brightness,
                                    @RequestParam double saturation,
                                    @RequestParam double highlights,
                                    @RequestParam double exposure,
                                    @RequestParam double shadows,
                                    @RequestParam double whites,
                                    @RequestParam double blacks,
                                    @RequestParam double luminance,
                                    @RequestParam double hue,
                                    @RequestParam String creator)
                                    
        d.The astronomer selected the star systems.
        
        sp.setStarSystem(starSystem);
        
        e.The astronomer inputs the requirements for the data processing such as selecting telescope location, file type, file quality, and color type options.
       
                    com.example.demo.Models.DataProcRequirement dpr = new com.example.demo.Models.DataProcRequirement();
                        dpr.setFileType(fileType);
                        dpr.setFileQuality(fileQuality);
                        dpr.setColorType(colorType);
                        dpr.setContrast(contrast);
                        dpr.setBrightness(brightness);
                        dpr.setSaturation(saturation);
                        dpr.setHighlights(highlights);
                        dpr.setExposure(exposure);
                        dpr.setShadows(shadows);
                        dpr.setWhites(whites);
                        dpr.setBlacks(blacks);
                        dpr.setLuminance(luminance);
                        dpr.setHue(hue);

                        sp.setDataProcRequirements(dpr);

        f.The astronomer clicks the submit button to create a science plan
            
            ocs.createSciencePlan(ocsSciencePlan);
            sciencePlanRepository.save(sp);
            
        g.The system shows message”science plan created”
            
            System.out.println(ocs.getAllSciencePlans());
            
    - Test a science plan   
        a.The astronomer selects the “test a science plan” button.
        
        @PostMapping("test/{planNo}")
        public @ResponseBody String testSciencePlan
        
        b.The astronomer selects the science plan to test.
        
        SciencePlan scTest = ocs.getSciencePlanByNo(planNo);
        System.out.println("Selected SciencePlan to test: " + scTest.toString());
        
        c.The astronomer tests the selected science plan.
        
        String testResult = ocs.testSciencePlan(scTest);
         
        d.The astronomer updates the status of the selected science plan.
        
        System.out.printf(testResult);
        return testResult;
          
    - Submit a scince plan 
        a.Select science plan
        
        @PostMapping("submit/{planNo}")
        public @ResponseBody String submitSciencePlan
        
        b.Check science plan
        
        String submitterName = (String) payload.get("submitter");
        System.out.println("Submitter name: " + submitterName);
        scSubmit.setSubmitter(submitterName);
        
        c.Submit science plan
        
        String submitResult = ocs.submitSciencePlan(scSubmit);
        System.out.println(submitResult);
        return submitResult;
        
        d.Wait for an approved submission :S-2: Not Approve Submit
