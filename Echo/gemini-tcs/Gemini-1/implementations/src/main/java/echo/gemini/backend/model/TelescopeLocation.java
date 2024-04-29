package echo.gemini.backend.model;

public enum TelescopeLocation {
    CHILE("The Chile Gemini observatory (South)"),
    HAWAII("The Hawaii Gemini observatory (North)");

    private final String description;

    TelescopeLocation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
