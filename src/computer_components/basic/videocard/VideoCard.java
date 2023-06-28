package computer_components.basic.videocard;

import computer_components.basic.ModelInformation;

public class VideoCard extends ModelInformation {
    protected int energyInputInWatt;

    public VideoCard(String serialNumber, String manufacturer, int energyInputInWatt) {
        super(serialNumber, manufacturer);
        this.energyInputInWatt = energyInputInWatt;
    }

    public int energyInputInWatt() {
        return energyInputInWatt;
    }
}
