package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Setter
@Getter
@Table(name = "data_proc_requirements")
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

    public DataProcRequirement(String fileType, String fileQuality, String colorType, Double contrast, Double brightness, Double saturation, Double highlights, Double exposure, Double shadows, Double whites, Double blacks, Double luminance, Double hue) {
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

    public DataProcRequirement() {

    }

    public String getFileType() {
        return fileType;
    }

    public String getFileQuality() {
        return fileQuality;
    }

    public String getColorType() {
        return colorType;
    }

    public Double getContrast() {
        return contrast;
    }

    public Double getBrightness() {
        return brightness;
    }

    public Double getSaturation() {
        return saturation;
    }

    public Double getHighlights() {
        return highlights;
    }

    public Double getExposure() {
        return exposure;
    }

    public Double getShadows() {
        return shadows;
    }

    public Double getWhites() {
        return whites;
    }

    public Double getBlacks() {
        return blacks;
    }

    public Double getLuminance() {
        return luminance;
    }

    public Double getHue() {
        return hue;
    }

}
