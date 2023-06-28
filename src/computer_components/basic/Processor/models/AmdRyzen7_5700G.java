package computer_components.basic.Processor.models;

import computer_components.basic.Processor.Processor;
import static computer_components.basic.enums.ProcessorSocket.AM4;
import static computer_components.basic.enums.RamType.DDR4;

public class AmdRyzen7_5700G extends Processor {

    public AmdRyzen7_5700G(){
        super("100-100000263",
                "AMD",
                AM4,
                DDR4,
                "Ryzen",
                "AMD Ryzen 7 5700G",
                65,
                true
                );
    }

}
