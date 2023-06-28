package computer_components.basic.ram;

import computer_components.basic.ModelInformation;
import computer_components.basic.enums.RamType;

public abstract class Ram extends ModelInformation {
    protected RamType       ramType;
    protected int           capacity;
    protected int           energyInputInWatt;

    public Ram(String serialNumber, String manufacturer, RamType ramType,
               int capacity, int energyInputInWatt) {
        super(serialNumber, manufacturer);
        this.ramType = ramType;
        this.capacity = capacity;
        this.energyInputInWatt = energyInputInWatt;
    }

    public RamType ramType() {
        return ramType;
    }

    public int capacity() {
        return capacity;
    }

    public int energyInputInWatt() {
        return energyInputInWatt;
    }
}
