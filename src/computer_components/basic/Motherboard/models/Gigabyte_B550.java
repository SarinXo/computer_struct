package computer_components.basic.Motherboard.models;

import computer_components.basic.Motherboard.Motherboard;

import static computer_components.basic.enums.ProcessorSocket.AM4;
import static computer_components.basic.enums.RamType.DDR4;

public class Gigabyte_B550 extends Motherboard {

    public Gigabyte_B550(){
        super(
                "a123sda",
                "GIGABYTE",
                AM4,
                DDR4,
                64,
                60

        );
    }
}
