package computer_components.basic.ram.models;

import computer_components.basic.ram.Ram;

import static computer_components.basic.enums.RamType.DDR4;

public class ApacerNox extends Ram {
    public ApacerNox(){
        super(
                "AH4U08G32C28YMBAA",
                "Apacer",
                DDR4,
                32,
                20
        );
    }
}
