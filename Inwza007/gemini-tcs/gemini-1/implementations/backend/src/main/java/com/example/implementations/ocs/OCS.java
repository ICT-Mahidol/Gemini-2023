package com.example.implementations.ocs;

import edu.gemini.app.ocs.model.DataProcRequirement;
import edu.gemini.app.ocs.model.SciencePlan;
import edu.gemini.app.ocs.model.StarSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class OCS extends edu.gemini.app.ocs.OCS {

    public OCS() { }

    public OCS(boolean createMockData) {
        if (createMockData) {
            this.H2GenFirstTimeDB();
            this.genFirstTimeSP();
        }

    }

    private void H2GenFirstTimeDB() {
        String JDBC_DRIVER = "org.h2.Driver";
        String DB_URL = "jdbc:h2:./ocs";
        String USER = "sa";
        String PASS = "";
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("org.h2.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection("jdbc:h2:./ocs", "sa", "");
            System.out.println("Connected database successfully...");
            System.out.println("Seeding DB....");
            stmt = conn.createStatement();
            String sql = "";
            sql = " DROP TABLE IF EXISTS masSciencePlan; ";
            stmt.executeUpdate(sql);
            sql = " DROP TABLE IF EXISTS trDataProcRequirement; ";
            stmt.executeUpdate(sql);
            sql = " DROP TABLE IF EXISTS masObservingProgram; ";
            stmt.executeUpdate(sql);
            sql = " DROP TABLE IF EXISTS masTelePositionPair; ";
            stmt.executeUpdate(sql);
            sql = " DROP TABLE IF EXISTS masUnavailableDates; ";
            stmt.executeUpdate(sql);
            sql = " DROP TABLE IF EXISTS opTable; ";
            stmt.executeUpdate(sql);
            sql = " DROP TABLE IF EXISTS masAstronomicalData; ";
            stmt.executeUpdate(sql);
            sql = " DROP TABLE IF EXISTS users; ";
            stmt.executeUpdate(sql);
            sql = " CREATE TABLE IF NOT EXISTS masSciencePlan  (planNo INT not NULL,  creator VARCHAR(100),  submitter VARCHAR(100),  fundingInUSD Double,  objectives VARCHAR(255),  starSystem VARCHAR(50),  startDate DateTime ,  endDate DateTime ,  telescopeLocation VARCHAR(50), SPStatus VARCHAR(50), PRIMARY KEY ( planNo ))";
            stmt.executeUpdate(sql);
            sql = " CREATE TABLE IF NOT EXISTS trDataProcRequirement  (planNo INT not NULL,  fileType VARCHAR(100),  fileQuality VARCHAR(100),  colorType VARCHAR(100),  contrast Double,  brightness Double,  saturation Double,  highlights Double,  exposure Double,  shadows Double,  whites Double,  blacks Double,  luminance Double,  hue Double  )";
            stmt.executeUpdate(sql);
            sql = " CREATE TABLE IF NOT EXISTS masObservingProgram  (planNo INT not NULL,  geminiLocation VARCHAR(10),  opticsPrimary VARCHAR(20),  fStop Double,  opticsSecondaryRMS Double,  scienceFoldMirrorDegree Double,  scienceFoldMirrorType VARCHAR(50),  moduleContent INT ,  calibrationUnit VARCHAR(10), lightType VARCHAR(50), PRIMARY KEY ( planNo ))";
            stmt.executeUpdate(sql);
            sql = " CREATE TABLE IF NOT EXISTS masTelePositionPair  (planNo INT not NULL,  direction Double,  degree Double )";
            stmt.executeUpdate(sql);
            sql = " CREATE TABLE IF NOT EXISTS masUnavailableDates  (id INT not NULL auto_increment,  unavailabledates Date,  PRIMARY KEY ( id ) )";
            stmt.executeUpdate(sql);
            sql = " CREATE TABLE IF NOT EXISTS opTable  (id INT not NULL auto_increment,  physicalDevice VARCHAR(255),  PRIMARY KEY ( id ) )";
            stmt.executeUpdate(sql);
            sql = " CREATE TABLE IF NOT EXISTS masAstronomicalData  (planNo INT not NULL,  seq INT,  imgURL VARCHAR(200),  )";
            stmt.executeUpdate(sql);
            sql = " CREATE TABLE IF NOT EXISTS users (user_id INT not NULL auto_increment, email VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL, name VARCHAR(100), profileImg VARCHAR(255), role VARCHAR(50) DEFAULT 'USER', PRIMARY KEY (email));\n";
            stmt.executeUpdate(sql);
            sql = " INSERT INTO masSciencePlan VALUES ( 1,'John Doe','John Doe',1000,'1. To explore Neptune.\n2. To collect astronomical data for future research.','Andromeda','2021-04-15 09:00:00','2021-04-15 10:00:00','HAWAII','SAVED' );  INSERT INTO trDataProcRequirement VALUES ( 1,'PNG','Fine','B&W mode',20,0,0,10,15,5,7,10,0,0 );  INSERT INTO masObservingProgram VALUES(1,'N','GNZ',2.4,16.0,37,'CASSEGRAIN_FOCUS' ,3,'Xenon','CerroPachonSkyEmission'); INSERT INTO masTelePositionPair VALUES(1,135,44); INSERT INTO masTelePositionPair VALUES(1,90,65); INSERT INTO masTelePositionPair VALUES(1,210,35); INSERT INTO masSciencePlan VALUES ( 2,'Jane Dunn','Andrew Griffin',2500,'1. To explore Mars.\n2. To collect astronomical data for future research.','Antlia','2021-05-15 13:00:00','2021-05-15 15:00:00','CHILE','SAVED' ); INSERT INTO trDataProcRequirement VALUES ( 2,'JPEG','Low','Color mode',11,10,5,0,7,0,0,0,10,8 ); INSERT INTO masObservingProgram VALUES(2,'S','GSZ',5.5,12.0,40,'REFLECTIVE_CONVERGING_BEAM' ,1,'Argon','MaunaKeaSkyEmission'); INSERT INTO masTelePositionPair VALUES(2,90,34); INSERT INTO masTelePositionPair VALUES(2,210,70);";
            stmt.executeUpdate(sql);
            sql = " INSERT INTO users (email, password, name, profileImg, role) VALUES ('chaiyong.r@mahidol.ac.th', 'ChaiyongR', 'Chaiyong R.', '', 'ASTRONOMER');";
            stmt.executeUpdate(sql);
            sql = " INSERT INTO users (email, password, name, profileImg, role) VALUES ('morakot.c@mahidol.ac.th', 'MorakotC', 'Morakot C.', '', 'SCIENCEOBSERVER');";
            stmt.executeUpdate(sql);

            ArrayList<String> AstrodataList = this.getAstronomicalList();
            int seq = 1;

            for(int i = 0; i < AstrodataList.size(); ++i) {
                String AstroPath = (String)AstrodataList.get(i);
                sql = "INSERT INTO masAstronomicalData VALUES(1," + seq + ",'" + AstroPath + "');";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO masAstronomicalData VALUES(2," + seq + ",'" + AstroPath + "');";
                stmt.executeUpdate(sql);
                ++seq;
            }

            stmt.close();
            conn.close();

            stmt.close();
            conn.close();
        } catch (SQLException var27) {
            var27.printStackTrace();
        } catch (Exception var28) {
            var28.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException var26) {
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException var25) {
                var25.printStackTrace();
            }

        }
        System.out.println("Seed Completed....");
        System.out.println("Goodbye!");
    }

    private void genFirstTimeSP() {
        Date startDate = new Date(); // Example: current date/time
        Date endDate = new Date(startDate.getTime() + 86400000); // Example: 1 day after start date

        OCS ocs = new OCS();

        SciencePlan plan = new SciencePlan(
                "Dr. Hubble",
                "Mr. Galileo",
                100000.00,
                "Study of Exoplanets",
                StarSystem.CONSTELLATIONS.Leo,
                startDate,
                endDate,
                SciencePlan.TELESCOPELOC.HAWAII,
                new DataProcRequirement("PNG", "Fine", "B&W mode", 5.0, 0.0, 0.0, 10.0, 15.0, 5.0, 7.0, 10.0, 0.0, 0.0));

        ocs.createSciencePlan(plan);
        System.out.println("Seed SP Completed!");
    }

    private int randNum(int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound);
    }

    private ArrayList<String> getListOfImages(String imageListFileLoc) throws IOException {
        ArrayList<String> imagePaths = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader(imageListFileLoc));

        for(String line = reader.readLine(); line != null; line = reader.readLine()) {
            imagePaths.add(line);
        }

        reader.close();
        return imagePaths;
    }

    private ArrayList<String> getAstronomicalList() throws IOException {
        int noOfImages = this.randNum(6) + 4;
        ArrayList<String> AstronomicalList = new ArrayList();
        ArrayList<String> imageList = this.getListOfImages("references" + File.separator + "images.txt");

        for(int i = 0; i < noOfImages; ++i) {
            String selectedImgLoc = (String)imageList.remove(this.randNum(imageList.size()));
            AstronomicalList.add(selectedImgLoc);
        }

        return AstronomicalList;
    }

}
