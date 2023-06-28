package computer_components.basic.rom;

import computer_components.basic.ModelInformation;

public abstract class Rom extends ModelInformation {
    protected int capacityInGb;
    protected int energyInputInWatt;

    public Rom(String serialNumber, String manufacturer, int capacityInGb, int energyInputInWatt) {
        super(serialNumber, manufacturer);
        this.capacityInGb = capacityInGb;
        this.energyInputInWatt = energyInputInWatt;
    }

    public int capacityInGb() {
        return capacityInGb;
    }

    public int energyInputInWatt() {
        return energyInputInWatt;
    }
}
