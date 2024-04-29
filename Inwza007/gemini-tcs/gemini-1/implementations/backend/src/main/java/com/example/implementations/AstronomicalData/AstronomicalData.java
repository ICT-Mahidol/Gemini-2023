package com.example.implementations.AstronomicalData;


import java.io.IOException;
import java.util.ArrayList;

public class AstronomicalData {
    private String imageUrl;

    public AstronomicalData() {}

    public ArrayList<String> getAstronomicalDataLinks() throws IOException {
        edu.gemini.app.ocs.model.AstronomicalData a = new edu.gemini.app.ocs.model.AstronomicalData();
        return a.getAstronomicalDataLinks();
    }
}
