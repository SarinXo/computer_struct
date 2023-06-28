package computer_components.basic.Motherboard.models;

import computer_components.basic.Motherboard.Motherboard;

import static computer_components.basic.enums.ProcessorSocket.LGA_1200;
import static computer_components.basic.enums.RamType.DDR4;

public class AsRockZ690 extends Motherboard {

    public AsRockZ690(){
        super(
                "a5661ed",
                "Rock Gaming",
                LGA_1200,
                DDR4,
                128,
                100

        );
    }
}
