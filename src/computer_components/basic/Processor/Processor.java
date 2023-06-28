package computer_components.basic.Processor;

import computer_components.basic.ModelInformation;
import computer_components.basic.enums.RamType;
import computer_components.basic.enums.ProcessorSocket;

import java.util.List;

public abstract class Processor extends ModelInformation {
    protected ProcessorSocket   processorSocket;
    protected RamType           ramType;
    protected String            processorFamily;
    protected String            model;
    protected int               energyInputInWatt;
    protected boolean           isHaveVideoCore;

    public Processor(String serialNumber, String manufacturer, ProcessorSocket processorSocket,
                     RamType ramType, String processorFamily, String model,
                     int energyInputInWatt, boolean isHaveVideoCore) {
        super(serialNumber, manufacturer);
        this.processorSocket = processorSocket;
        this.ramType = ramType;
        this.processorFamily = processorFamily;
        this.model = model;
        this.energyInputInWatt = energyInputInWatt;
        this.isHaveVideoCore = isHaveVideoCore;
    }

    public ProcessorSocket processorSocket() {
        return processorSocket;
    }

    public RamType ramType() {
        return ramType;
    }

    public String processorFamily() {
        return processorFamily;
    }

    public String model() {
        return model;
    }

    public int energyInputInWatt() {
        return energyInputInWatt;
    }

    public boolean isHaveVideoCore() {
        return isHaveVideoCore;
    }
}
