package computer_components.basic.cooler;

import computer_components.basic.enums.ProcessorSocket;

public abstract class ProcessorCooler {
    protected ProcessorSocket processorSocket;
    protected int             coolerHeight;
    protected int             powerDissipationInWatt;
}
