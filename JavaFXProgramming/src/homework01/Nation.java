package homework01;

public class Nation {
    private String flagImage;
    private String flagName;
    private String nationName;

    public Nation() {
    }

    public Nation(String flagImage, String flagName, String nationName) {
        this.flagImage = flagImage;
        this.flagName = flagName;
        this.nationName = nationName;
    }

    public String getFlagImage() {
        return flagImage;
    }

    public void setFlagImage(String flagImage) {
        this.flagImage = flagImage;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }
    
}
