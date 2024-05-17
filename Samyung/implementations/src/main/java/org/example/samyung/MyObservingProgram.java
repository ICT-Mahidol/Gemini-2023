package org.example.samyung;
import edu.gemini.app.ocs.model.ObservingProgram;


public class MyObservingProgram extends ObservingProgram{
    private String notes;

    public MyObservingProgram() {
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}