package echo.gemini.backend.model;

public enum Status {
    CANCELLED("The plan has been canceled"),
    COMPLETE("The plan finishes running"),
    INVALIDATED("The plan has been rejected by the science observer"),
    RUNNING("The plan is being run in OCS"),
    SAVED("The plan is saved"),
    SUBMITTED("The plan has been submitted to OCS"),
    TESTED("The plan finished testing"),
    VALIDATED("The plan has been validated by the science observer");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
