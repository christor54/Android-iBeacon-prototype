package nearlab.erauvisit.Data;

/**
 * Created by christophe on 11/7/2014.
 */
public class BeaconStructure {
    private String name;
    private String UUID ;
    private int major;
    private int minor;
    private double range;
    private String URL;
    private String contentText1;

    public BeaconStructure() {
    }

    public BeaconStructure(String UUID, int minor, int major, String URL) {
        this.UUID = UUID;
        this.minor = minor;
        this.major = major;
        this.URL = URL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getContentText1() {
        return contentText1;
    }

    public void setContentText1(String contentText1) {
        this.contentText1 = contentText1;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
}
