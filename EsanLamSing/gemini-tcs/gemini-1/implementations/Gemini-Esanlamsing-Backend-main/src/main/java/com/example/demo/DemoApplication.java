package com.example.demo;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem.CONSTELLATIONS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.MySciencePlanRepository;

// import com.example.demo.model.SciencePlan;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.example.demo.model.MySciencePlan;
import com.example.demo.repository.MySciencePlanRepository;

@SpringBootApplication
public  class DemoApplication {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(DemoApplication.class, args);
        OCS ocs = new OCS(true);


    //    ArrayList<SciencePlan> sciencePlans = ocs.getAllSciencePlans();
    //    for (SciencePlan sp : sciencePlans) {
    //        System.out.println(sp);
    //    }
    //     DataProcRequirement dpr = new DataProcRequirement(
    //         "PNG",
    //         "Fine",
    //         "B&W mode",
    //         3.0,
    //         0.0,
    //         0.0,
    //         10.15,
    //         5.0,
    //         7.0,
    //         10.0,
    //         0.0,
    //         0.0,
    //         0.0
    //     );
    //     SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    //     Date startDate = dateFormat.parse("15/05/2021 13:00:00");
    //     Date endDate = dateFormat.parse("15/05/2021 23:59:59");
        
    //     SciencePlan sp = new SciencePlan(
    //         "Himji Paehi",
    //         "Himji Paehi",
    //         1000.0,
    //         "To study the stars",
    //         CONSTELLATIONS.Virgo,
    //         startDate,
    //         endDate,
    //         SciencePlan.TELESCOPELOC.CHILE,
    //         dpr
    //     );
        
    //     ocs.createSciencePlan(sp);

    }

}
