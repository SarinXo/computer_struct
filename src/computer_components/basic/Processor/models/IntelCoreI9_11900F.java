package computer_components.basic.Processor.models;

import computer_components.basic.Processor.Processor;

import static computer_components.basic.enums.ProcessorSocket.LGA_1200;
import static computer_components.basic.enums.RamType.DDR4;

public class IntelCoreI9_11900F extends Processor {

    public IntelCoreI9_11900F(){
        super("BX8070811900F",
                "Intel",
                LGA_1200,
                DDR4,
                "Rocket Lake",
                "Intel Core i9-11900F",
                125,
                true
        );
    }
}
