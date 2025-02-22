package resources;

/**
 * Base Class Theater Entity
 */
public class Theater {
    private Long theaterId;
    private String name;
    private String location;
    private int screenCount;
    
    public Theater(Long theaterId, String name, String location, int screenCount) {
        this.theaterId = theaterId;
        this.name = name;
        this.location = location;
        this.screenCount = screenCount;
    }
    public Theater() {
    }
    public Long getTheaterId() {
        return theaterId;
    }
    public void setTheaterId(Long theaterId) {
        this.theaterId = theaterId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getScreenCount() {
        return screenCount;
    }
    public void setScreenCount(int screenCount) {
        this.screenCount = screenCount;
    }
}
