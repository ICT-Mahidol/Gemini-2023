package echo.gemini.backend.model;
//import jakarta.persistence.Embeddable;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class DataProcRequirementEcho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="seq")
    @GenericGenerator(name = "seq", strategy="increment")
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

    public DataProcRequirementEcho() {
        super();
    }

//    @OneToOne
//    @JoinColumn
//    private SciencePlanEcho owner;

    public DataProcRequirementEcho(String fileType, String fileQuality, String colorType, Double contrast, Double brightness, Double saturation, Double highlights, Double exposure, Double shadows, Double whites, Double blacks, Double luminance, Double hue) {
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
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileQuality() {
        return fileQuality;
    }

    public void setFileQuality(String fileQuality) {
        this.fileQuality = fileQuality;
    }

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public Double getContrast() {
        return contrast;
    }

    public void setContrast(Double contrast) {
        this.contrast = contrast;
    }

    public Double getBrightness() {
        return brightness;
    }

    public void setBrightness(Double brightness) {
        this.brightness = brightness;
    }

    public Double getSaturation() {
        return saturation;
    }

    public void setSaturation(Double saturation) {
        this.saturation = saturation;
    }

    public Double getHighlights() {
        return highlights;
    }

    public void setHighlights(Double highlights) {
        this.highlights = highlights;
    }

    public Double getExposure() {
        return exposure;
    }

    public void setExposure(Double exposure) {
        this.exposure = exposure;
    }

    public Double getShadows() {
        return shadows;
    }

    public void setShadows(Double shadows) {
        this.shadows = shadows;
    }

    public Double getWhites() {
        return whites;
    }

    public void setWhites(Double whites) {
        this.whites = whites;
    }

    public Double getBlacks() {
        return blacks;
    }

    public void setBlacks(Double blacks) {
        this.blacks = blacks;
    }

    public Double getLuminance() {
        return luminance;
    }

    public void setLuminance(Double luminance) {
        this.luminance = luminance;
    }

    public Double getHue() {
        return hue;
    }

    public void setHue(Double hue) {
        this.hue = hue;
    }

//    public void setOwner(SciencePlanEcho owner){
//        this.owner = owner;
//    }

    @Override
    public String toString() {
        return "DataProcRequirementEcho{" +
                "blacks=" + blacks +
                ", brightness=" + brightness +
                ", colorType='" + colorType + '\'' +
                ", contrast=" + contrast +
                ", exposure=" + exposure +
                ", fileQuality='" + fileQuality + '\'' +
                ", fileType='" + fileType + '\'' +
                ", highlights=" + highlights +
                ", hue=" + hue +
                ", luminance=" + luminance +
                ", saturation=" + saturation +
                ", shadows=" + shadows +
                ", whites=" + whites +
                '}';
    }
}