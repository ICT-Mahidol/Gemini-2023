package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DATA_PROC_REQUIREMENTS")
@NoArgsConstructor
@Setter
@Getter
public class DataProcRequirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fileType;
    private String fileQuality;
    private String colorType;
    private Double contrast;
    private Double brightness;
    private Double saturation;
    private Double highlights;
    private Double exposure;
    private Double shadows;
    private Double whites;
    private Double blacks;
    private Double luminance;
    private Double hue;

    public DataProcRequirement(String fileType, String fileQuality, String colorType, Double contrast, Double brightness,
                               Double saturation, Double highlights, Double exposure, Double shadows, Double whites,
                               Double blacks, Double luminance, Double hue) {
        this.fileType = fileType;
        this.fileQuality = fileQuality;
        this.colorType = colorType;
        this.contrast = contrast;
        this.brightness = brightness;
        this.saturation = saturation;
        this.highlights = highlights;
        this.exposure = exposure;
        this.shadows = shadows;
        this.whites = whites;
        this.blacks = blacks;
        this.luminance = luminance;
        this.hue = hue;
    }

}
