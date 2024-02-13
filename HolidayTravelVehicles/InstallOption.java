package HolidayTravelVehicles;
import java.util.Map;
import java.util.stream.Collectors;

public class InstallOption {
    private Map<String, Integer> options;

    public InstallOption() {
    }

    public InstallOption(Map<String, Integer> options) {
        this.options = options;
    }
    
    public Map<String, Integer> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Integer> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return options.entrySet().stream()
        .map(entry -> entry.getKey() + "=" + entry.getValue())
        .collect(Collectors.joining(", ", "{", "}"));
    }
}
