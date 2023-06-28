package computer_components.basic.Processor.models;

import computer_components.basic.Processor.Processor;

import static computer_components.basic.enums.ProcessorSocket.AM5;
import static computer_components.basic.enums.RamType.DDR5;

public class AmdRyzen9_7900X extends Processor {
    public AmdRyzen9_7900X(){
        super("100-100000589",
                "AMD",
                AM5,
                DDR5,
                "Ryzen",
                "AMD Ryzen 9 7900X",
                170,
                true
        );
    }
}
