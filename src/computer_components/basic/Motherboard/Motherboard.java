package computer_components.basic.Motherboard;

import computer_components.basic.ModelInformation;
import computer_components.basic.enums.RamType;
import computer_components.basic.enums.ProcessorSocket;

public abstract class Motherboard extends ModelInformation {
    protected ProcessorSocket   processorSocket;
    protected RamType           ramType;
    protected int               maxRamCapacityInGb;
    protected int               energyInputInWatt;

    public Motherboard(String serialNumber, String manufacturer,
                       ProcessorSocket processorSocket, RamType ramType,
                       int maxRamCapacityInGb, int energyInputInWatt) {
        super(serialNumber, manufacturer);
        this.processorSocket = processorSocket;
        this.ramType = ramType;
        this.maxRamCapacityInGb = maxRamCapacityInGb;
        this.energyInputInWatt = energyInputInWatt;
    }

    public ProcessorSocket processorSocket() {
        return processorSocket;
    }

    public RamType ramType() {
        return ramType;
    }

    public int maxRamCapacityInGb() {
        return maxRamCapacityInGb;
    }

    public int energyInputInWatt() {
        return energyInputInWatt;
    }
}
