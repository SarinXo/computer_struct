package computer_components.basic.Processor.models;

import computer_components.basic.Processor.Processor;

import static computer_components.basic.enums.ProcessorSocket.LGA_1200;
import static computer_components.basic.enums.RamType.DDR4;

public class IntelCoreI7_10700F extends Processor {

    public IntelCoreI7_10700F(){
        super("CM8070104282329",
                "Intel",
                LGA_1200,
                DDR4,
                "Comet Lake",
                "Intel Core i7-10700F",
                65,
                false
        );
    }
}
