package computer_components.basic.Motherboard;

import computer_components.basic.enums.MemoryType;
import computer_components.basic.enums.PciExpress;
import computer_components.basic.enums.ProcessorSocket;

public abstract class Motherboard {
    protected int               height;
    protected int               width;
    protected ProcessorSocket   processorSocket;
    protected MemoryType        memoryType;
    protected int               numberMemoryChannels;
    protected int               maxRamCapacityInGb;
    protected int               maxRamFrequency;
    protected PciExpress        pciExpressVersion;

}
