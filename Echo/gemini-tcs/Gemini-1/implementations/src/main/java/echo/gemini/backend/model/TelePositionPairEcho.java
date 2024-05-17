package echo.gemini.backend.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;


@Entity
public class TelePositionPairEcho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
    private int id;
    private double direction;
    private double degree;

//    @OneToOne
//    @JoinColumn(name = "observing_program_id")
//    private ObservingProgramEcho observingProgramEcho;
//    @JoinColumn(name = "observing_program_id")

    public TelePositionPairEcho() {
    }

    public TelePositionPairEcho(double direction, double degree) {
        this.direction = direction;
        this.degree = degree;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getDegree() {
        return degree;
    }
    public int getId(){return id;}

    public void setDegree(double degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "TelePositionPair{" +
                "direction=" + direction +
                ", degree=" + degree +
                '}';
    }

//    public void setObservingProgram(ObservingProgramEcho observingprogram) {
//        this.observingProgramEcho = observingprogram;
//    }
}