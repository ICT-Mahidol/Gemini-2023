package org.example.samyung;

import edu.gemini.app.ocs.OCS;
import edu.gemini.app.ocs.example.MySciencePlan;
import edu.gemini.app.ocs.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamyungApplication {

    public static void main(String[] args) {
        OCS ocs = new OCS();
        Date startDate = new Date(); // current date
        Date endDate = new Date(startDate.getTime() + 86400000);
        DataProcRequirement dpr1 = new DataProcRequirement(
                "JPEG", "Low", "Color mode",
                11, 10, 5, 0, 7, 0,
                0, 0, 10, 8);

        // Create a _SciencePlan object using the constructor
        _SciencePlan sciplan = new _SciencePlan(
                "Morakot Choetkiertikul", // creator
                "Submitter Morakot", // submitter
                1000, // fundingInUSD
                "To study the Auriga star system", // objectives
                StarSystem.CONSTELLATIONS.Auriga, // starSystem
                startDate, // startDate (current date)
                endDate, // endDate (current date)
                SciencePlan.TELESCOPELOC.CHILE, // telescopeLocation
                dpr1 // dataProcRequirements
        );
        sciplan.createScienePlan(ocs);
        System.out.println(ocs.getAllSciencePlans());
        SpringApplication.run(SamyungApplication.class, args);}

}
