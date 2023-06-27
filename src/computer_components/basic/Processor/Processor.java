package computer_components.basic.Processor;

import computer_components.basic.enums.MemoryType;
import computer_components.basic.enums.PciExpress;
import computer_components.basic.enums.ProcessorSocket;

import java.util.List;

public abstract class Processor {
    protected ProcessorSocket   processorSocket;
    protected PciExpress        pciExpressController;
    protected List<MemoryType>  memoryTypes;
    protected String            processorFamily;
    protected String            model;
    protected int               numberOfCores;
    protected int               numberOfTreads;
    protected int               powerConsumptionInWatt;
    protected int               baseProcessorSpeedInGHz;
    protected int               maxTemperatureInCelsius;
    protected int               maxRamCapacityInGb;
    protected int               maxRamFrequency;
    protected boolean           isHaveVideoCore;
}
